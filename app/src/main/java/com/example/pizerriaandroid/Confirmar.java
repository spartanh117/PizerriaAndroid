package com.example.pizerriaandroid;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Confirmar extends AppCompatActivity {
    private Pizza pizza;
    private Context context;
    public Confirmar(){

    }

    public Confirmar(Pizza pizza,Context context){
        this.context = context;
        this.pizza = pizza;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public void alert(){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Confirmacion de pedido");
        builder.setMessage("Precio: "+pizza.getPrecio());

        builder.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                SharedPreferences preferencias = getSharedPreferences(String.valueOf(R.string.preference_file_key), Context.MODE_PRIVATE);
                SharedPreferences.Editor edit = preferencias.edit();
                edit.putString("Favorita",pizza.toString());

                startActivity(new Intent(getApplicationContext(),Login.class));
            }
        });
        builder.setNegativeButton("Cancelar", null);
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}

