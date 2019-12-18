package Modul02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author Fadhil
 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        InputStream fileInput = new FileInputStream ("D:\\Tugas\\input.txt");
        int data = fileInput.read();
        while (data != -1){
            System.out.print((char)data);
            data = fileInput.read();
        }
        fileInput.close();
    }
}
