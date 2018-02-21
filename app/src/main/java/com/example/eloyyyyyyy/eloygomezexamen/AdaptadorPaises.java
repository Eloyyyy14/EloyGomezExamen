package com.example.eloyyyyyyy.eloygomezexamen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Eloyyyyyyy on 21/02/2018.
 */

public class AdaptadorPaises extends BaseAdapter{
    Context contexto; //contexto de la aplicacion
    ArrayList<DatosPaises> Paises; //lista de datos a generar. Podemos usar tb un ArrayList

    public AdaptadorPaises(Context contexto, ArrayList<DatosPaises> paises) {
        this.contexto = contexto;
        Paises = paises;
    }

    @Override
    public int getCount() {
        return Paises.size();
    }

    @Override
    public Object getItem(int i) { //Devuelve el objeto de la lista en la posición indicada como parametro
        return Paises.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) { //Es el método que se ejecuta cuando se muestra en mi ListView cada item
        View vista=view;
        LayoutInflater inflate = LayoutInflater.from(contexto); //Obtenemos el contexto del item sobre el cual estamos trabajando del ListView
        vista=inflate.inflate(R.layout.itemlistview_paises, null); //Consigo referenciar a la vista en sí

        TextView tvNombre=(TextView)vista.findViewById(R.id.tvNombre);
        TextView tvNombreTraduccion=(TextView)vista.findViewById(R.id.tvNombreTraduccion);
        TextView tvClave=(TextView)vista.findViewById(R.id.tvClave);
        TextView tvContinente=(TextView)vista.findViewById(R.id.tvContinente);
        TextView tvCapital=(TextView)vista.findViewById(R.id.tvCapital);
        TextView tvPoblacion=(TextView)vista.findViewById(R.id.tvPoblacion);
        TextView tvLatitud=(TextView)vista.findViewById(R.id.tvLatitud);
        TextView tvLongitud=(TextView)vista.findViewById(R.id.tvLongitud);
        TextView tvFronterizos=(TextView)vista.findViewById(R.id.tvFronterizos);


        tvNombre.setText(Paises.get(i).getNombreCastellano());
        tvNombreTraduccion.setText(Paises.get(i).getNombreIngles());
        tvClave.setText(Paises.get(i).getClave2Letras());
        tvContinente.setText(Paises.get(i).getContinente());
        tvCapital.setText(Paises.get(i).getCapital());
        tvPoblacion.setText(Paises.get(i).getPoblacion());
        tvLatitud.setText(Paises.get(i).getLatitud());
        tvLongitud.setText(Paises.get(i).getLongitud());
        tvFronterizos.setText(Paises.get(i).getPaisesFronterizos());

        return vista;

    }
}
