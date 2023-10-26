package com.example.ejercicio5;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView off;
    ImageView on;
    DialogFragment contenedor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        off=findViewById(R.id.llamadaoff);
        off.setImageResource(R.drawable.llamadaoff);
        on=findViewById(R.id.llamadaon);
        on.setImageResource(R.drawable.llamadaon);
        off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contenedor = new MyDialogFragment();
                contenedor.show(getSupportFragmentManager(),"Se hizo clic en la imagen");
            }

        });

    }
}