//remove last digit untill a number > greater then 9
//then first digit is found
public class Find_First_Digit {
    static int first_Digit(int n){
        while (n>9){
            n=n/10;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println("first digit : "+first_Digit(45678));
    }
}
