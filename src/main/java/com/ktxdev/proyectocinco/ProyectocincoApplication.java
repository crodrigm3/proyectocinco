package com.ktxdev.proyectocinco;

import com.ktxdev.proyectocinco.vista.vistausuarios;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectocincoApplication {

    public static void main(String[] args) {

        SpringApplication.run(ProyectocincoApplication.class, args);

        //instanciar el objeto
        vistausuarios persona1 = new vistausuarios();
        vistausuarios persona2 = new vistausuarios();
        persona1.mostrarusuarios("Carlos", "123456");
        persona1.mostrarusuarios("Gloria", "654321");

    }

}
