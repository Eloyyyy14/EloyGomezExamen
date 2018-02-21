package com.example.eloyyyyyyy.eloygomezexamen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import com.android.volley.Request.Method;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView tvPaises;
    ListView lvPaises;
    //private static final String url="http://192.168.31.44/Paises/paises.json";
    private static final String url="http://restcountries.eu/rest/v2/all";
    ArrayList<DatosPaises> paises=new ArrayList<DatosPaises>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvPaises=(TextView)findViewById(R.id.tvPaises);
        lvPaises=(ListView)findViewById(R.id.lvPaises);

        RequestQueue request= Volley.newRequestQueue(this);

        JsonArrayRequest jsonArrayRequest= new JsonArrayRequest(Method.GET, url, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                try {
                    JSONArray jsonArray=new JSONArray(response.toString(0));

                    for(int i=0; i<jsonArray.length(); i++){
                        String nombre= jsonArray.getJSONObject(i).getString("name");
                        String nombreTraducido= jsonArray.getJSONObject(i).getJSONObject("translations").getString("es");
                        String clave= jsonArray.getJSONObject(i).getString("alpha2Code");
                        String continente=jsonArray.getJSONObject(i).getString("region");
                        String capital=jsonArray.getJSONObject(i).getString("capital");
                        String poblacion=jsonArray.getJSONObject(i).getString("population");

                        if(jsonArray.getJSONObject(i).getJSONArray("latlng").getString(0)=="") {
                            String latitud = "";
                        }else{
                            String latitud=jsonArray.getJSONObject(i).getJSONArray("latlng").getString(0);
                        }


                        if(jsonArray.getJSONObject(i).getJSONArray("latlng").getString(1)==""){
                            String longitud="";
                        }else{
                            String longitud=jsonArray.getJSONObject(i).getJSONArray("latlng").getString(1);
                        }


                        String paisesFronterizos="Hola";
                        //String paisesFronterizos= jsonArray.getJSONObject(i).getJSONArray("borders").getString(0);


                        DatosPaises registro=new DatosPaises(nombre, nombreTraducido, clave, capital, continente, poblacion, latitud, longitud, paisesFronterizos);


                        paises.add(registro);

                    }

                    AdaptadorPaises miAdaptador=new AdaptadorPaises(getApplicationContext(), paises);

                    lvPaises.setAdapter(miAdaptador);


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        request.add(jsonArrayRequest);
    }
}
