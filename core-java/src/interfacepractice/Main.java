package interfacepractice;

public class Main{
    public static void main(String[] args) {
        MyInterface i=new MyInterface() {
            @Override
            public void m1() {
                System.out.println("m1() method invoked and provided body using anonymous class");
            }
        };
        i.m1(); //m1() method invoked and provided body using anonymous class
    }
}
