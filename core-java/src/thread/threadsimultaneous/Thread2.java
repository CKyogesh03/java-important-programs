package threadsimultaneous;

public class Thread2 extends Thread{
    public void run(){
        for(int i=50;i<=60;i++){
            System.out.println(i);
            try{
//                use sleep to trace the simultaneous running bcoz with normal speed 1 thread completes its task before other thread works
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
