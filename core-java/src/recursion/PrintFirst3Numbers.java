package recursion;

public class PrintFirst3Numbers {
    static int count=0;
    static void fun(){
        if (count==3){
            return;
        }
        System.out.println(count);
        count++;
        fun();
    }
    public static void main(String args[]){
        fun();
    }
}