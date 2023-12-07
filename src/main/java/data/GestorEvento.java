package data;

import model.EventoMusical;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GestorEvento {

    public void crearEvento(EventoMusical evento) {
        File archivo = new File("./agenda/"+evento.getNombre()+".txt");
        try {
            archivo.createNewFile();
        } catch (IOException e) {
            System.out.println("no se ha podido crear el archivo evento");
        }
        escribirEvento(evento);

    }

    private void escribirEvento(EventoMusical evento) {
        File archivo = new File("./agenda/"+evento.getNombre()+".txt");
        try {
            FileWriter fw=new FileWriter(archivo);
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write(evento.toString()+"asdasdas");
            bw.flush();
        }catch (IOException e){
            System.out.println("no se ha podido escribir en el archivo");
        }
    }

    public Boolean eventoExitste(EventoMusical evento){
        File archivo = new File("./"+evento.getNombre());
        if(archivo.exists()){
            return true;
        }else {
            return false;
        }
    }
}