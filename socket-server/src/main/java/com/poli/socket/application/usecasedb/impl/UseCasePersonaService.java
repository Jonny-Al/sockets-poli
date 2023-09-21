package com.poli.socket.application.usecasedb.impl;

import com.poli.socket.application.usecasedb.IUseCasePersonaService;
import com.poli.socket.infrastructure.driveradapter.entity.Personas;
import com.poli.socket.infrastructure.driveradapter.repository.IPersonasRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UseCasePersonaService implements IUseCasePersonaService {

    private static final Logger logger = LoggerFactory.getLogger(UseCasePersonaService.class);

    @Autowired
    IPersonasRepository personasRepository;

    @Override
    public Personas getPersonByDirTel(String tel) {
        logger.info("* getPersonByDirTel(Telefono)");
        return personasRepository.findByPersonByDirTel(tel);
    }
}
