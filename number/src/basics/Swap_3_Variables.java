public class Swap_3_Variables {
    public static void main(String[] args) {
        int a=10, b=20, c=30;

        System.out.print("Before swap : ");
        System.out.println("a="+a+",b="+b+",c="+c);
        a=a+b+c;//10+20+30=60

        //b->a,c->b,a->c
        b=a-(b+c);//60-(10+30)=10 //a  //don’t use this without paranthesis//60-10+30=80
        c=a-(b+c);//60-(10+30)=20 //b
        a=a-(b+c);//60-(10+20)=30 //c
        System.out.print("After swap : ");
        System.out.println("a="+a+",b="+b+",c="+c);
    }
}
