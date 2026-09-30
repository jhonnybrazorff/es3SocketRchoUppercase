package com.moon.es3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEcho { 
    public static void main(String[] args) {
          try{
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("Server in ascolto su porta 5000");
        Socket cs = ss.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(cs.getInputStream()));
        PrintWriter out = new PrintWriter(cs.getOutputStream() , true);
        
    }catch(Exception e) {
    
    }
   
    }
  

}
