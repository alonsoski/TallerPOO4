package model;

public class Entrada {
    private Double precio;
    private EventoMusical evento;
    private int tipo;
    private Asistente asistente;

    public Double getPrecio() {
        return this.precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public EventoMusical getEvento() {
        return this.evento;
    }

    public void setEvento(EventoMusical evento) {
        this.evento = evento;
    }

    public int getTipo() {
        return this.tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Entrada() {
        throw new UnsupportedOperationException();
    }
}