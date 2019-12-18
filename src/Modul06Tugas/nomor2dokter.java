package Modul06Tugas;

public class nomor2dokter extends Thread{
    int hit;
    public static int count=0;
    public nomor2dokter(int num){
        hit=num;
    }
    public void run(){
        try{
            Thread.sleep(500);
            System.out.println("Pasien ke-"+hit+" Diperiksa Dokter");
            count++;
            if(count==10){
                System.out.println("Dokter Sudah Memerikas "+count+" Pasien");
            }
        }catch(InterruptedException ie){
            System.out.println("Not Finish");
        }
    }
}
