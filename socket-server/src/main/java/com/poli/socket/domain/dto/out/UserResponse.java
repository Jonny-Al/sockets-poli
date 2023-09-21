package com.poli.socket.domain.dto.out;

import com.poli.socket.domain.dto.in.UserRequest;

public class UserResponse extends UserRequest {

    public UserResponse(String dirTel, String dirNombre, String dirDireccion, Long dirCiud_id) {
        this.setDirtel(dirTel);
        this.setDirnombre(dirNombre);
        this.setDirdireccion(dirDireccion);

    }

}
