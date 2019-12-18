package Modul02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Fadhil
 */
public class InputStreamToReaderDemo {
    public static void main(String[] args) {
        try{
            System.out.println("Please enter your name: ");
            InputStream input = System.in;
            InputStreamReader reader = new InputStreamReader(input);
            BufferedReader bufReader = new BufferedReader(reader);
            String name =  bufReader.readLine();
            System.out.println("Please to meet you, "+name);
        }catch(IOException e){
            System.err.println("I/O error : " + e);
        }
    }
}
