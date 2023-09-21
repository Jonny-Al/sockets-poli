package com.poli.socket.application.usecasedb.impl;

import com.poli.socket.application.usecasedb.IUseCaseCiudadService;
import com.poli.socket.infrastructure.driveradapter.entity.Ciudad;
import com.poli.socket.infrastructure.driveradapter.repository.ICiudadRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UseCaseCiudadService implements IUseCaseCiudadService {

    private static final Logger logger = LoggerFactory.getLogger(UseCasePersonaService.class);

    @Autowired
    ICiudadRepository ciudadRepository;

    @Override
    public Ciudad getCiudadById(long id) {
        logger.info("* getCiudadById(id)");
        Optional<Ciudad> entity = ciudadRepository.findById(id);
        return (entity.isPresent()) ? entity.get() : null;
    }
}
