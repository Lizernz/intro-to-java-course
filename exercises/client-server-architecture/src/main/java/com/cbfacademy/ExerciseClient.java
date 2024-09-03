package com.cbfacademy;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ExerciseClient {
public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 4040);
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))) {
             
            String message = "Hello, Server!";
            writer.write(message);
            writer.newLine();
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
