package com.client.poli.dto;

public class UserRequest {

    private String personid;
    private String dirtel;
    private String dirtipotel;
    private String dirnombre;
    private String dirdireccion;
    private String dirciudid;

    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid;
    }

    public String getDirtel() {
        return dirtel;
    }

    public void setDirtel(String dirtel) {
        this.dirtel = dirtel;
    }

    public String getDirtipotel() {
        return dirtipotel;
    }

    public void setDirtipotel(String dirtipotel) {
        this.dirtipotel = dirtipotel;
    }

    public String getDirnombre() {
        return dirnombre;
    }

    public void setDirnombre(String dirnombre) {
        this.dirnombre = dirnombre;
    }

    public String getDirdireccion() {
        return dirdireccion;
    }

    public void setDirdireccion(String dirdireccion) {
        this.dirdireccion = dirdireccion;
    }

    public String getDirciudid() {
        return dirciudid;
    }

    public void setDirciudid(String dirciudid) {
        this.dirciudid = dirciudid;
    }

    @Override
    public String toString() {
        return "UserRequest{" + "personid='" + personid + '\'' + ", dirtel='" + dirtel + '\'' + ", dirtipotel='" + dirtipotel + '\'' + ", dirnombre='" + dirnombre + '\'' + ", dirdireccion='" + dirdireccion + '\'' + ", dirciudid='" + dirciudid + '\'' + '}';
    }
}
