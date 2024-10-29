package com.ikaslea.jakinarazpenak2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;

import androidx.fragment.app.DialogFragment;

public class DialogoConfirmacion extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder =
                new AlertDialog.Builder(getActivity());
        builder.setMessage("¿Konfirmatzen duzu egindako selekzioa??")
                .setTitle("Konfirmazioa")
                .setPositiveButton("Ados", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Log.i("Dialogoak", "Konfirmazioa baieztatuta.");
                        dialog.cancel();
                    }
                })
                .setNegativeButton("Ezeztatu", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        Log.i("Dialogoak:", "Konfirmazioa ezeztatuta.");
                        dialog.cancel();
                    }
                });
        return builder.create();
    }
}
