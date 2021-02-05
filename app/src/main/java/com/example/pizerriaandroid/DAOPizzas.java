package com.example.pizerriaandroid;

import java.util.ArrayList;
import java.util.List;

public class DAOPizzas {
    private List<Pizza> ListaPizza;

    public DAOPizzas() {
        this.ListaPizza = new ArrayList<>();
        this.ListaPizza.add(new Pizza("Cuatro Queso","mediana",8f,"parmesano","mozarella","roquefort","queso azul"));
        this.ListaPizza.add(new Pizza("Jamon y queso","mediana",8f,"queso","Jamon York"));
    }

    public List<String> mostrar() {
        List<String> cadena = new ArrayList<>();
        for (Pizza pizza:this.ListaPizza) {
            cadena.add(pizza.toString());
        }
        return cadena;
    }

    public List<Pizza> getListaPizza() {
        return this.ListaPizza.subList(0,ListaPizza.size());
    }
}
