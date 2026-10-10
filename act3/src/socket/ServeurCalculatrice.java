package socket;
import java.io.*;
import java.net.*;
public class ServeurCalculatrice {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getLocalHost();  // adresse IP reelle
            ServerSocket serveur = new ServerSocket(1234, 1, ip);
            System.out.println("serveur en attente sur IP : " + ip.getHostAddress());
            Socket socket = serveur.accept();
            System.out.println("client connecte depuis : " + socket.getInetAddress());
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            String operation;
            while ((operation = in.readLine()) != null) {
                if (operation.equalsIgnoreCase("exit")) break;

                String[] parts = operation.split(" ");
                double a = Double.parseDouble(parts[0]);
                String op = parts[1];
                double b = Double.parseDouble(parts[2]);
                double result = 0;

                switch (op) {
                    case "+": result = a + b; break;
                    case "-": result = a - b; break;
                    case "*": result = a * b; break;
                    case "/": result = (b != 0) ? a / b : Double.NaN; break;
                    default: out.println("Operateur invalide."); continue;
                }
                out.println("Resultat = " + result);
            }

            socket.close();
            serveur.close();
            System.out.println("Serveur arrete.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}