package com.example.actividad_clase_6.ejercicioPokemon.model;

import android.util.Log;

public class Bulbasaur extends Pokemon implements IPlanta{
    @Override
    public void atacarPlacaje() {
        Log.e("Bulbasaur", "Soy Bulbasaur y estoy atacando con Placaje");
    }

    @Override
    public void atacarAranaso() {
        System.out.println("Soy Bulbasaur y estoy atacando con arañaso");

    }

    @Override
    public void atacarmordisco() {
        System.out.println("Soy Bulbasaur y estoy atacando con mordisco");

    }

    @Override
    public void atacarParalizar() {
        Log.e("Bulbasaur", "Soy Bulbasaur y este es mi ataque Paralizar");
    }

    @Override
    public void atacarDrenaje() {
        Log.e("Bulbasaur", "Soy Bulbasaur y este es mi ataque Drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        Log.e("Bulbasaur", "Soy Bulbasaur y este es mi ataque Hoja Afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        Log.e("Bulbasaur", "Soy Bulbasaur y este es mi ataque Latigo Cepa");
    }
}
