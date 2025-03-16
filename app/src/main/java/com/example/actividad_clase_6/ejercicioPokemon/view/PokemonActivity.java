package com.example.actividad_clase_6.ejercicioPokemon.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import com.example.actividad_clase_6.R;
import com.example.actividad_clase_6.ejercicioPokemon.model.Bulbasaur;
import com.example.actividad_clase_6.ejercicioPokemon.model.Charmander;
import com.example.actividad_clase_6.ejercicioPokemon.model.Pikachu;
import com.example.actividad_clase_6.ejercicioPokemon.model.Squirtle;

public class PokemonActivity extends AppCompatActivity {

    Pikachu pikachuObjeto;
    Charmander charmanderObjeto;
    Squirtle squirtleObjeto;
    Bulbasaur bulbasaurObjeto;

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
        pikachuObjeto.atacarRayo();
        pikachuObjeto.atacarRayoTrueno();
        pikachuObjeto.atacarPunioTrueno();


        charmanderObjeto = new Charmander();
        charmanderObjeto.numPokedex = 4;
        charmanderObjeto.nombre = "Charmander Autonoma";
        charmanderObjeto.peso = 6.3;
        charmanderObjeto.sexo = "Macho";
        charmanderObjeto.temporada = "Primera";
        charmanderObjeto.tipo = "Fuego";

        charmanderObjeto.atacarAscuas();
        charmanderObjeto.atacarmordisco();
        charmanderObjeto.atacarPunioFuego();


        squirtleObjeto = new Squirtle();
        squirtleObjeto.numPokedex = 7;
        squirtleObjeto.nombre = "Squirtle";
        squirtleObjeto.peso = 8.9;
        squirtleObjeto.sexo = "Macho";
        squirtleObjeto.temporada = "Primera";
        squirtleObjeto.tipo = "Agua";

        squirtleObjeto.atacarBurbuja();
        squirtleObjeto.atacarPistolaAgua();
        squirtleObjeto.atacarHidrobomba();
        squirtleObjeto.atacarHidropulso();


        bulbasaurObjeto = new Bulbasaur();
        bulbasaurObjeto.numPokedex = 1;
        bulbasaurObjeto.nombre = "Bulbasaur";
        bulbasaurObjeto.peso = 6.9;
        bulbasaurObjeto.sexo = "Macho";
        bulbasaurObjeto.temporada = "Primera";
        bulbasaurObjeto.tipo = "Planta";

        bulbasaurObjeto.atacarParalizar();
        bulbasaurObjeto.atacarDrenaje();
        bulbasaurObjeto.atacarHojaAfilada();
        bulbasaurObjeto.atacarLatigoCepa();

    }



}