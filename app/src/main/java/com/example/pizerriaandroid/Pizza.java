package com.example.pizerriaandroid;

import java.util.Arrays;
import java.util.List;

public class Pizza {
    private String nombre,tamnno;
    private Float precio;
    private String[] ingredientes;

    public Pizza(String nombre, String tamnno, Float precio, String... ingredientes){
        this.nombre = nombre;
        this.tamnno = tamnno;
        this.precio = precio;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTamnno() {
        return tamnno;
    }

    public Float getPrecio() {
        return precio;
    }

    public String[] getIngredientes() {
        return ingredientes.clone();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTamnno(String tamnno) {
        this.tamnno = tamnno;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }


    @Override
    public String toString() {
        return "Pizza{" +
                "nombre='" + nombre + '\'' +
                ", tamnno='" + tamnno + '\'' +
                ", precio=" + precio +
                ", ingredientes=" + Arrays.toString(ingredientes) +
                '}';
    }
}
