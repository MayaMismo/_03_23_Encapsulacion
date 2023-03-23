package com.adecco.modelo;

public class producto {
    //1.ATRIBUTOS
    private int numProducto;
    private String nombreProducto;
    private double precio;
    private int cantidadExistencia;

    //2.Metodos
    //3.Constructores

    //4.SETTERS y GETTERS
        //-->Asignar valor al atributo
    public void setNumProducto (int numProducto){ //esto es definir un método tb
        this.numProducto = numProducto;
    }
    public int getNumProducto(){ //no tiene parámetros de entrada pq el objetivo del getter es devolver el valor de mis parámetros de entrada
        return numProducto;
    }
        //hacemos lo mismo con el resto de atributos:
    public void setNombreProducto(String nombreProducto){
        this.nombreProducto = nombreProducto;
    }
    public String getNombreProducto(){
        return nombreProducto;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public double getPrecio() {
        return precio;
    }

    public int getCantidadExistencia() {
        return cantidadExistencia;
    }

    public void setCantidadExistencia(int cantidadExistencia) {
        this.cantidadExistencia = cantidadExistencia;
    }
}
