package Modul01;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author Fadhil
 */
public class ping {
    public static void main(String[] args) throws IOException {
        String host = "google.com";
        InetAddress ia = InetAddress.getByName(host);
        try{
            if(ia.isReachable(1000)){
                System.out.println(ia + " is Reachable");
            }else{
                System.out.println(ia + " is unReachable");
            }
        }catch(UnknownHostException ex){
            System.out.println(ex);
        }
    }
    
}
