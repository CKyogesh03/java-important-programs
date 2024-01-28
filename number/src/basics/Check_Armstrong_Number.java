public class Check_Armstrong_Number {   //pending
    static void check_Armstrong(){
        int n=153;
        int temp=n;
        int count=0;
        int sum=0; //sum_Of_Power_Digits
        while (n>0){  //finding power count
            count++;
            n=n/10;
        }
        System.out.println("Power : "+count);
        n=temp; //reload

        while (n>0){  //n!=0
            int last=n%10;
            int product=1;
            for (int i=1;i<=count;i++){
                product=product*last; //3*3*3=27 -> 5*5*5=125 -> 1*1*1=1
            }

            sum=sum+product; // 27 -> 27+125=152 -> 152+1=153
            n=n/10;
        }
        System.out.println("sum of power digits of : "+temp+" is "+sum);
        String result=sum==temp?temp+" is Armstrong":temp+" is not an armstrong";
        System.out.println(result);
    }
    static void check_Armstrong_method2(){
        int n=123;
        int temp=n;
        int count=0;
        int sum=0; //sum_Of_Power_Digits
        while (n>0){  //finding digit count for power
            count++;
            n=n/10;
        }
        System.out.println("Power : "+count);
        n=temp;  //reload

        while (n>0){  //n!=0
            int last=n%10;
            sum=sum+(int)Math.pow(last,count); // 27 -> 27+125=152 -> 152+1=153
            n=n/10;
        }
        System.out.println("sum of power digits : "+sum);
        String result=sum==temp?temp+" is Armstrong":temp+" is not an armstrong";
        System.out.println(result);
    }
    public static void main(String args[]){
        check_Armstrong();
        System.out.println("==================================================================");
        check_Armstrong_method2();
    }
}
