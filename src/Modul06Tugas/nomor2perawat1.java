package Modul06Tugas;

public class nomor2perawat1 extends Thread{
    int hit;
    public static int count;
    public nomor2perawat1(int num){
        hit=num;
    }
    public void run(){
        try{
            Thread.sleep(500);
            System.out.println("Pasien ke-"+hit+" DiRawat Perawat 1");
            count++;
            if(count==5){
                System.out.println("Perawat 1 Sudah Merawat "+count+" Pasien"); 
            }
        }catch(InterruptedException ie){
            System.out.println("Not Finish");
        }
    }
}
