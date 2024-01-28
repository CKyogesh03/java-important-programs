//modulus by 10

public class Find_Last_Digit {
    static int last_Digit(int n){
        return n%10;
    }

    public static void main(String[] args) {
        System.out.println("last digit : "+last_Digit(45678));
    }
}