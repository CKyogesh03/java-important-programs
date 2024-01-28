package sorting.comparable.laptop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Laptop {
    private String brand;
    private int ram;
    private int price;

    public Laptop(String brand, int ram, int price) {
        super();
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

//    public int compareTo(Laptop lap2)
//
//    {
//        if (this.getPrice() > lap2.getPrice())
//            return 1; // can be any positive number
//        else
//            return -1;
//    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }
}


