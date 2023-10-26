package com.example.ejercicio5;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

public class MyDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
       // builder.setTitle("Título del cuadro de diálogo")
                builder.setMessage("Se ha pulsado el botón de colgar");
              //  .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
              /*      public void onClick(DialogInterface dialog, int which) {
                        // Manejar la acción al hacer clic en Aceptar
                    }
                })
                .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Manejar la acción al hacer clic en Cancelar
                    }
                });

               */

        return builder.create();
    }
}