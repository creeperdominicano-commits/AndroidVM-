package com.creeper.androidvm;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView statusText;
    private Button startVmButton;
    private Button selectRomButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        statusText = findViewById(R.id.statusText);
        startVmButton = findViewById(R.id.startVmButton);
        selectRomButton = findViewById(R.id.selectRomButton);

        startVmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                statusText.setText("Estado: Iniciando Android Go...");
                Toast.makeText(MainActivity.this, "Cargando entorno virtual...", Toast.LENGTH_SHORT).show();
            }
        });

        selectRomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Abriendo selector de ROMs personalizadas", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
