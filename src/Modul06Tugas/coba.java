package Modul06Tugas;

public class coba extends Thread{
    private String threadName;
    private int sum;
    private int num1, num2, num3;
    public coba(String name){
        // super();
         threadName = name; }
    public void setNum(int n1, int n2, int n3){
        num1 = n1;
        num2 = n2;
        num3 = n3;
    }
    public void run(){
        try{
            sum = num1 + num2 + num3;
            System.out.printf(" %scalculate %d+%d+%d = %d \n", threadName,num1,num2,num3,sum);
            Thread.sleep(100);
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }
}

