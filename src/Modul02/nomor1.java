package Modul02;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;

/**
 *
 * @author Fadhil
 */
public class nomor1 {
    public static void main(String[] args) {
        String text = "";
        String path = "D:\\Tugas\\output.txt";
        try{
            InputStream fileInput = new FileInputStream ("D:\\Tugas\\input.txt");
            int data = fileInput.read();
            while (data != -1){
                text += ((char)data);
                data = fileInput.read();
            }
            fileInput.close();
            
            FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(text);
            bw.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
