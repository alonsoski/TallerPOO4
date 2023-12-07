package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaRegistroEvento extends JFrame implements ActionListener {
    private JButton bRegistrarEvento;
    private JLabel nombre;
    private JTextField tNombre;
    private JLabel mes;
    private JLabel dia;
    private JTextField tDia;
    private JTextField tMes;
    private JLabel lugar;
    private JTextField tlugar;

    public VentanaRegistroEvento(){
        this.setSize(600,600);
        JPanel pPrincipal= new JPanel(new GridLayout(5,2,10,10));
        pPrincipal.setSize(600,600);
        nombre=new JLabel("Nombre Evento");
        tNombre= new JTextField(30);
        mes=new JLabel("Mes del Evento");
        tMes= new JTextField(30);
        dia = new JLabel("Dia del evento");
        tDia=new JTextField(30);
        lugar = new JLabel("Lugar");
        tlugar=new JTextField(20);
        JPanel pS = new JPanel(new FlowLayout());
        bRegistrarEvento = new JButton("Agregar Evento");
        bRegistrarEvento.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = tNombre.getText();
                int mes = Integer.parseInt(tMes.getText());
                int dia = Integer.parseInt(tDia.getText());


            }
        });
        pS.add(bRegistrarEvento);

        pPrincipal.add(nombre);pPrincipal.add(tNombre);
        pPrincipal.add(mes);pPrincipal.add(tMes);
        pPrincipal.add(dia);pPrincipal.add(tDia);
        pPrincipal.add(lugar);pPrincipal.add(tlugar);
        pPrincipal.add(pS);

        this.add(pPrincipal);


    }

    public static void main(String[] args) {
        VentanaRegistroEvento v = new VentanaRegistroEvento();
        v.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}