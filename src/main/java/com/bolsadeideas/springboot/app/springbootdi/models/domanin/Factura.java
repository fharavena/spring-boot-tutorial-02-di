package com.bolsadeideas.springboot.app.springbootdi.models.domanin;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
//import org.springframework.web.context.annotation.SessionScope;

@Component
@RequestScope //quita el estado singleton: el bean durara lo que dura una peticion. cada usuario tendra una factura propia
//@SessionScope //objeto de sesion para uso de carro de compras o sistema de autentica cion para usuario persistente, etc
//@ApplicationScope //similar a singleton pero se guarda en el contexto servlet

public class Factura { //para @RequestScope
//public class Factura implements Serializable{ //para @SessionScope
    
    //private static final long serialVersionUID = 3774003720710050907L; //para @SessionScope

    @Value("${factura.descripcion}")
    private String descripcion;
    @Autowired
    private Cliente cliente;
    @Autowired    
    private List<ItemFactura> items;

    @PostConstruct
    public void inicializar(){
        cliente.setNombre(cliente.getNombre().concat(" ").concat("nombre2"));
        descripcion = descripcion.concat(" del cliente: ").concat(cliente.getNombre());
    }

    @PreDestroy
    public void destrui(){
        System.out.println("Factura destruida: ".concat(descripcion));
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemFactura> getItems() {
        return this.items;
    }

    public void setItems(List<ItemFactura> items) {
        this.items = items;
    }

}