package thread;


public class ThreadTest extends Thread {
    static long count = 0;

    public void run() {
        for (int i=1;i<=1000;i++){
            count++;
        }
        System.out.println("thread name :"+ currentThread().getName());
    }
    public static void main(String args[]){
        ThreadTest t1=new ThreadTest();
        ThreadTest t2=new ThreadTest();
        ThreadTest t3=new ThreadTest();
        t1.start();
        t2.start();
        t3.start();
        System.out.println("end");
        System.out.println(count);
    }
}