/*
natural number starts from 1.
method 1 - using for loop - sum(1 to given number).
method 2 - using formula -
 */

public class Sum_Of_N_Natural_Numbers {
    static void method1(){
        int n=5;
        int temp=n;
        int sum=0;
        while (n>0){
            sum=sum+n;
            n--;
        }
        System.out.println("sum of "+temp+" natural numbers: "+sum);
    }
    static void method2(){
        int n=5;
        int sum=n*(n+1)/2;
        System.out.println("sum of "+n+" natural numbers: "+sum);
    }

    static void method3(){
        int n=5,sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("sum of "+n+" natural numbers: "+sum);
    }
    public static void main(String args[]){
        method1();
        method2();
        method3();
    }
}
