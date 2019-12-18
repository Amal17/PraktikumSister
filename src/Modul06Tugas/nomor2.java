package Modul06Tugas;

import java.io.IOException;


public class nomor2 extends Thread{
//    int no;
//    public no2(int num){
//        no=num;
//    }
    
    public static void main(String[] args) throws IOException {
        System.out.println("Dokter Memeriksa Pasien...................................");
        for (int i = 1; i <=10; i++) {
            Thread d=new nomor2dokter(i);
            d.start();
        }
        //System.in.read();
        System.out.println("Perawat 1 Merawat Pasien..................................");
        for (int i = 1; i <=5; i++) {
            Thread p1=new nomor2perawat1(i);
            p1.start();
        }
        //System.in.read();
        System.out.println("Perawat 2 Merawat Pasien..................................");
        for (int i = 6; i <=10; i++) {
            Thread p2=new nomor2perawat2(i);
            p2.start();
        }
        //System.in.read();
        System.out.println("Pasien Membayar Ke Kasir...................................");
        for (int i = 1; i <=10; i++) {
            Thread k=new nomor2kasir(i);
            k.start();
        }
    }
}
