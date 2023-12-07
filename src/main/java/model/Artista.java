package model;

import java.util.ArrayList;
import java.util.Date;

import data.GestorArtista;
import model.EventoMusical;

public class Artista {
    private String nombre;
    private String genero;
    private ArrayList<EventoMusical> eventosMusicales = new ArrayList<EventoMusical>();


    public static void main(String[] args) {
        EventoMusical e = new EventoMusical("lola",new Date(2000,12,24),"temukito",new ArrayList<Artista>(),new ArrayList<Asistente>());
        ArrayList<EventoMusical>lE= new ArrayList<EventoMusical>();
        lE.add(e);
        Artista a = new Artista("pepito","Rock",lE);
        GestorArtista g = new GestorArtista();
        g.agregarArtista(a);
    }

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

    public Artista(String nombre, String genero, ArrayList<EventoMusical> eventosMusicales) {
        this.nombre = nombre;
        this.genero = genero;
        this.eventosMusicales = eventosMusicales;
    }
    public String imprimirEventos(){
        String texto ="";
        for (int i = 0; i <this.eventosMusicales.size() ; i++) {
            texto+=this.eventosMusicales.get(i).getNombre()+"\n";
        }
        return texto;
    }

    @Override
    public String toString() {
        return "Nombre:"+this.nombre+"\n" +
                "Genero:"+this.genero+"\n" +
                "Eventos:\n"+imprimirEventos();
    }
}