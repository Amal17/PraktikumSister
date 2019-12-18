package Modul03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ParticipantSer {
    private String firstName;
    private String lastName;
    private int age;
    
    public ParticipantSer (String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    
    public void printData(){
        System.out.println("Nama\t: " + firstName + " " + lastName);
        System.out.println("Usia\t: " + age);
    }
    
    public void saveObject(ParticipantSer Obj){
        try{
            FileOutputStream fos = new FileOutputStream("data.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(Obj);
            oos.flush();
            fos.close();
        }catch(IOException e){
            System.err.println("A problem accured during serialize.\n "+e.getMessage());
        }
    }
    
    public void readObject(ParticipantSer Obj){
        try{
            FileInputStream fis = new FileInputStream("data.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Obj = (ParticipantSer) ois.readObject();
            Obj.printData();
            fis.close();
        }catch(IOException e){
            System.err.println("A problem accured during deserialize.\n" + e);
        }catch(ClassNotFoundException e){
            System.err.println("Class Not Found " + e);
        }
    }
    
    public static void main(String[] args) {
        ParticipantSer is = new ParticipantSer("Dee", "aja", 22);
        is.saveObject(is);
        is.readObject(is);
    }
}
