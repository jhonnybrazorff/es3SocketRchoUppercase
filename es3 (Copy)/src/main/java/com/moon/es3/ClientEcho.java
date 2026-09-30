package com.moon.es3;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class ClientEcho {
    public static void main(String[] args) {
        
        try{
            Socket cs = new Socket("localhost", 5000);
    
            System.out.println("Inserisci qualcosa: ");
            Scanner scanner = new Scanner(System.in);
            String phrase = scanner.next();


            BufferedReader in = new BufferedReader(new InputStreamReader(cs.getInputStream()));
            PrintWriter out = new PrintWriter(cs.getOutputStream() , true);
            
            
            
            out.println(phrase);
            System.out.println(in.readLine());
    
        }catch(Exception e){
    
        }
        //System.out.println("Server in ascolto su porta 5000");
    }
    

}
