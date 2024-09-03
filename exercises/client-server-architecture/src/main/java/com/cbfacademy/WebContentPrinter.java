package com.cbfacademy;

import java.net.URL;
import java.net.URLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class WebContentPrinter {
    public static void main(String[] args) {
        String websiteURL = "https://codingblackfemales.com";
        
        try {
            URL url = new URL(websiteURL);
            URLConnection connection = url.openConnection();

            try (BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    System.out.println(inputLine);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}