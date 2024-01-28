package composition;

public class CarEngineDriver {
    public static void main(String args[]){
        Engine e1=new Engine("Thunder","Diesel",1000);
        Car c1=new Car("Mustang",5_000_00,e1);

        Engine e2=new Engine("Electro","electric",500);
        Car c2=new Car("BMW",3_000_00,e2);

        System.out.println(c1);
        System.out.println(c2);

}
}