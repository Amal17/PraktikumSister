package Modul06Tugas;

import java.io.IOException;

public class MajuMundur extends Thread{
    static boolean jeda = false ;
    boolean berhenti;
//    @Override
//    public void suspend(){   
//        jeda = true;
//    }
//    @Override
//    public void stop(){
//        berhenti = true;
//        jeda = false;
//    }
    @Override
    public void run(){
        int i = 0;
        for(;;){
            
            try{
                Thread.sleep(500);
                if (!jeda ){
                i+=2;
                System.out.print(" "+i);
            }else if(jeda){
                i--;
                if(i%2==1){
                System.out.print(i+" ");
                }
            }
            }catch(InterruptedException ie){

            }
        }
    }
    public static void main(String[] args) throws IOException {
        Thread m = new MajuMundur();
        m.start();
        System.out.println("genap");
        System.in.read();
        m.suspend();
        jeda =true;
        
        System.in.read();
        m.resume();
        System.out.println("ganjil");
        System.in.read();
        m.stop();
    }
}
