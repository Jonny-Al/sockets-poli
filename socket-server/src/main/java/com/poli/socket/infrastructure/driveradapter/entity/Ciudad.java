package com.poli.socket.infrastructure.driveradapter.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "CIUDAD")
public class Ciudad {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "ciud_id")
    private Long ciudId;

    @Column (name = "ciud_nombre")
    private String ciudNombre;

    public Long getCiudId() {
        return ciudId;
    }

    public void setCiudId(Long ciudId) {
        this.ciudId = ciudId;
    }

    public String getCiudNombre() {
        return ciudNombre;
    }

    public void setCiudNombre(String ciudNombre) {
        this.ciudNombre = ciudNombre;
    }
}
