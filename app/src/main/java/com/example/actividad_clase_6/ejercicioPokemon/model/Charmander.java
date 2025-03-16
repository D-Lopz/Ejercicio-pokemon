package com.example.actividad_clase_6.ejercicioPokemon.model;

import android.util.Log;

public class Charmander extends Pokemon implements IFuego{

    @Override
    public void atacarPlacaje() {
        Log.e("Charmander", "Soy Charmander y estoy atacando con Placaje");
    }

    @Override
    public void atacarAranaso() {
        System.out.println("Soy Charmander y estoy atacando con arañaso");

    }

    @Override
    public void atacarmordisco() {
        System.out.println("Soy Charmander y estoy atacando con mordisco");

    }

    @Override
    public void atacarPunioFuego() {
        Log.e("Charmander", "Soy Charmander y este es mi ataque Puño Fuego");
    }

    @Override
    public void atacarAscuas() {
        Log.e("Charmander", "Soy Charmander y este es mi ataque  Ascuas");
    }

    @Override
    public void atacarLanzallamas() {
        Log.e("Charmander", "Soy Charmander y este es mi ataque Lanza llamas");
    }
}
