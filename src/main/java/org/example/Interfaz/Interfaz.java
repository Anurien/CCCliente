package org.example.Interfaz;

import javax.swing.*;

public class Interfaz extends JFrame {
    private JButton btnPerezR, btnFurbo, btnJubilacion, btnGasofa, salir;
    JEditorPane editor;

    JFrame frameMenu = new JFrame();

    public Interfaz() {

        editor = new JEditorPane(); //Incilaizamos el editorPane
        editor.setBounds(25, 200, 435, 30);
        editor.setContentType("text/plain"); // Marcamos el editor para que use texto plano
        editor.setText(""); // Insertamos un trozo de HTML
        editor.setEditable(true); //Habilitamos la edicion

        btnPerezR = new JButton("Perez Reverte");
        btnPerezR.setBounds(25, 250, 120, 50);
        btnPerezR.setToolTipText("Calcula cuantos libros te quedan para alcanzar al maestro Perez Reverte!!");
        // btnPerezR.addActionListener(new HelpButton());

        btnFurbo = new JButton("Furbol");
        btnFurbo.setBounds(150, 250, 100, 50);
        btnFurbo.setToolTipText("La medida que pongas en campos de futbol");
        //  btnFurbo.addActionListener(new HelpButton());

        btnJubilacion = new JButton("Jubilacion");
        btnJubilacion.setBounds(255, 250, 100, 50);
        btnJubilacion.setToolTipText("Calcula" +
                " los meses que te quedan para jubilarte");
        //  btnJubilacion.addActionListener(new HelpButton());

        btnGasofa = new JButton("Gasolina");
        btnGasofa.setBounds(360, 250, 100, 50);
        btnGasofa.setToolTipText("Calcula la diferencia con la gasolina mas barata");
        //  btnGasofa.addActionListener(new HelpButton());

        salir = new JButton("Salir");
        salir.setBounds(380, 320, 75, 25);
        //  btnGasofa.addActionListener(new HelpButton());

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
