import java.util.Scanner;
public class Calculator {
    public static void main(String args[]){
        Scanner s= new Scanner(System.in);
        int result=0;
        System.out.print("Enter operator to perform operation : ");
        char operator=s.next().trim().charAt(0);
        if(operator=='+'||operator=='-'||operator=='*'||operator=='/'||operator=='%'){
            System.out.print("Enter 2 numbers : ");
            int n1=s.nextInt();
            int n2=s.nextInt();
            if(operator=='+'){
                result=n1+n2;
            }
            if(operator=='-'){
                result=n1-n2;
            }
            if(operator=='*'){
                result=n1*n2;
            }
            if(operator=='/'){
                result=n1/n2;
            }
            if(operator == '%'){
                result=n1%n2;
            }
            System.out.println(result);
        }
        else
            System.err.println("Invalid operator");

    }
}