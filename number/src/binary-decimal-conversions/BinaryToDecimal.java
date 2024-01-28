package binary_and_decimal_number_conversions;

public class BinaryToDecimal {
    public static void main(String args[]){
        int binary=1010
                ;
        int decimal=0;
        int base=1;
        int temp=binary;
        while(temp>0){
            int last_digit=temp%10;
            //we can,reduce one digit here also
            decimal=decimal+(last_digit*base);
            base=base*2;
            temp=temp/10;
        }
        System.out.println(decimal);
    }
}