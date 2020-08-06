package com.bolsadeideas.springboot.app.springbootdi.service;

public class MiServicio implements IServicio{

    @Override
    public String operacion(){
        return "ejecutando algun proceso importante simple...";
    }
}