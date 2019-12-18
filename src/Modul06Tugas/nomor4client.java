package Modul06Tugas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class nomor4client {
    public static final int SERVICE_PORT =13;
    public static void main(String[] args) {
                String hostname="localhost";
                String data;
        try {
            Socket daytime=new Socket(hostname, SERVICE_PORT);
            System.out.println("Connection Established");
             BufferedReader br=new BufferedReader(new InputStreamReader(daytime.getInputStream()));
             data=br.readLine();
             System.out.println(data);
             daytime.close();
        } catch (IOException ex) {
            System.out.println(ex+"    ");
        }
    }
}
