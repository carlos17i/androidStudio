package com.example.proyectofin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.activity.EdgeToEdge;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView tvRegistrar;
    TextView tvUsuario, tvPassword,tv;
    Button  btnIniciar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        tvRegistrar=findViewById(R.id.tvRegistrar);
        tvUsuario=findViewById(R.id.tvUsuario);
        tvPassword=findViewById(R.id.tvPassword);
        btnIniciar=findViewById(R.id.btnIniciar);



        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentIni=new Intent(MainActivity.this,Principal.class);
                MainActivity.this.startActivity(intentIni);
            }
        });

        tvRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentReg=new Intent(MainActivity.this, Registro.class);
                MainActivity.this.startActivity(intentReg);

            }
        });


    }


    }
