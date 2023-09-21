package com.poli.socket.domain.dto.in;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonSerialize
@JsonIgnoreProperties (ignoreUnknown = true)
public class UserRequest {

    @JsonProperty ("personid")
    private String personid;
    @JsonProperty ("dirtel")
    private String dirtel;
    @JsonProperty ("dirtipotel")
    private String dirtipotel;
    @JsonProperty ("dirnombre")
    private String dirnombre;
    @JsonProperty ("dirdireccion")
    private String dirdireccion;
    @JsonProperty ("dirciudid")
    private String dirciudid;

    public UserRequest() {

    }

    public UserRequest(String dirtel, String dirnombre, String dirdireccion, String dirciudid) {
        this.dirtel = dirtel;
        this.dirnombre = dirnombre;
        this.dirdireccion = dirdireccion;
        this.dirciudid = dirciudid;
    }

    @JsonIgnore
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

    @JsonIgnore
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
