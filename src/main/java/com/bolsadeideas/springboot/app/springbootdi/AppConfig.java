package com.bolsadeideas.springboot.app.springbootdi;

import java.util.Arrays;
import java.util.List;

import com.bolsadeideas.springboot.app.springbootdi.models.domanin.ItemFactura;
import com.bolsadeideas.springboot.app.springbootdi.models.domanin.Producto;
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

    @Bean("itemsFactura")
    public List<ItemFactura> registrarItems(){
        Producto producto1 = new Producto("producto1",100);
        Producto producto2 = new Producto("producto2",200);

        ItemFactura linea1 = new ItemFactura(producto1,2);
        ItemFactura linea2 = new ItemFactura(producto2,4);

        return Arrays.asList(linea1,linea2); //es lo mismo que lo siguiente
        
        // List<ItemFactura> lista= new ArrayList<ItemFactura>();
        // lista.add(linea1);
        // lista.add(linea2);
        
        // return lista;

    }

    @Bean("itemsFacturaOficina")
    @Primary
    public List<ItemFactura> registrarItemsOficina(){
        Producto producto3 = new Producto("producto3",150);
        Producto producto4 = new Producto("producto4",250);
        Producto producto5 = new Producto("producto5",350);
        Producto producto6 = new Producto("producto6",450);

        ItemFactura linea1 = new ItemFactura(producto3,7);
        ItemFactura linea2 = new ItemFactura(producto4,5);
        ItemFactura linea3 = new ItemFactura(producto5,3);
        ItemFactura linea4 = new ItemFactura(producto6,1);

        return Arrays.asList(linea1,linea2,linea3,linea4);
    }
}