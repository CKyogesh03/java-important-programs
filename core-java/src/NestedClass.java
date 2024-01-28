class Outer{
    private int a=10;
    static int b=20;
    static void print(){
        System.out.println("hii"+b); //a - not accessible inside static
    }
    class Inner{
        static int c=30;
        static void print(){
            System.out.println("hii "+Outer.b); // a(non-static) not accessible in static method
        }
        void msg(){System.out.println("sum is :"+(a+b));}
    }
}
public class NestedClass{
    public static void main(String args[]) {
        Outer.print();
        System.out.println(Outer.b);
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        Outer.Inner.print();//hii
        i.msg();//sum is :50

    }
}