package com.example.pruebafinalm4;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FormularioActivity extends AppCompatActivity {

    private EditText etNombre, etEmail;
    private Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        etNombre = findViewById(R.id.etNombre);
        etEmail = findViewById(R.id.etCorreo);
        btnEnviar = findViewById(R.id.btnCorreo);

        btnEnviar.setOnClickListener(v -> {

            String nombre = etNombre.getText().toString();
            String email = etEmail.getText().toString();

            if(nombre.isEmpty()){
                etNombre.setError("Campo obligatorio");
                return;
            }

            if(email.isEmpty()){
                etEmail.setError("Campo obligatorio");
                return;
            }

            Toast.makeText(this, "Formulario enviado", Toast.LENGTH_SHORT).show();
        });
    }
}

