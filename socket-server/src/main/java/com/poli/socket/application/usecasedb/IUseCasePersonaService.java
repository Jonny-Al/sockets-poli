package com.poli.socket.application.usecasedb;


import com.poli.socket.infrastructure.driveradapter.entity.Personas;

public interface IUseCasePersonaService {

    Personas getPersonByDirTel(String tel);

}
