package com.poli.socket.infrastructure.driveradapter.repository;

import com.poli.socket.infrastructure.driveradapter.entity.Ciudad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICiudadRepository extends JpaRepository<Ciudad, Long> {
}
