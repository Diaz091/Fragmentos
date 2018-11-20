package com.example.dm2.actividadfragments;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

public class FragmentListado extends Fragment{

    private ListView lista;
    private ListaListener listener;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fargemento_lista, container, false);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void onActivityCreated(Bundle state) {

        super.onActivityCreated(state);

        lista=(ListView) getView().findViewById(R.id.lista_juegos );
        final Juegos[] debs= new Juegos[]{
                new Juegos("Assassin’s Creed Odyssey","Ubisoft Quebec / Ubisoft",getContext().getDrawable(R.mipmap.ic_origin),"Assassin's Creed: Odyssey es un videojuego de acción-aventura desarrollado por Ubisoft Quebec, y distribuido por Ubisoft, correspondiente con la saga Assassin's Creed.Fue anunciado oficialmente el 31 de mayo de 2018 a través de un breve tráiler"),
                new Juegos("Celeste","Matt Makes Games",getContext().getDrawable(R.mipmap.ic_celeste),"Celeste es un videojuego perteneciente al género de plataformas creado por los desarrolladores de videojuegos canadienses Matt Thorson y Noel Berry. El videojuego fue creado originalmente como un prototipo en cuatro días durante un Juego Jam, y más tarde se expandió a un lanzamiento completo."),
                new Juegos("God of War","Sony Santa Monica / SIE",getContext().getDrawable(R.mipmap.ic_gow),"God of War es una serie de videojuegos en 3.ª persona creada por SCE Santa Monica Studio y distribuida por Sony Computer Entertainment."),
                new Juegos("Marvel’s Spider-Man","Insomniac Games / SIE",getContext().getDrawable(R.mipmap.ic_spi),"Spider-Man es un videojuego de acción y aventura basado en el popular superhéroe de la editorial Marvel Comics.\u200B Fue desarrollado por Insomniac Games y publicado por Sony Interactive Entertainment en exclusiva para la consola PlayStation 4. Se trata del primer videojuego licenciado desarrollado por Insomniac."),
                new Juegos("Monster Hunter: World","Capcom",getContext().getDrawable(R.mipmap.ic_mhw),"Monster Hunter: World es un videojuego perteneciente al género de rol y acción, desarrollado y publicado por la empresa Capcom, siendo el sexto título principal de la franquicia de videojuegos Monster Hunter. El juego fue anunciado en la conferencia de Sony en la E3 2017."),
                new Juegos("Red Dead Redemption 2","Rockstar Games",getContext().getDrawable(R.mipmap.ic_rdr),"Red Dead Redemption 2 es un videojuego de acción-aventura western, en un mundo abierto y en perspectiva de primera y tercera persona, \u200B con componentes para un jugador y multijugador.\u200B Fue desarrollado por Rockstar Games, para las consolas PlayStation 4 y Xbox One.\u200B")};
        AdaptadorPropio adaptador= new AdaptadorPropio(getContext(),debs);
        lista.setAdapter(adaptador);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onItemClick(AdapterView<?> parent, View view, int pos, long id)
            {
                if (listener != null)

                    listener.onDiscoSeleccionado((Juegos )lista.getAdapter().getItem(pos));
            }
        });
    }

    public interface ListaListener {
        void onDiscoSeleccionado(Juegos c);
    }

    public void setListaListener (ListaListener listener){
        this.listener = listener;
    }
}
