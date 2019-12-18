package Modul01;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;


/**
 *
 * @author Fadhil
 */
public class ipScanner {
    public static void main(String[] args) throws UnknownHostException, IOException {
        System.out.println("Looking for Network Address");
        InetAddress ia = InetAddress.getLocalHost();
 
        System.out.println("Yout IP : " + ia.getAddress()[0] + "." + ia.getAddress()[1] + "."  + ia.getAddress()[2] + "."  + ia.getAddress()[3]);
        
        System.out.println("Scanning Your Network");
        for(int i=1; i<255; i++){
            String ip = ia.getAddress()[0] + "." + ia.getAddress()[1] + "."  + ia.getAddress()[2] + "."  + i ;
            String host = InetAddress.getByName(ip).getHostName();
            
            ia = InetAddress.getByName(host);

            if(ia.isReachable(1000)){
                System.out.println(ia + " is Reachable");
            }else{
                System.out.println(ia + " is unReachable");
            }
        }
    }
}
