package more_programs;
public class Check_Spy_Number {
    public static void spy(int n){
        int sum=0,product=1,temp=n;
        while (n>0){
            int last=n%10;
            sum=sum+last;
            product=product*last;
            n=n/10;
        }
        if(sum==product)
            System.out.println(temp+" is a spy number");
        else System.out.println(temp+"is not a spy number");
    }
    public static void main(String args[]){
        spy(132);
        spy(217);
    }
}
