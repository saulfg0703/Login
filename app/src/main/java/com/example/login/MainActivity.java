package com.example.login;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private String nombre,contra;
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre = findViewById(R.id.nombre).toString();
        contra =findViewById(R.id.contraseña).toString();
        webView = (WebView) findViewById(R.id.pagina);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.google.com");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

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