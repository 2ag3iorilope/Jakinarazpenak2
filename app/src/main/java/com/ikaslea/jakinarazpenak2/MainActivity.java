package com.ikaslea.jakinarazpenak2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {
    // Elkarrizketa mota bakoitzerako botoien deklarazioa
    Button buttonAlerta;
    Button buttonConfirmacion;
    Button buttonSelecSimple;
    Button buttonSelecMulti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Botoiak hasieratzen dira layout-eko IDen bidez BETI SETCONTENTVIEW ONDOREN
        buttonAlerta = findViewById(R.id.button);
        buttonConfirmacion = findViewById(R.id.button2);
        buttonSelecSimple = findViewById(R.id.button3);
        buttonSelecMulti = findViewById(R.id.button4);

        // Botoiari klik egitean alerta elkarrizketa bat erakusteko konfigurazioa
        buttonAlerta.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                DialogoAlerta dialogo = new DialogoAlerta();
                dialogo.show(fragmentManager, "tagAlerta");
            }
        });

        // Botoiari klik egitean baieztapen elkarrizketa bat erakusteko konfigurazioa
        buttonConfirmacion.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                DialogoConfirmacion dialogoConfirmacion = new DialogoConfirmacion();
                dialogoConfirmacion.show(fragmentManager, "tagconfirmacion");
            }
        });
// Botoiari klik egitean hautaketa sinpleko elkarrizketa bat erakusteko konfigurazioa
        buttonSelecSimple.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                DialogoSeleccion dialogoSeleccionsimp = new DialogoSeleccion();
                dialogoSeleccionsimp.show(fragmentManager, "tagselecsimple");
            }
        });

        // Botoiari klik egitean hautaketa anitzeko elkarrizketa bat erakusteko konfigurazioa
        buttonSelecMulti.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                DialogoSelecMulti dialogoSeleccionmulti = new DialogoSelecMulti();
                dialogoSeleccionmulti.show(fragmentManager, "tagselecmulti");
            }
        });

    }
}