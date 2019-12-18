package Modul07;

public class no1_a {
    private int cv;
    
    public no1_a()
    {
        cv = 0;
    }
    
    public no1_a(int start)
    {
        cv = start;
    }
    
    public void nmb()
    {
        int cnt = cv;
        try {
            Thread.sleep(5);
        } catch (Exception e) {
        }
        cnt = cnt + 1;
        cv = cnt;
    }
    
    public int getNmb()
    {
        return cv;
    }
}
