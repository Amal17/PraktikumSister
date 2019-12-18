package Modul06Tugas;

public class nomor2perawat2 extends Thread{
    int hit;
    public static int count;
    public nomor2perawat2(int num){
        hit=num;
    }
    public void run(){
        try{
            Thread.sleep(500);
            System.out.println("Pasien ke-"+hit+" DiRawat Perawat 2");
            count++;
            if(count==5){
                System.out.println("Perawat 2 Sudah Merawat "+count+" Pasien"); 
            }
        }catch(InterruptedException ie){
            System.out.println("Not Finish");
        }
    }
}
