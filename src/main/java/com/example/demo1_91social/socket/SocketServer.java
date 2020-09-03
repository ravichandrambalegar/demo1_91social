package com.example.demo1_91social.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class SocketServer {
    public static void main(String[] args) {
        try {
            System.out.println(" S : Server is Started :::: ");
            ServerSocket serverSocket = new ServerSocket(9898);
            Socket socket=serverSocket.accept();
            System.out.println(" S : Client is Connected :::: ");
            BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String s = bufferedReader.readLine();
            System.out.println(" S : Client Data is ::: "+s);
            String serverData= "Response From Server";
            OutputStreamWriter outputStreamWriter= new OutputStreamWriter(socket.getOutputStream());
            PrintWriter printWriter = new PrintWriter(outputStreamWriter);
            printWriter.println(serverData);
            printWriter.flush();
            System.out.println(" S :  Data is Sent From Server is ::: "+serverData);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
