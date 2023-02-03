package org.example.Interfaz;

import org.example.ClientesSOcketStream;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz extends JFrame {
    private JButton btnPerezR, btnFurbo, btnJubilacion, btnGasofa, salir;
    JTextField editor;
    JLabel etiqueta;
    JFrame frameMenu = new JFrame();

    public Interfaz() {

        etiqueta = new JLabel();
        etiqueta.setBounds(25, 125, 435, 30);
        etiqueta.setToolTipText("Aqui va el resultado");
        etiqueta.setVisible(true);
        etiqueta.setBackground(Color.PINK);
        //etiqueta.setText(ClientesSOcketStream.recibirMensaje());



        editor = new JTextField(); //Incilaizamos el editorPane
        editor.setBounds(25, 200, 435, 30);
        editor.setEditable(true); //Habilitamos la edicion
        editor.setText(""); // Insertamos texto

        btnPerezR = new JButton("Perez Reverte");
        btnPerezR.setBounds(25, 250, 120, 50);
        btnPerezR.getName();
        btnPerezR.setToolTipText("Calcula cuantos libros te quedan para alcanzar al maestro Perez Reverte!!");
        btnPerezR.addActionListener(e -> ClientesSOcketStream.enviarMensaje(1, editor.getText()));

        btnFurbo = new JButton("Furbol");
        btnFurbo.setBounds(150, 250, 100, 50);
        btnFurbo.setToolTipText("La medida que pongas en campos de futbol");
        btnFurbo.addActionListener(e -> {
            //JOptionPane.showMessageDialog(null, "Conectando");
            ClientesSOcketStream.enviarMensaje(2, editor.getText());
        });

        btnJubilacion = new JButton("Jubilacion");
        btnJubilacion.setBounds(255, 250, 100, 50);
        btnJubilacion.setToolTipText("Calcula" +
                " los meses que te quedan para jubilarte");
        btnJubilacion.addActionListener(e -> ClientesSOcketStream.enviarMensaje(3, editor.getText()));

        btnGasofa = new JButton("Gasolina");
        btnGasofa.setBounds(360, 250, 100, 50);
        btnGasofa.setToolTipText("Calcula la diferencia con la gasolina mas barata");
        btnGasofa.addActionListener(e -> ClientesSOcketStream.enviarMensaje(4, editor.getText()));

        salir = new JButton("Salir");
        salir.setBounds(380, 320, 75, 25);
        salir.addActionListener(e -> ClientesSOcketStream.enviarMensaje(5, editor.getText()));

        /*
         * Asignamos titulo a la ventana
         * */
        frameMenu.setTitle(" Calculadora Cuñada ");
        /*
         * creamos un panel y le añadimos los botones de ayuda e inicio
         * */
        JPanel panelMenu = new JPanel();
        panelMenu.setOpaque(false);
        panelMenu.setLayout(null);
        panelMenu.setBounds(0, 0, 510, 400);

        panelMenu.add(btnPerezR);
        panelMenu.add(btnFurbo);
        panelMenu.add(btnJubilacion);
        panelMenu.add(btnGasofa);
        panelMenu.add(editor);
        panelMenu.add(salir);
        panelMenu.add(etiqueta);

        /*
         * Dentro de la venatana de inicio de menu colocamos los botones
         * a final de pagina.
         * */
        frameMenu.add(panelMenu);
        /*
         *  Asignamos tamaño de la ventana
         * */
        frameMenu.setSize(510, 400);
        /*
         *  Centra la ventana al medio de la pantalla
         * */
        frameMenu.setLocationRelativeTo(null);
        frameMenu.setVisible(true);
        frameMenu.setResizable(false);
        frameMenu.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

}
