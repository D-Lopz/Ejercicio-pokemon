package com.example.actividad_clase_6.ejercicioPokemon.model;

import android.util.Log;

public class Squirtle extends Pokemon implements IAgua{

    @Override
    public void atacarPlacaje() {
        Log.e("Squirtle", "Soy Squirtle y estoy atacando con Placaje");
    }

    @Override
    public void atacarAranaso() {
        System.out.println("Soy Squirtle y estoy atacando con arañaso");

    }

    @Override
    public void atacarmordisco() {
        System.out.println("Soy Squirtle y estoy atacando con mordisco");

    }

    @Override
    public void atacarHidrobomba() {
        Log.e("Squirtle", "Soy Squirtle y este es mi ataque Hidrobomba");
    }

    @Override
    public void atacarPistolaAgua() {
        Log.e("Squirtle", "Soy Squirtle y este es mi ataque Pistola Agua");
    }

    @Override
    public void atacarBurbuja() {
        Log.e("Squirtle", "Soy Squirtle y este es mi ataque Burbuja");
    }

    @Override
    public void atacarHidropulso() {
        Log.e("Squirtle", "Soy Squirtle y este es mi ataque Hidropulso");
    }
}
