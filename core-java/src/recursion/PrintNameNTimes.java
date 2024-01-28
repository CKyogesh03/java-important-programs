package recursion;

public class PrintNameNTimes {
    static void printName(int i,int n){
        if (i>n){  //base condition or case
            return;
        }
        System.out.println("Yogesh");
        printName(i+1,n);
    }
    public static void main(String[] args) {
        int n=3;
        printName(1,n);
    }
}
