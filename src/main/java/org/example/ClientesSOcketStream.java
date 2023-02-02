package org.example;

import org.example.Interfaz.Interfaz;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientesSOcketStream {


    public static void main(String[] args) {
        // try {
        new Interfaz();


          /*  System.out.println("Enviando mensaje");

            String mensaje = "mensaje desde el cliente";
            os.write(mensaje.getBytes());

            System.out.println("Mensaje enviado");



        } catch (IOException e) {
            e.printStackTrace();
        } */
    }

    public static void enviarMensaje(int opcion, String mensaje) {

        try {
            System.out.println("Creando socket cliente");
            Socket clienteSocket = new Socket();
            System.out.println("Estableciendo la conexión");
            InetSocketAddress addr = new InetSocketAddress("localhost", 5555);
            clienteSocket.connect(addr);
            InputStream is = clienteSocket.getInputStream();
            OutputStream os = clienteSocket.getOutputStream();
            DataOutputStream sos = new DataOutputStream(os);

            switch (opcion) {
                case 1 -> {
                    System.out.println("Enviando mensaje 1");
                    sos.writeInt(1);
                    sos.writeInt(Integer.parseInt(mensaje));
                }
                case 2 -> {
                    System.out.println("Enviando mensaje 2");
                    sos.writeInt(2);
                    sos.writeInt(Integer.parseInt(mensaje));
                }
                case 3 -> {
                    System.out.println("Enviando mensaje 3");
                    sos.writeInt(3);
                    sos.writeInt(Integer.parseInt(mensaje));
                }
                case 4 -> {
                    System.out.println("Enviando mensaje 4");
                    sos.writeInt(4);
                    sos.writeInt(Integer.parseInt(mensaje));
                }
                case 5 -> {
                    sos.writeInt(5);
                    System.out.println("Cerrando el socket cliente");
                    clienteSocket.close();
                    System.out.println("Terminado");
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void recibirMensaje(int opcion, String mensaje) {

        try {
            System.out.println("Creando socket cliente");
            Socket clienteSocket = new Socket();
            System.out.println("Estableciendo la conexión");
            InetSocketAddress addr = new InetSocketAddress("localhost", 5555);
            clienteSocket.connect(addr);
            InputStream is = clienteSocket.getInputStream();
            OutputStream os = clienteSocket.getOutputStream();
            DataInputStream eis = new DataInputStream(is);
            DataOutputStream sos = new DataOutputStream(os);

            switch (opcion) {
                case 1 -> {
                    System.out.println("Recibiendo mensaje 1");

                    sos.writeInt(Integer.parseInt(mensaje));
                }
                case 2 -> {
                    System.out.println("Recibiendo mensaje 2");
                    sos.writeInt(2);
                    sos.writeInt(Integer.parseInt(mensaje));
                }
                case 3 -> {
                    System.out.println("Recibiendo mensaje 3");
                    sos.writeInt(3);
                    sos.writeInt(Integer.parseInt(mensaje));
                }
                case 4 -> {
                    System.out.println("Recibiendo mensaje 4");
                    sos.writeInt(4);
                    sos.writeInt(Integer.parseInt(mensaje));
                }
                case 5 -> {
                    sos.writeInt(5);
                    System.out.println("Cerrando el socket cliente");
                    clienteSocket.close();
                    System.out.println("Terminado");
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}