package com.poli.socket.application.usecaserequest.impl;

import com.poli.socket.application.usecasedb.IUseCaseCiudadService;
import com.poli.socket.application.usecasedb.IUseCasePersonaService;
import com.poli.socket.application.usecaserequest.IUseCaseRequest;
import com.poli.socket.domain.dto.in.UserRequest;
import com.poli.socket.domain.dto.out.UserResponse;
import com.poli.socket.infrastructure.driveradapter.entity.Ciudad;
import com.poli.socket.infrastructure.driveradapter.entity.Personas;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseCaseRequestService implements IUseCaseRequest {

    private static final Logger logger = LoggerFactory.getLogger(UseCaseRequestService.class);

    @Autowired
    IUseCasePersonaService useCasePersonaService;

    @Autowired
    IUseCaseCiudadService useCaseCiudadService;

    @Override
    public UserResponse managerRequest(UserRequest userRequest) {
        logger.info("* managerRequest(UserRequest)");
        if (userRequest.getDirtel() != null) {
            Personas entiy = useCasePersonaService.getPersonByDirTel(userRequest.getDirtel());
            if (entiy != null) {
                Ciudad ciudad = useCaseCiudadService.getCiudadById(entiy.getDirCiud_id());
                if (ciudad != null) {
                    UserResponse userResponse = new UserResponse(entiy.getDirTel(), entiy.getDirNombre(), entiy.getDirDireccion(), entiy.getDirCiud_id());
                    userResponse.setDirciudid(ciudad.getCiudNombre());
                    return userResponse;
                }
            }
        }
        return null;
    }
}
