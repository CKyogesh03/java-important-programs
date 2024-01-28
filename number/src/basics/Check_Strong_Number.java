//given number == sum of factorial digits of given number
public class Check_Strong_Number { //pending
    static void check_Strong_Number(int x){
        int n=x;
        int temp=n;
        int sum=0;
        while (n>0){
            int factorial=1;
            int last=n%10;
            for (int i=1;i<=last;i++) {
                factorial = factorial *i;
            }
            sum=sum+factorial;
            n=n/10;
        }
        System.out.println("sum of factorial digits of "+temp+" is "+sum);
        String result=sum==temp?temp+" is strong number":temp+" is not strong number";
        System.out.println(result);
    }
    public static void main(String args[]){
        check_Strong_Number(145);
        System.out.println("=====================================================");
        check_Strong_Number(123);
    }
}
