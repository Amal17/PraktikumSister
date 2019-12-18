package Modul06Tugas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;


public class nomor4server extends Thread{
    public static final int SERVICE_PORT =13;
    public void run(){
        String data;
        BufferedReader br;
        try{
            ServerSocket server=new ServerSocket(SERVICE_PORT);
            Socket nextClient;
            int count=1;
            System.out.println("Mulai..................");
            for(;;){
                nextClient=server.accept();
                System.out.println("Client Connect : /"+nextClient.getInetAddress()+"- on port : "+nextClient.getPort());
                        PrintStream pout=new PrintStream(nextClient.getOutputStream());
                        pout.print("HAY Pengunjung ke-"+count);
                        pout.flush();
                        pout.close();
                    nextClient.close();
                    
                    count++;
            }
        }catch(BindException be){
            System.err.println("Service alredy running on port "+SERVICE_PORT);
        }catch(IOException ioe){
            System.err.println("I/o error - "+ioe);
        }
    }
    public static void main(String[] args) {
        Thread t1=new nomor4server();
        t1.start();
    }
}
