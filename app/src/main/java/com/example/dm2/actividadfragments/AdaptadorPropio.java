package com.example.dm2.actividadfragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdaptadorPropio extends ArrayAdapter<Juegos > {

    private Juegos[] datos;

    public AdaptadorPropio(Context context, Juegos[] datos) {

        super(context, R.layout.juegos, datos);
        this.datos=datos;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.juegos, null);

        TextView nombre = (TextView)item.findViewById(R.id.nombre_juego );
        nombre.setText(datos[position].getNombre());

        TextView canciones = (TextView)item.findViewById(R.id.desarrolladores );
        canciones.setText(datos[position].getDesarolladora());

        ImageView imagen = (ImageView) item.findViewById(R.id.foto_juego );
        imagen.setImageDrawable(datos[position].getFotoJuego());
        return(item);
    }
}