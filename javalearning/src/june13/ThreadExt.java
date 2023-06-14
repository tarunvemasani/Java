package june13;
import java.lang.*;

public class ThreadExt extends Thread {
    public void run()
    {
        for(int i=1;i<=10;i++) System.out.println(i);
    }

    public static void main(String[] args)
    {
    ThreadExt t1 = new ThreadExt();
    t1.start();
    try {
        t1.join();
    }catch(Exception e){
        e.printStackTrace();
    }
    }
}
