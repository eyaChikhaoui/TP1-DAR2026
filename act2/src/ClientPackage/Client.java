package ClientPackage;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            //Connexion au serveur
            Socket socket = new Socket("localhost", 2050);
            System.out.println("Connecte au serveur.");

            // Creation des flux de communication
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in);

            // Saisie d’un entier
            System.out.print("Entrez un entier : ");
            int x = scanner.nextInt();

            // Envoi au serveur
            out.println(x);

            // Reception du resultat
            String resultat = in.readLine();
            System.out.println("Resultat reçu du serveur : " + resultat);

            // Fermeture
            in.close();
            out.close();
            socket.close();
            scanner.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

