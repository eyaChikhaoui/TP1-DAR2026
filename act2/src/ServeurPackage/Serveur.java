package ServeurPackage;
import java.io.*;
import java.net.*;
public class Serveur {
    public static void main(String[] args) {
        try {
            // Creation du serveur
            ServerSocket serveurSocket = new ServerSocket(2050);
            System.out.println("Serveur en attente de connexion...");

            //Attente et acceptation d’une connexion client
            Socket socket = serveurSocket.accept();
            System.out.println("Client connecte ");

            //Creation des flux d'entree et sortie
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            //Lecture du nombre envoye par le client
            String message = in.readLine();
            int x = Integer.parseInt(message);
            System.out.println("Nombre reçu du client : " + x);

            // Calcul
            int resultat = x * 5;
            System.out.println("Resultat du calcul (x*5) = " + resultat);

            // Envoi du resultat au client
            out.println(resultat);

            // Fermeture
            in.close();
            out.close();
            socket.close();
            serveurSocket.close();
            System.out.println("Serveur arrete.");

        } catch (IOException e) {
            e.printStackTrace();}
    } }




