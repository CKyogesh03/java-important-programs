//find last digit
//add last digits into the reversed number
public class Reverse_Number {
    public static void main(String args[]){
        int n=12345;
        int reversed=0;
        while(n>0){ //n!=0
            int last=n%10;
            reversed=reversed*10+last;
            n=n/10;
        }
        System.out.println(reversed);
    }
}
