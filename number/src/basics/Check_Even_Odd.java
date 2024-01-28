public class Check_Even_Odd {
    static void Even_Or_Odd(int n){
        if (n%2==0)
            System.out.println(n+" : is Even");
        else //if(n%2!=0)
            System.out.println(n+" : is Odd");
    }
    public static void main(String args[]){
        Even_Or_Odd(2);
        Even_Or_Odd(3);
    }
}
