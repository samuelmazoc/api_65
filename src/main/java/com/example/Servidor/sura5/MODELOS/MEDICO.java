package com.example.Servidor.sura5.MODELOS;

import jakarta.persistence.*;

@Entity
@Table(name = "medico")
public class MEDICO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nombres;

    private String matriculaProfecional;

    private String especialidad;

    private Integer salario;

    private String ips;

    private String correo;

    private String telefono;

    private String direccion;

    private Boolean disponibleFindesemana;

    public MEDICO() {
    }

    public MEDICO(long id, String nombres, String matriculaProfecional, String especialidad, Integer salario, String ips, String correo, String telefono, String direccion, Boolean disponibleFindesemana) {
        this.id = id;
        this.nombres = nombres;
        this.matriculaProfecional = matriculaProfecional;
        this.especialidad = especialidad;
        this.salario = salario;
        this.ips = ips;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.disponibleFindesemana = disponibleFindesemana;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getMatriculaProfecional() {
        return matriculaProfecional;
    }

    public void setMatriculaProfecional(String matriculaProfecional) {
        this.matriculaProfecional = matriculaProfecional;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getDisponibleFindesemana() {
        return disponibleFindesemana;
    }

    public void setDisponibleFindesemana(Boolean disponibleFindesemana) {
        this.disponibleFindesemana = disponibleFindesemana;
    }
}