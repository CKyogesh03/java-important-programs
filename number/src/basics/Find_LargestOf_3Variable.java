public class Find_LargestOf_3Variable {
    static void findLargest2(){
        int a=10,b=20,c=30;
        int largest=a;
        if(b>largest)
            largest=b;
        if(c>largest)
            largest=c;
        System.out.println(largest);
    }
    static void findLargest1(){
        int a=10,b=20,c=30;
        int max=0;
        if (a>b) max=a;
        else max=b;
        if(c>max) max=c;
        System.out.println(max);
    }
    static void findLargest3(){
        int a=10,b=20,c=30;
        int max=Math.max(Math.max(a,b),c);
        System.out.println(max);
    }
    public static void main(String args[]){
        findLargest1();
        findLargest2();
        findLargest3();
    }
}
