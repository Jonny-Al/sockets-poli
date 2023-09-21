package com.poli.socket.infrastructure.driveradapter.repository;

import com.poli.socket.infrastructure.driveradapter.entity.Personas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonasRepository extends JpaRepository<Personas, Long> {

    @Query ("SELECT p FROM Personas p where p.dirTel = :dirTel")
    Personas findByPersonByDirTel(String dirTel);

}
