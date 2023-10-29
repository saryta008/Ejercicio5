package com.example.ejercicio5;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.DialogInterface;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView off;
    ImageView on;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        off=findViewById(R.id.llamadaoff);
        off.setImageResource(R.drawable.llamadaoff);
        on=findViewById(R.id.llamadaon);
        on.setImageResource(R.drawable.llamadaon);
        on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder confirmarLlamada = new AlertDialog.Builder(MainActivity.this);
                confirmarLlamada.setTitle("Has pulsado el botón de llamar");
                confirmarLlamada.setMessage("¿Quieres llamar?");
                confirmarLlamada.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        on.setVisibility(View.INVISIBLE);
                        off.setVisibility(View.VISIBLE);
                        Toast.makeText(MainActivity.this,"Llamada en curso\nPulsa el botón para colgar",Toast.LENGTH_SHORT).show();
                        off.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Toast.makeText(MainActivity.this,"Llamada Finalizada",Toast.LENGTH_SHORT).show();
                                off.setVisibility(View.INVISIBLE);
                                on.setVisibility(View.VISIBLE);
                            }
                        });
                    }
                });
                confirmarLlamada.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,"Llamada cancelada",Toast.LENGTH_SHORT).show();
                    }
                });
                confirmarLlamada.show();
            }
        });
    }
}