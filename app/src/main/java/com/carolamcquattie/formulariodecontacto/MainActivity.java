package com.carolamcquattie.formulariodecontacto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tvboton;
    EditText nombre1;
    TextView fecha1;
    EditText telefono1;
    EditText email1;
    EditText descripcion1;
    DatePicker datepicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

   datepicker = (DatePicker) findViewById(R.id.date_picker);
   nombre1 = ((EditText) findViewById(R.id.nombre));
   fecha1 = ((TextView) findViewById(R.id.fecha));
   telefono1 = ((EditText) findViewById(R.id.telefono));
   email1 = ((EditText) findViewById(R.id.email));
   descripcion1 = ((EditText) findViewById(R.id.descripcion_contacto));



    tvboton = (TextView) findViewById(R.id.tvboton);

    tvboton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            String n = nombre1.getText().toString();
            fecha1.setText(String.valueOf(datepicker.getDayOfMonth() + "-" +
                                      String.valueOf(datepicker.getMonth() + "-" +
                                      String.valueOf(datepicker.getYear())
                                      )
                                      )
            );
            String t = telefono1.getText().toString();
            String e = email1.getText().toString();
            String d = descripcion1.getText().toString();
            String f = fecha1.getText().toString();
            Intent i = new Intent(MainActivity.this, ConfirmarDatos.class);
            i.putExtra(getResources().getString(R.string.pnombre), n);
            i.putExtra(getResources().getString(R.string.ptelefono), t);
            i.putExtra(getResources().getString(R.string.pemail), e);
            i.putExtra(getResources().getString(R.string.pdescripcion), d);
            i.putExtra(getResources().getString(R.string.pfecha), f);
            startActivity(i);
        }
    });
    }



}