package recursion;

public class Print1toN {
//    static int start=1;
    static void print1toN(int i,int n){
        if(i>n){
            return;
        }
        System.out.print(i);
        print1toN(i+1,n);
    }
    //using backtracking //pending
    static void f2(int i,int n){
        if(i>n){
            return;
        }
        System.out.print(i);
        f2(i+1,n);
    }
    public static void main(String[] args) {
        int n=3;
        f2(1,n);
    }
}