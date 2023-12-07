package model;

import java.util.ArrayList;
import model.EventoMusical;

public class Artista {
    private String nombre;
    private String genero;
    private ArrayList<EventoMusical> eventosMusicales = new ArrayList<EventoMusical>();

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Artista() {

    }

    @Override
    public String toString() {
        return this.nombre+";"+this.genero+";";
    }
}