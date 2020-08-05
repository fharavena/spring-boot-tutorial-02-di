package com.bolsadeideas.springboot.app.springbootdi.service;

import org.springframework.stereotype.Component;

//@Component("miServicioComplejo")

public class MiServicioComplejo implements IServicio {

    @Override
    public String operacion(){
        return "ejecutando algun proceso importante complejo...";
    }
}