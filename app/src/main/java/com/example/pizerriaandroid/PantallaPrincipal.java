package com.example.pizerriaandroid;

import android.content.Intent;
import android.media.Image;
import android.net.sip.SipSession;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class PantallaPrincipal extends AppCompatActivity {
        ImageButton backButon,configuracion;
        Button pedir;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_pantalla_principal);

            setUpView();
            backButon.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent (getApplicationContext(),Login.class));
                }
            });

            pedir.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent (getApplicationContext(),Pedido.class));
                }
            });

            configuracion.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent (getApplicationContext(),Configuracion.class));
                }
            });



        }


        private void setUpView(){
            backButon = (ImageButton)findViewById(R.id.btnBack);
            configuracion = (ImageButton)findViewById(R.id.btnConfiguracion);
            pedir = (Button)findViewById(R.id.btnPedido);
        }
}

