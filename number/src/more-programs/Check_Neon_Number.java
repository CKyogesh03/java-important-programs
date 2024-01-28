//given number == square of given digits->sum of result digits
package more_programs;
public class Check_Neon_Number {
    static void check_Neon_Number(int x){
        int n=x;
        int square=n*n;
        int sum=0;
        while (square>0){
            int last=square%10;
            sum=sum+last;
            square=square/10;
        }
        System.out.println("sum of square digits of "+n+" is "+sum);
        String result=(n==sum)?n+" is neon number":n+" is not a neon number";
        System.out.println(result);
    }
    static void check_Neon_Number2(int x){

    }
    public static void main(String args[]){
        check_Neon_Number(9);
        check_Neon_Number(10);
        check_Neon_Number(5);
    }
}