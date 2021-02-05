package com.example.pizerriaandroid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

public class Configuracion extends AppCompatActivity {
    private ImageButton backButton;
    private Switch activaFavorita;
    private Spinner tema;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);
        setUpView();

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),PantallaPrincipal.class));
            }
        });

        activaFavorita.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                SharedPreferences preferencias = getSharedPreferences(String.valueOf(R.string.preference_file_key), Context.MODE_PRIVATE);
                SharedPreferences.Editor edit = preferencias.edit();

                if (activaFavorita.isChecked())edit.putBoolean("favoritaActiva",true);
                else edit.putBoolean("favoritaActiva",false);

                edit.commit();

            }
        });
    }

    private void setUpView() {
        backButton = (ImageButton)findViewById(R.id.btnBack3);
        activaFavorita = (Switch)findViewById(R.id.switch2);
        tema = (Spinner)findViewById(R.id.spinner);
    }
}
