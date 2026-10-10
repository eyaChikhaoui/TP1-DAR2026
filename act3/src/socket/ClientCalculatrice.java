package socket;
import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClientCalculatrice {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.print("Entrer l'adresse IP du serveur : ");
            String ip = sc.nextLine();

            Socket socket = new Socket(ip, 1234);
            System.out.println("Connecte au serveur " + ip);

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            while (true) {
                System.out.println("\n*** MENU ***");
                System.out.println("1. Addition");
                System.out.println("2. Soustraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Quitter");
                System.out.print("Choix : ");
                int choix = sc.nextInt();

                if (choix == 5) {
                    out.println("exit");
                    break;
                }

                System.out.print("Entrer le premier nombre : ");
                double a = sc.nextDouble();
                System.out.print("Entrer le deuxieme nombre : ");
                double b = sc.nextDouble();

                String op = switch (choix) {
                    case 1 -> "+";
                    case 2 -> "-";
                    case 3 -> "*";
                    case 4 -> "/";
                    default -> "";
                };

                out.println(a + " " + op + " " + b);

                String result = in.readLine();
                System.out.println(result);
            }

            socket.close();
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
