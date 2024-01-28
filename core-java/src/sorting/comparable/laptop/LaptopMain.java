package sorting.comparable.laptop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LaptopMain {
    public static void main(String[] args) {

            List<Laptop> laps = new ArrayList<>();
            laps.add(new Laptop("Dell", 16, 800));
            laps.add(new Laptop("Apple", 8, 1200));
            laps.add(new Laptop("hp", 12, 700));

            //way1
//            Collections.sort(laps);
//
//            for (Laptop l : laps) {
//                System.out.println(l);
//            }
            //way2 sort
//        //Lambda expression for sorting by age
//        Comparator<Laptop> compareByPrice=(Laptop l1, Laptop l2)->l1.getPrice()-l2.getPrice();
//        laps.sort(compareByPrice);
//        System.out.println(laps);

        //using stream api
        Comparator<Laptop> compareByBrand= Comparator.comparing(Laptop::getBrand);
        Comparator<Laptop> compareByPrice= Comparator.comparing(Laptop::getPrice);
        Comparator<Laptop> compareByRam= Comparator.comparing(Laptop::getRam);

        //sort only based on price
        List<Laptop> sortedByPrice= laps.stream().sorted(compareByPrice)
                .collect(Collectors.toList());

        System.out.println(sortedByPrice);

        //sort only based on ram
        List<Laptop> sortedByRam= laps.stream().sorted(compareByRam)
                .collect(Collectors.toList());

        System.out.println(sortedByRam);

        //sort based on multiple properties like price and ram
        //note: when sorting - if multiple laptops have same price then it sort based ram
        List<Laptop> sortedByPriceAndRam= laps.stream().sorted(compareByPrice.thenComparing(compareByRam))
                .collect(Collectors.toList());

        System.out.println(sortedByPriceAndRam);


        //sort based on multiple properties like price, ram and brand
        //note: when sorting - if multiple laptops have same price,then multiple ram also same ,then sort based on brand
        List<Laptop> sortedByPriceAndRamAndBrand= laps.stream().sorted(compareByPrice.thenComparing(compareByRam).thenComparing(compareByBrand))
                .collect(Collectors.toList());

        System.out.println(sortedByPriceAndRam);
    }
    }