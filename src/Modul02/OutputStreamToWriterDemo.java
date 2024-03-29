package Modul02;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 *
 * @author Fadhil
 */
public class OutputStreamToWriterDemo {
    public static void main(String[] args) {
        try{
            OutputStream output = System.out;
            OutputStreamWriter writer = new OutputStreamWriter(output);
            writer.write("Hello World");
            writer.flush();
            writer.close();
        }catch(IOException e){
            System.err.println("I/O error : "+e);
        }
    }
}
