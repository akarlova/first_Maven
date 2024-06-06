package org.example.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.LocalTime;


public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(8081);
        Socket clientSocket = serverSocket.accept();
        System.out.println("Client connected");
        PrintWriter out = new PrintWriter(new OutputStreamWriter(clientSocket.getOutputStream(), StandardCharsets.UTF_8), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream(), StandardCharsets.UTF_8));

        out.println("Hello!");
        String clientGreeting = in.readLine();
        System.out.println("Client: " + clientGreeting);

        if (clientGreeting != null && clientGreeting.matches(".*[ёъыэЁЪЫЭ].*")) {
            out.println("Що таке паляниця?");
            String answer = in.readLine();
            if (answer.equalsIgnoreCase("хліб")) {
                LocalDate nowDate = LocalDate.now();
                LocalTime nowTime = LocalTime.now();
                out.println("That's right! Local date and time: " + nowDate + " " + nowTime);
            } else {
                out.println("Wrong answer. You are disconnected from the server. Bye");
            }
        } else {
            out.println("You are welcome");
        }
        out.println("See you later");
        out.close();
        clientSocket.close();
        serverSocket.close();
        System.out.println("Client disconnected");
    }
}
