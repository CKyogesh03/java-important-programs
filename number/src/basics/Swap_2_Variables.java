public class Swap_2_Variables {
    public static void main(String[] args) {
        int a=2,b=3;
        System.out.print("Before swap : ");
        System.out.println("a="+a+",b="+b);
        a=a+b; //2+3=5
        b=a-b; //5-3=2
        a=a-b; //5-2=3
        System.out.print("After swap : ");
        System.out.println("a="+a+",b="+b);
    }
}
