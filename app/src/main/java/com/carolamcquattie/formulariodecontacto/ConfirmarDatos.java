package com.carolamcquattie.formulariodecontacto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ConfirmarDatos extends AppCompatActivity {

    private TextView tvNombre;
    private TextView tvFecha;
    private TextView tvTelefono;
    private TextView tvEmail;
    private TextView tvDescripcion;
    TextView tvboton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

    recibirDatos();

    tvboton2 = (TextView) findViewById(R.id.tvboton2);

    tvboton2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent i2 = new Intent(ConfirmarDatos.this, MainActivity.class);
               finish();
        }
    });

        }


    private void recibirDatos(){

        Bundle extras = getIntent().getExtras();

        String nombre   = extras.getString(getResources().getString(R.string.pnombre));
        String telefono   = extras.getString(getResources().getString(R.string.ptelefono));
        String fecha = extras.getString(getResources().getString(R.string.pfecha));
        String email   = extras.getString(getResources().getString(R.string.pemail));
        String descripcion = extras.getString(getResources().getString(R.string.pdescripcion));



        tvNombre = (TextView) findViewById(R.id.tvnombre1);
        tvFecha = (TextView)  findViewById(R.id.tvfecha1);
        tvTelefono = (TextView) findViewById(R.id.tvtelefono1);
        tvEmail = (TextView) findViewById(R.id.tvemail1);
        tvDescripcion = (TextView) findViewById(R.id.tvdescripcion1);

        tvNombre.setText(nombre);
        tvFecha.setText(fecha);
        tvTelefono.setText(telefono);
        tvEmail.setText(email);
        tvDescripcion.setText(descripcion);



    }
}