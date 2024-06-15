package com.example.proyectofin;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Response;

import org.json.JSONException;
import org.json.JSONObject;

public class Registro extends AppCompatActivity implements View.OnClickListener {
    EditText etNombre, etEmail,etTelefono,etUsuario,etClave;
    Button btn_registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registro);
        etNombre=findViewById(R.id.etNombre);
       etEmail=findViewById(R.id.etEmail);
        etTelefono=findViewById(R.id.etTelefono);
        etUsuario=findViewById(R.id.etUsuario);
        etClave=findViewById(R.id.etClave);

        btn_registrar=(Button) findViewById(R.id.btnregistrar);

        btn_registrar.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        final String Nombre=etNombre.getText().toString();
        final String Email=etEmail.getText().toString();
        final String Telefono=etTelefono.getText().toString();
        final String Usuario=etUsuario.getText().toString();
        final int Password= Integer.parseInt(etClave.getText().toString());


        Response.Listener<String> respoListener=new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject jsonRespons=new JSONObject(response);
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }

            }
        };


    }
}