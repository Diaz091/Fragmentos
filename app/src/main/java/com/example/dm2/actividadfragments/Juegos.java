package com.example.dm2.actividadfragments;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;

public class Juegos extends AppCompatActivity {

    private String nombre;
    private String desarolladora;
    private Drawable fotoJuego;
    private String informacion;

    public Juegos( String nom, String des, Drawable img, String info){

        nombre=nom;
        this.desarolladora =des;
        this.fotoJuego =img;
        informacion=info;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDesarolladora() {
        return desarolladora;
    }

    public Drawable getFotoJuego() {
        return fotoJuego;
    }

    public String getInfo() {
        return informacion;
    }
}
