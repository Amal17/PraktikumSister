package Modul07;

public class no1_b implements Runnable {
    
    no1_a Mycnt;
    int cntA;
    
    public no1_b(no1_a cnt, int amnt)
    {
        Mycnt = cnt;
        cntA = amnt;
    }
    
    public void run()
    {
        for(int i = 1; i<=cntA; i++)
        {
            Mycnt.nmb();
            System.out.println(""+Mycnt.getNmb());
        }
    }
    
    public static void main(String[] args) throws Exception {
        no1_a x = new no1_a();
        
        Runnable rn = new no1_b(x,10);
        System.out.println("Mulai Hitung");
        Thread t1 = new Thread(rn);
        Thread t2 = new Thread(rn);
        Thread t3 = new Thread(rn);
        t1.start();
        t2.start();
        t3.start();
        
        t1.join();
        t2.join();
        t3.join();
        System.out.println("nilai "+x.getNmb());
    }
}
