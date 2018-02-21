package com.example.eloyyyyyyy.eloygomezexamen;

/**
 * Created by Eloyyyyyyy on 21/02/2018.
 */

public class DatosPaises {
    private String nombreIngles;
    private String nombreCastellano;
    private String clave2Letras;
    private String capital;
    private String continente;
    private String poblacion;
    private String latitud;
    private String longitud;
    private String paisesFronterizos;

    public DatosPaises(String nombreIngles, String nombreCastellano, String clave2Letras, String capital, String continente, String poblacion, String latitud, String longitud, String paisesFronterizos) {
        this.nombreIngles = nombreIngles;
        this.nombreCastellano = nombreCastellano;
        this.clave2Letras = clave2Letras;
        this.capital = capital;
        this.continente = continente;
        this.poblacion = poblacion;
        this.latitud = latitud;
        this.longitud = longitud;
        this.paisesFronterizos = paisesFronterizos;
    }

    public String getNombreIngles() {
        return nombreIngles;
    }

    public void setNombreIngles(String nombreIngles) {
        this.nombreIngles = nombreIngles;
    }

    public String getNombreCastellano() {
        return nombreCastellano;
    }

    public void setNombreCastellano(String nombreCastellano) {
        this.nombreCastellano = nombreCastellano;
    }

    public String getClave2Letras() {
        return clave2Letras;
    }

    public void setClave2Letras(String clave2Letras) {
        this.clave2Letras = clave2Letras;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getPaisesFronterizos() {
        return paisesFronterizos;
    }

    public void setPaisesFronterizos(String paisesFronterizos) {
        this.paisesFronterizos = paisesFronterizos;
    }
}
