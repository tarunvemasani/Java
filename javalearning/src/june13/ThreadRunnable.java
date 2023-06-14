package june13;

public class ThreadRunnable implements Runnable{
    public void run() {
        for(int i=1;i<=10;i++) System.out.println(i);
    }
    public static void main(String[] args)
    {
        ThreadRunnable tr= new ThreadRunnable();
        Thread t1= new Thread(tr);
        t1.start();
        try{
            t1.join();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
