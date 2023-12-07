package data;

import model.Artista;
import model.EventoMusical;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GestorArtista {

    public void agregarArtista(Artista artista) {
        File archivo = new File("./artistas/"+artista.getNombre()+".txt");
        try {
            archivo.createNewFile();
        } catch (IOException e) {
            System.out.println("no se ha podido crear el archivo artista\n"+e);
        }
        escribirArtista(artista);

    }


    private void escribirArtista(Artista artista) {
        File archivo = new File("./artistas/"+artista.getNombre()+".txt");
        try {
            FileWriter fw=new FileWriter(archivo);
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write(artista.toString());
            bw.flush();
        }catch (IOException e){
            System.out.println("no se ha podido escribir en el archivo\n"+e);
        }
    }

    public Boolean artistaExitste(Artista artista){
        File archivo = new File("./artista/"+artista.getNombre()+".txt");
        if(archivo.exists()){
            return true;
        }else {
            return false;
        }
    }
}