package com.example.actividad_clase_6.ejercicioPokemon.model;

import android.util.Log;

public class Pikachu extends Pokemon implements IElectrico{


    @Override
    public void atacarPlacaje() {
        System.out.println("Soy pikachu y estoy atacando con placaje");
    }

    @Override
    public void atacarAranaso() {
        System.out.println("Soy pikachu y estoy atacando con arañaso");

    }

    @Override
    public void atacarmordisco() {
        System.out.println("Soy pikachu y estoy atacando con mordisco");

    }

    @Override
    public void atacarImpacTrueno() {
        Log.e("Pikachu", "Soy pikachu y este es mi ataque trueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Soy pikachu y este es mi ataque puño trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Soy pikachu y este es mi ataque rayo");
    }

    @Override
    public void atacarRayoTrueno() {
        System.out.println("Soy pikachu y este es mi ataque rayo trueno");
    }
}
