package Modul07;

public class no2 extends Thread {
    
   public void run()
   {
       System.out.println("enter");
       try {
           System.in.read();
       } catch (Exception e) {
       }
       
       synchronized (this){
           this.notifyAll();
       }
   }
   
    public static void main(String[] args) throws Exception {
        Thread ntf = new no2();
        ntf.start();
        
        synchronized (ntf)
        {
            ntf.wait();
        }
        System.out.println("Selesai");
    }
    
}
