package com.example.pizerriaandroid;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class PantallaPrincipal extends AppCompatActivity {
        ImageButton backButon,configuracion;
        Button perdir;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_pantalla_principal);

            backButon = (ImageButton)findViewById(R.id.btnBack);
            backButon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

            configuracion = (ImageButton)findViewById(R.id.btnConfiguracion);
            configuracion.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent (getApplicationContext(),Configuracion.class);
                    startActivity(intent);
                }
            });

            perdir = (Button)findViewById(R.id.btnPedido);
            configuracion.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent (getApplicationContext(), Pedido.class);
                    startActivity(intent);
                }
            });
        }
}

