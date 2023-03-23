package com.adecco.presentacion;

import com.adecco.modelo.producto;

public class Main {
    public static void main(String[] args) {

        producto p1= new producto(); //este es el constructor

        p1.setNumProducto(1);
        System.out.println("Id producto " +p1.getNumProducto());
        p1.setNombreProducto("ratón inalámbrico ");
        System.out.println("Nombre del producto: " + p1.getNombreProducto());
        p1.setPrecio(25.50);
        System.out.println("El precio del producto es: "  +p1.getPrecio());
        p1.setCantidadExistencia(250);
        System.out.println("Cantidad existencias: "  +p1.getCantidadExistencia());
        //ejercicio en GitHub
    }
}