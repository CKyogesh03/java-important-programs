//next number = current + previous number
//3rd number = 1st number + 2nd number

public class Fibonacci_Series {
    /*
    if (n1==n||n2==n){  //
            System.out.println("0 and 1 are initial values to find third fibonacci");
        }
     */
    static void givenNumberIsFibonacciOrNot(int n){
        int n1=0,n2=1,iteration=0;
        boolean isFibonacci=false;
            for (int i = 3; i <= n; i++) {
                int n3 = n1 + n2;
                if (n3<=n) {  //to stop unwanted iterations: if found fibonacci > given number to check fibonacci or not
                    iteration++;
                    if (n3 == n) { //execute if found fibonaccii == given no to check fibonacci or not
                        isFibonacci = true;
                        break;
                    }
                    n1 = n2;
                    n2 = n3;
                }
                else break;

            }
            System.out.println("No.of iterations : "+iteration);
            String result=(isFibonacci==true)?(n+" is a fibonacci number"):(n+" is not a fibonacci number");
            System.out.println(result);
    }
    static void fibonacci_Series(int no_of_series){
        int n1=0,n2=1,n3;
        System.out.print(n1); //1st number
        System.out.print(" "+n2); //2nd number
        //from 3rd series
        for (int i=3;i<=no_of_series;i++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
    static void fibonacci_Series2(int no_of_series){
        int n1=0,n2=1,n3;
        System.out.print(n1); //1st number
        System.out.print(" "+n2); //2nd number
        //no.of next series
        for (int i=1;i<=no_of_series;i++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
    //pending
    static void fibonacci_Series3(int no_of_series){
        int num1=0,num2=1;
        int count=2;
        System.out.print(num1+" "+num2+" ");
        while (count<=no_of_series){
            int temp=num2;
            num2=num2+num1;
            System.out.print(num2+" ");
            num1=temp;
            count++;
        }

    }
    // pending program logic
    //from 6th to 11th position // sum 10 positions // 6th position=nth position    //4160
    static void sum10_FibonacciSeries_FromGivenNthFibonacciPosition(){
        int n1=0,n2=1,nthPosition=6;
        int NumberOfSeriesToSumFromNthPosition=10;
        int currentPosition=3; //0,1,?(0+1)
        int count=2;
        int sum=0;
        for (int i=currentPosition;i<=nthPosition+NumberOfSeriesToSumFromNthPosition;i++){
            count++;
            int n3=n1+n2;
            if (count>=nthPosition){
                sum=sum+n3;
            }
            n1=n2;
            n2=n3;
        }
        System.out.println(sum);
    }

    static void recursive_Fibonacci_Series(int n){

    }
    public static void main(String[] args) {
//        fibonacci_Series(10);
//        System.out.println();
//        fibonacci_Series2(3);
//        System.out.println();
//        recursive_Fibonacci_Series(10);
//        fibonacci_Series3(7); //doubt //7th fibonacci number is 13
        givenNumberIsFibonacciOrNot(100000); //24 th iteration // not a fibonacci
        givenNumberIsFibonacciOrNot(121393); //25 th iteration // fibonacci
//        fibonacci_Series3(50);
        sum10_FibonacciSeries_FromGivenNthFibonacciPosition();
    }
}
