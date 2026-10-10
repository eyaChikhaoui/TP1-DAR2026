package clientPackage;

import java.io.IOException;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {
        try {
            // 1ère étape : création de l'objet Socket côté client
            System.out.println("Je suis un client pas encore connecté...");
            Socket socket = new Socket("localhost", 1234);
            System.out.println("Je suis un client connecté.");

            // 2ème étape : fermeture de la socket
            socket.close();
            System.out.println("Connexion fermée.");


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}