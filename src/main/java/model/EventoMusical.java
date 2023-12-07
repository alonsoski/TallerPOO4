package model;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;

import data.GestorEvento;
import model.Artista;
import model.Entrada;
import model.Asistente;

public class EventoMusical {
    private String nombre;
    private Date fecha;
    private String lugar;
    private ArrayList<Artista> artistas;
    private ArrayList<Asistente> asistentes;


    public static void main(String[] args) {
        EventoMusical e = new EventoMusical("lola",new Date(2000,12,24),"temukito",new ArrayList<Artista>(),new ArrayList<Asistente>());
        GestorEvento g = new GestorEvento();
        g.crearEvento(e);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return this.lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public ArrayList<Artista> getArtistas() {
        return this.artistas;
    }

    public void setArtistas(ArrayList<Artista> artistas) {
        this.artistas=artistas;
    }

    public EventoMusical(String nombre, Date fecha, String lugar, ArrayList<Artista> artistas, ArrayList<Asistente> asistentes) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.artistas = artistas;
        this.asistentes = asistentes;
    }

    public ArrayList<Asistente> getAsistentes() {
        return this.asistentes;
    }

    public void setAsistente(ArrayList<Asistente> asistentes) {
        this.asistentes=asistentes;
    }

    private String imprimirArtistas(){
        String texto="";
        for (int i = 0; i <this.artistas.size() ; i++) {
            texto+="-"+this.artistas.get(i).getNombre()+"\n";
        }
        return texto;
    }
    public String toString() {
        String texto="Nombre del evento:"+this.nombre+"\n" +
                "Fecha del evento:"+this.fecha+"\n" +
                "Lugar del evento:"+this.lugar+"\n" +
                "Numero de asistentes:"+this.asistentes.size()+"\n" +
                "Artistas invitados:\n"+imprimirArtistas();
        return texto;
    }
}