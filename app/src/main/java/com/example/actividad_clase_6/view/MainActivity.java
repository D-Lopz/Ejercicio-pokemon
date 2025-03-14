package com.example.actividad_clase_6.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.actividad_clase_6.R;
import com.example.actividad_clase_6.ejercicioPokemon.model.Pikachu;
import com.example.actividad_clase_6.ejercicioPokemon.model.Pokemon;

public class MainActivity extends AppCompatActivity {

    Pikachu pikachuObjeto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pikachuObjeto = new Pikachu();
        pikachuObjeto.numPokedex = 25;
        pikachuObjeto.nombre = "Pikachu Autonoma";
        pikachuObjeto.peso = 2.5;
        pikachuObjeto.sexo = "Macho";
        pikachuObjeto.temporada = "Primera";
        pikachuObjeto.tipo = "Electrico";

        pikachuObjeto.atacarImpacTrueno();

    }

}