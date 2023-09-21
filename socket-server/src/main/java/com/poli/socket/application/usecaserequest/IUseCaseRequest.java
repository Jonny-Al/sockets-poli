package com.poli.socket.application.usecaserequest;

import com.poli.socket.domain.dto.in.UserRequest;
import com.poli.socket.domain.dto.out.UserResponse;

public interface IUseCaseRequest {

    UserResponse managerRequest(UserRequest userRequest);

}
