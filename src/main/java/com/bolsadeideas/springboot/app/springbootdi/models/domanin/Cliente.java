package com.bolsadeideas.springboot.app.springbootdi.models.domanin;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class Cliente {
    @Value("${cliente.nombre}")
    private String nombre;
    @Value("${cliente.apellido}")
    private String apellido;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}