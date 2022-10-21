package com.example.login;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SegundaActividad extends MainActivity{
private String usuario;
    private String pass;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Bundle datos = getIntent().getExtras();
        usuario = datos.getString("usuario");
        pass = datos.getString("contra");
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        if(usuario.equals("saul") && pass.equals("1234")) {
            builder.setTitle("Validar");
            builder.setMessage("Login correcto");
            builder.setPositiveButton("Aceptar", null);

        }else{
            builder.setTitle("Validar");
            builder.setMessage("Login incorrecto");
            builder.setPositiveButton("Aceptar", null);
        }
        AlertDialog dialog = builder.create();
        dialog.show();

    }
    public void volver(View vista){
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
