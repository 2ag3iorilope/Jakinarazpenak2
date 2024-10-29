package com.ikaslea.jakinarazpenak2;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;

import androidx.fragment.app.DialogFragment;

public class DialogoSelecMulti extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final String[] items = {"Gaztelania", "Ingelesa", "Alemana", "Frantzesa"};
        AlertDialog.Builder builder =
                new AlertDialog.Builder(getActivity());
        builder.setTitle("Aukerak")
                .setMultiChoiceItems(items, null,new DialogInterface.OnMultiChoiceClickListener() {
                    public void onClick(DialogInterface dialog, int item, boolean isChecked)
                    {
                        Log.i("Dialogoak", "Auekeratutakoak: " + items[item]);
                    }
                });

        return builder.create();
    }
}
