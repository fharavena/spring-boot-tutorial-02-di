package com.bolsadeideas.springboot.app.springbootdi;

import com.bolsadeideas.springboot.app.springbootdi.service.IServicio;
import com.bolsadeideas.springboot.app.springbootdi.service.MiServicio;
import com.bolsadeideas.springboot.app.springbootdi.service.MiServicioComplejo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Bean("MiServicioSimple")
    @Primary
    public IServicio registrarMiServicio(){
        return new MiServicio();
    }

    @Bean("MiServicioComplejo")
    public IServicio registrarMiServicioComplejo(){
        return new MiServicioComplejo();
    }
}