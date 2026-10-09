package serverPackage;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        try {
            // 1ère étape : création de l'objet ServerSocket
            ServerSocket serverSocket = new ServerSocket(1234);
            System.out.println("Je suis un serveur en attente de la connexion d'un client...");

            // 2ème étape : attendre la connexion du client
            Socket socket = serverSocket.accept();
            System.out.println("Un client est connecté.");

            // 3ème étape : fermeture des sockets
            socket.close();
            serverSocket.close();
            System.out.println("Connexion terminée, serveur arrêté.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}