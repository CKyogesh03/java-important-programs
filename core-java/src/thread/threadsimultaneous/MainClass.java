package threadsimultaneous;

public class MainClass {
    public static void main(String[] args) {
        //note:t1.run() - just run as a normal method, t1.start() - create one thread and run
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        t1.start();
        t2.start();
    }
}
