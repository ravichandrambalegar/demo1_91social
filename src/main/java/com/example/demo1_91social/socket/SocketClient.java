package com.example.demo1_91social.socket;

import java.io.*;
import java.net.Socket;

public class SocketClient {
    public static void main(String[] args) {
        String ip= "localhost";
        int port=9898;
        try {
            Socket socket=new Socket(ip,port);
            String s= "Checking Socket Connectivity";
            OutputStreamWriter outputStreamWriter= new OutputStreamWriter(socket.getOutputStream());
            PrintWriter printWriter = new PrintWriter(outputStreamWriter);
            printWriter.println(s);
            printWriter.flush();

            BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String str = bufferedReader.readLine();
            System.out.println(" C : Server Data in Client Side is  :::: "+str);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
