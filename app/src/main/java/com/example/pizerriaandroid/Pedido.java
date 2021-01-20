package com.example.pizerriaandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Pedido extends AppCompatActivity {
    Button favorita,predeterminada,personalizada

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);
        favorita = (Button)findViewById(R.id.btnFavorita);
        favorita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        predeterminada = (Button)findViewById(R.id.btnPredeterminada);
        predeterminada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),Predeterminadas.class);
                startActivity(intent);
            }
        });
        personalizada = (Button)findViewById(R.id.btnPersonalizadas);
        personalizada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(),Personalizadas.class);
                startActivity(intent);
            }
        });
    }
}
