package com.example.pruebafinalm4;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class DetalleActivity extends AppCompatActivity {

    private TextView tvDetalle;
    private Button btnIrFormulario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        tvDetalle = findViewById(R.id.tvDetalle);
        btnIrFormulario = findViewById(R.id.btnForm);

        String titulo = getIntent().getStringExtra("titulo");
        tvDetalle.setText(titulo);

        // 👇 EL CLICK VA DENTRO DE onCreate
        btnIrFormulario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetalleActivity.this, FormularioActivity.class);
                startActivity(intent);
            }
        });
    }
}


