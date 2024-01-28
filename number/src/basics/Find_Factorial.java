//factorial
//0!=1,1!=1
// 5!=5*4*3*2*1->120 (or) 1*2*3*4*5
public class Find_Factorial {
    public static void main(String args[]){
        int factorial=1; //any value multiplied with 0 is 0. so 1 is stored initially
        int n=5,temp=n;

        for (int i=1;i<=n;i++){
            factorial=factorial*i;
        }
        System.out.println("factorial of "+temp+" is : "+factorial);
    }
}