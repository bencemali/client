package Socket;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            System.out.print("Enter ip address: ");
            String ip = scanner.nextLine();
            System.out.print("Enter port number: ");
            int port = scanner.nextInt();
            Client client = new Client(ip, port);
            if(client != null) {
                client.write();
            }
        }
        catch(Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
