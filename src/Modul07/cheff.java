package Modul07;

public class cheff extends Thread{
    pelayan plyn;
    int count = 0;
    public cheff(pelayan plyn)
    {
        this.plyn = plyn;
        start();
    }

    public void run()
    {
        for(;;)
        {
            count++;
            if(count<=4){
                System.out.println("Masakan "+count);
                
            }else{
                synchronized(plyn){
                    plyn.notify();
                }
                System.exit(0);
            }
            try{
                sleep(1000);
            }catch(InterruptedException ie){
            
            }
        }
    }
    
}
