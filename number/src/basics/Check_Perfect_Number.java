//pefect number : given number == sum of factors of given number
//factors should be found from 1 to before the given number(exclude given number)

public class Check_Perfect_Number {
    static void check_Perfect_Number(int x){
        int n=x;
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum=sum+i;//1 ->1+2=3 -> 3+3=6
            }
        }
        System.out.println("sum of factors of "+n+" is "+sum);
        String result=sum==n?n+" is perfect number":n+" is not perfect number";
        System.out.println(result);
    }
    public static void main(String args[]){
        check_Perfect_Number(6);
        }
}
