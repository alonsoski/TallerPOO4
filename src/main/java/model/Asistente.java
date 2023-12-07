package model;

import java.util.ArrayList;
import model.Entrada;
import model.EventoMusical;

public class Asistente {
    private String nombre;
    private int numero;
    private ArrayList<String> preferencias;
    private ArrayList<Entrada> entrada = new ArrayList<Entrada>();
    public ArrayList<EventoMusical> eventosMusicales = new ArrayList<EventoMusical>();

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<String> getPreferencias() {
        throw new UnsupportedOperationException();
    }

    public void setPreferencias(ArrayList<String> preferencias) {
        throw new UnsupportedOperationException();
    }

    public Asistente() {
        throw new UnsupportedOperationException();
    }

    public void cancelarEvento() {
        throw new UnsupportedOperationException();
    }
}