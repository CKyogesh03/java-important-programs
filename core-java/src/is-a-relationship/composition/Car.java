package composition;

public class Car {
    String name;
    int price;
    Engine engine;

    public Car(String name, int price, Engine engine) {
        this.name = name;
        this.price = price;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                " } \n" + engine
                ;
    }
}
