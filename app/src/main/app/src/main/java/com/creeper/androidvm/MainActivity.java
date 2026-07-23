package com.creeper.androidvm;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Crear dinámicamente un contenedor web para la interfaz de control de la VM
        webView = new WebView(this);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        
        webView.setWebViewClient(new WebViewClient());
        
        // Carga una interfaz local o de gestión de contenedores
        webView.loadData("<html><body style='background-color:#121212;color:white;text-align:center;padding-top:50px;font-family:sans-serif;'><h1>AndroidVM Manager</h1><p>Estado del contenedor: <b>Listo para iniciar Android Go</b></p><br/><button style='padding:15px 30px;background:#4CAF50;color:white;border:none;border-radius:5px;font-size:16px;'>Encender Máquina Virtual</button></body></html>", "text/html", "UTF-8");

        setContentView(webView);
    }
}
