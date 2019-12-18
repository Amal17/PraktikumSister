package Modul06Tugas;

public class jumlah extends Thread {
    int no;
    int []arr1 = {6,9,1,2,3,5};
    int []arr2 = {7,11,6,4,3,1};
    int []arr3 = {5,4,3,2,1,12};
    int []hsl = new int[6];
    public jumlah(int n){
        no = n;
    }
    @Override
    public void run(){
        try{
            for(int i=0;i<arr1.length;i++){
                hsl[i] = arr1[i]+arr2[i];
            }
            if(no==1){
                System.out.println(hsl[0]);
            }else if(no==2){
                System.out.println(hsl[1]);
            }else if(no==3){
                System.out.println(hsl[2]);
            }else if(no==4){
                System.out.println(hsl[3]);
            }else if(no==5){
                System.out.println(hsl[4]);
            }else if(no==6){
                System.out.println(hsl[5]);
            }
            Thread.sleep(100);
        }catch(InterruptedException ex){
            ex.printStackTrace();
        }
        System.out.println("hasil ");
    }
    public static void main(String[] args) {
        System.out.println("pertama :");
        Thread t1 = new jumlah(1);
        System.out.println("kedua");
        Thread t2 = new jumlah(2);
        System.out.println("ketiga");
        Thread t3 = new jumlah(3);
        System.out.println("keempat");
        Thread t4 = new jumlah(4);
        System.out.println("kelima");
        Thread t5 = new jumlah(5);
        System.out.println("keenam");
        Thread t6 = new jumlah(6);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
    }
}
