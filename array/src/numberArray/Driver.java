package numberArray;

class Parent{
    Parent(){
        System.out.println("constructor from parent");
    }
    static{
        System.out.println("static block from parent");
    }
    {
        System.out.println("non static block from parent");
    }
}
class Child extends Parent{
    Child(){
        System.out.println("constructor from child");
    }
    static{
        System.out.println("static block from child");
    }
    {
        System.out.println("non static block from child");
    }

}
public class Driver {
    public static void main(String args[]){
//        Parent p=new Parent(); //1
        Child c=new Child(); //2
        System.out.println("**********************");
        Child c2=new Child(); //3 // 2 & 3
//        //upcasting  //3
//        Parent p=new Child();  //loads same like child object creation
//        //downcasting  //4
//        Child c=(Child)p; //no constructor is invoked, no new object is created so nothing is invoked
    }
}
