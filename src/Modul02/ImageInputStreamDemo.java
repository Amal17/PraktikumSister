package Modul02;

import java.awt.BorderLayout;
import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Fadhil
 */
public class ImageInputStreamDemo {
    public static void main(String[] args) {
        Image image = null;
        try{
            File sourceimage = new File("D:\\Tugas\\gambar.jpg");
            image = ImageIO.read(sourceimage);
            InputStream is = new BufferedInputStream (new FileInputStream ("D:\\Tugas\\gambar.jpg"));
            image = ImageIO.read(is);
        }catch(IOException e){
            System.err.println("I/O error : "+e);
        }
        
        JFrame frame = new JFrame();
        JLabel label = new JLabel(new ImageIcon(image));
        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
