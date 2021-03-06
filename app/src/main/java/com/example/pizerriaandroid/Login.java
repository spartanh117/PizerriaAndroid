package com.example.pizerriaandroid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    private Button iniciarSesion;
    private EditText email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        SharedPreferences preferencias = getSharedPreferences(String.valueOf(R.string.preference_file_key), Context.MODE_PRIVATE);

        iniciarSesion = (Button)findViewById(R.id.btnIniciarSesion);
        email = (EditText)findViewById(R.id.editTextTextEmailAddress);
        password = (EditText)findViewById(R.id.editTextTextPassword);

        iniciarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((email.getText() != null) && (password.getText() != null)){
                    Intent intent = new Intent(getApplicationContext(), PantallaPrincipal.class);
                    startActivity(intent);
                }
            }
        });

    }
}
