package com.example.login;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.login.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String nombre,contra;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = findViewById(R.id.nombre).toString();
        contra =findViewById(R.id.contraseña).toString();
    }
    public void acceder(View vista){
        Intent i = new Intent(this,SegundaActividad.class);
        EditText usuario = (EditText) findViewById(R.id.nombre);
        nombre = usuario.getText().toString();
        EditText pass = (EditText) findViewById(R.id.contraseña);
        contra = pass.getText().toString();
        i.putExtra("usuario", (CharSequence) nombre);
        i.putExtra("contra", (CharSequence) contra);
        startActivity(i);
    }
}