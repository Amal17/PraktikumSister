package Modul06Tugas;

public class threadTester {
    public static void main(String[] args) throws InterruptedException{
            int []arr1 = {6,9,1,2,3,5};
            int []arr2 = {7,11,6,4,3,1};
            int []arr3 = {5,4,3,2,1,12};
            int []jml = new int[6];
            int jum=0;
       //  multi thread
            for (int i=0; i < arr1.length ; i++){
                jml[i]=arr1[i]+arr2[i]+arr3[i];
                
                jum= jum+jml[i];
                coba st = new coba("Thread "+i+" ");
                st.setNum(arr1[i], arr2[i], arr3[i]);
                st.start();
                st.join();
            }
            System.out.println(jum);
    }
}

