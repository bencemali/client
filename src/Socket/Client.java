package Socket;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    private Socket socket;
    private DataOutputStream out;

    public Client(String ip, int port) throws UnknownHostException, ConnectException {
        try {
            socket = new Socket(ip, port);

            out = new DataOutputStream(socket.getOutputStream());

        } catch (UnknownHostException e) {
            throw e;
        } catch (ConnectException e) {
            throw e;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void send(String message) {
        try {
            out.writeUTF(message);
        }
        catch(Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public void write() {
        try {
            Scanner scanner = new Scanner(System.in);
            String line;
            while ((line = scanner.nextLine()) != null) {
                out.writeUTF(line);
            }
        }
        catch(Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
