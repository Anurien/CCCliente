package org.example;

import org.example.Interfaz.Interfaz;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientesSOcketStream {


    public static void main(String[] args) {
        // try {



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
            InputStream is;
            OutputStream os;
            is = clienteSocket.getInputStream();
            os = clienteSocket.getOutputStream();
            switch (opcion) {
                case 1:
                    System.out.println("Enviando mensaje");
                    os.write(1);
                    os.write(mensaje.getBytes());
                case 2:
                    System.out.println("Enviando mensaje");
                    os.write(2);
                    os.write(mensaje.getBytes());
                case 3:
                    System.out.println("Enviando mensaje");
                    os.write(3);
                    os.write(mensaje.getBytes());
                case 4:
                    System.out.println("Enviando mensaje");
                    os.write(4);
                    os.write(mensaje.getBytes());
                case 5:
                    os.write(5);
                    System.out.println("Cerrando el socket cliente");

                    clienteSocket.close();

                    System.out.println("Terminado");


            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}