package com.example.pruebafinalm4;

import android.os.Bundle;
<<<<<<< HEAD
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
=======
import android.widget.EditText;
>>>>>>> 4a71150c90c2414fd922c31a6b2d23e972ec1810

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
<<<<<<< HEAD
import android.content.Intent;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private TextView tvBienvenida;
    private TextView tvSubtitulo;
    public Button btnEntrar;
=======

public class MainActivity extends AppCompatActivity {
    private EditText tvBienvenida;
    private EditText tvSubtitulo;
>>>>>>> 4a71150c90c2414fd922c31a6b2d23e972ec1810

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

<<<<<<< HEAD
        tvBienvenida = findViewById(R.id.tvBienvenida);
        tvSubtitulo = findViewById(R.id.tvSubtitulo);
        btnEntrar = findViewById(R.id.btnEntrar);

        btnEntrar.setOnClickListener(view -> {
            Toast.makeText(this, "Funciona el botón", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(MainActivity.this, HomeActivity.class);
            startActivity(intent);
        });
=======
>>>>>>> 4a71150c90c2414fd922c31a6b2d23e972ec1810


    }
}