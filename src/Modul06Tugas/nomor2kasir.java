package Modul06Tugas;

public class nomor2kasir extends Thread{
    int hit;
    public static int count;
    public nomor2kasir(int num){
        hit=num;
    }
    public void run(){
        try{
            Thread.sleep(500);
            System.out.println("Pasien ke-"+hit+" Membayar Ke Kasir");
            count++;
            if(count==10){
                System.out.println(count+" Pasien Sudah Membayar Pada Kasir"); 
            }
        }catch(InterruptedException ie){
            System.out.println("Not Finish");
        }
    }
}
