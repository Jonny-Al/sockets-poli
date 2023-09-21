package com.poli.socket.infrastructure.entrypoint;

import com.poli.socket.application.usecaserequest.IUseCaseRequest;
import com.poli.socket.domain.dto.in.UserRequest;
import com.poli.socket.domain.dto.out.UserResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    IUseCaseRequest useCaseRequest;

    private final String responseNull = "Persona dueña de ese número telefónico no existe";

    @MessageMapping ("/usuario")
    public Object requestGetUser(UserRequest userRequest) {
        logger.info("Request socket client: {}", userRequest.toString());
        UserResponse userResponse = useCaseRequest.managerRequest(userRequest);
        if (userResponse != null) {
            logger.info("Response: {}:", userResponse);
            return userResponse;
        } else {
            logger.info("Response: {}:", responseNull);
            return responseNull;
        }
    }

}
