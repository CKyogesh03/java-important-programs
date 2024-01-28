
// prime
public class Check_Prime_Number {
    //using boolean  //2 to n-1
    static void check_Prime_method1(int x){
        int n=x;
        boolean isPrime=true;
        for(int i=2;i<n;i++){
            if(n%i==0)   //use n%i don't use i%n
                isPrime=false;
        }
        String result= isPrime?n+" is Prime":n+" is not Prime";
        System.out.println(result);
    }
    //using count //2 to n-1
    static void check_Prime_method2(int x){
        int n=x;
        int count=0;  //boolean isPrime;
        for(int i=2;i<n;i++){
            if(n%i==0)
                count++;  //isPrime=true;
        }
        String result= count==0?n+" is Prime":n+" is not Prime";
        System.out.println(result);
    }
    //using count // 1 to n
    static void check_Prime_method3(int x){
            int n=x;
            int count=0;  //boolean isPrime;
            for(int i=1;i<=n;i++){
                if(n%i==0)
                    count++;  //isPrime=true;
            }
            String result= count==2?n+" is Prime":n+" is not Prime";
            System.out.println(result);
    }
    static void find_Prime_Numbers_In_Range(int from,int to){
        System.out.println("finding prime numbers from the range of "+from+" to "+to);
        for (int i=from;i<=to;i++){
            check_Prime_method1(i);
        }
    }
    public static void main(String args[]){
        check_Prime_method1(9);
        check_Prime_method2(7);
        check_Prime_method3(5);
        System.out.println("==============================================================");
        find_Prime_Numbers_In_Range(2,30);

    }
}