package com.bolsadeideas.springboot.app.springbootdi.service;

public class MiServicioComplejo implements IServicio {

    @Override
    public String operacion(){
        return "ejecutando algun proceso importante complejo...";
    }
}