package Modul07;

public class pelayan extends Thread{
    public pelayan(){
        start();
    }
    public void run() {
        
            for(;;)
            {
                try{
                    synchronized (this){
                        this.wait();
                    }
                }catch(InterruptedException ie){
                
                }
                System.out.println("Pelayan Mengantar");
            }
        } 
    }
    

