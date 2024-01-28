/*
find -> 1.first digit-> 2. last digit -> 3.mean sum
2345
2+5=7  first+last
3+4=7  mean sum
mean sum : sum of digits except first and last digit
Xylem : (First + Last Digit) == mean sum
Phloem: (First + Last Digit) !== mean sum
 */

public class Check_Xylem_Phloem_Number {
        static void method1(){
            int n=26004;
            int temp=n;

            int last=n%10;
            System.out.println("Last Digit : "+last);
            n=n/10;  //remove last digit
            int mean_Sum=0;
            while (n>9){  //n remains last digit after this loop
                mean_Sum=mean_Sum+(n%10);
                n=n/10;
            }
            System.out.println("mean Sum : "+mean_Sum);
            int first=n;
            System.out.println("first Digit : "+first);

            int first_Last=first+last;
            System.out.println("first+last : "+first_Last);
            String result=(first_Last==mean_Sum)?temp+" is Xylem":temp+" is Phloem";
            System.out.println(result);
        }
        static void method2(){
            int n=2334,first,last,meansum=0,firstLastSum;
            for (first=n,last=n%10,first=first/10;first>9;first=first/10)
                meansum=meansum+first%10;

            firstLastSum=first+last;
            String res=(meansum==firstLastSum)?"Xylem":"Phloem";
            System.out.println(res);
        }
       static void method3(){
          int n=1357,extremeSum=0,meanSum=0,temp;
        temp=Math.abs(n);
        while(temp!=0){
            if(temp==n||temp<10)
                extremeSum+=temp%10;
            else
                meanSum+=temp%10;
            temp=temp/10;
        }
        if(extremeSum==meanSum)
            System.out.println("xylem");
        else
            System.out.println("phloem");
       }

    public static void main(String args[]){
        method2();
    }
}