package com.poli.socket.infrastructure.driveradapter.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "PERSONAS")
public class Personas {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "person_id")
    private Long personId;
    @Column (name = "dir_tel")
    private String dirTel;
    @Column (name = "dir_tipo_tel")
    private int dirTipo_tel;
    @Column (name = "dir_nombre")
    private String dirNombre;
    @Column (name = "dir_direccion")
    private String dirDireccion;
    @Column (name = "dir_ciud_id")
    private Long dirCiud_id;

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public String getDirTel() {
        return dirTel;
    }

    public void setDirTel(String dirTel) {
        this.dirTel = dirTel;
    }

    public int getDirTipo_tel() {
        return dirTipo_tel;
    }

    public void setDirTipo_tel(int dirTipo_tel) {
        this.dirTipo_tel = dirTipo_tel;
    }

    public String getDirNombre() {
        return dirNombre;
    }

    public void setDirNombre(String dirNombre) {
        this.dirNombre = dirNombre;
    }

    public String getDirDireccion() {
        return dirDireccion;
    }

    public void setDirDireccion(String dirDireccion) {
        this.dirDireccion = dirDireccion;
    }

    public Long getDirCiud_id() {
        return dirCiud_id;
    }

    public void setDirCiud_id(Long dirCiud_id) {
        this.dirCiud_id = dirCiud_id;
    }
}
