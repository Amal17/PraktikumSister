package Modul05;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


public class ImageClient {
    public static final int SERVICE_PORT = 14;
    public static void main(String args[])throws IOException{
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG file", "jpg");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(null);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            System. out.println("You chose to open this file: " +
            chooser. getSelectedFile().getName());
        } 

        BufferedImage image = null;
        File f = null;
        
        //read image file
        try{
            f = new File(chooser.getSelectedFile().getAbsolutePath());
            image = ImageIO.read(f);
            
        }catch(IOException e){
            System.out.println("Error: "+e);
        }

        try {
            String hostname = "localhost";
            
            System.out.println("Connection Estabilished");
            
            Socket client = new Socket(hostname, SERVICE_PORT);
            
            OutputStream out = client.getOutputStream();
            ByteArrayOutputStream imgbyte = new ByteArrayOutputStream();
            ImageIO.write(image, "jpg", imgbyte);
            byte[] size = ByteBuffer.allocate(4).putInt(imgbyte.size()).array();
            out.write(size);
            out.write(imgbyte.toByteArray());
            out.flush();
            out.close();
            client.close();
            
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
