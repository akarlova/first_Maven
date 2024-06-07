package org.example.socket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ClientSocket {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 8081);
        PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), StandardCharsets.UTF_8), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream(), StandardCharsets.UTF_8));
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);

        System.out.println("Server: " + in.readLine());
        String userInput = scanner.nextLine();
        out.println(userInput);
        String serverResponse = in.readLine();
        System.out.println("Server: " + serverResponse);

        if (serverResponse.equals("Що таке паляниця?")) {
            userInput = scanner.nextLine();
            out.println(userInput);
            serverResponse = in.readLine();
            System.out.println("Server: " + serverResponse);
        }
        System.out.println("Server: " + in.readLine());

        out.close();
        socket.close();
    }
}
