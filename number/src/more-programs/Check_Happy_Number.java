/*
simple happy numbers: 1, 10, 100, 1000,10000....
*/
package more_programs;
public class Check_Happy_Number {
    static void check_Happy_Number(int x){
        int n=x;
        int sum=square_Sum(n);
        System.out.println("sum : "+ sum);
        String result=(sum==1)?n+" is happy number":n+" is Unhappy number";
        System.out.println(result);
    }
    static int square_Sum(int x){
        int n=x;
        int sum=0;
        while (n>0) {
            int last = n % 10;
            int square=last*last;//(int)Math.pow(last,2);
            sum = sum + square; //square and sum all digits
            n = n / 10;
        }
        System.out.println("tracing sum : "+sum);
        return sum>9?square_Sum(sum):sum; // if sum > 9, then do recursively untill sum<9
    }
    public static void main(String args[]){
        check_Happy_Number(7);
        System.out.println("======================================");
        check_Happy_Number(1);
        System.out.println("======================================");
        check_Happy_Number(4);
    }
}