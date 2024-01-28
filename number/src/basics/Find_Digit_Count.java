public class Find_Digit_Count {

    static void usingStringValueOf(){
        int n=345;
        int digit=String.valueOf(n).length();
        System.out.println(digit);
    }

    public static void main(String args[]){
        int n=345;
        int count=0;
        while (n>0){ //n>=1//don't give n>=0 bcoz 0/10 is 0 so n assigned to 0 then infinite loop will occurs.
            count++;
            n=n/10;
        }
        System.out.println(count);
        //

        usingStringValueOf();
    }
}