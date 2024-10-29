package com.ikaslea.jakinarazpenak2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;

import androidx.fragment.app.DialogFragment;

public class DialogoSeleccion extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final String[] items = {"Gaztelania", "Ingelesa", "Alemana", "Frantzesa"};
        AlertDialog.Builder builder =
                new AlertDialog.Builder(getActivity());
        builder.setTitle("Aukerak")
                .setItems(items, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int item) {
                        Log.i("Dialogoak", "Aukeratutakoa: " + items[item]);
                    }
                });
        return builder.create();
    }
}
