package com.ktxdev.proyectocinco.controlador;

import com.ktxdev.proyectocinco.modelo.usuarios;
import com.ktxdev.proyectocinco.vista.vistausuarios;

public class controlusuarios {
    private vistausuarios vista;
    private usuarios modelo;

    //constructor


    public controlusuarios(vistausuarios vista, usuarios modelo) {
        this.vista = vista;
        this.modelo = modelo;
    }

    public vistausuarios getVista() {
        return vista;
    }

    public void setVista(vistausuarios vista) {
        this.vista = vista;
    }

    public usuarios getModelo() {
        return modelo;
    }

    public void setModelo(usuarios modelo) {
        this.modelo = modelo;
    }
}
