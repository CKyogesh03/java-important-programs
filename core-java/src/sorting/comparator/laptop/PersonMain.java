package sorting.comparator.laptop;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonMain {
    public static void main(String[] args) {
        Map<String, Person> peopleMap = new HashMap<>();
        peopleMap.put("1", new Person("Alice", 30));
        peopleMap.put("2", new Person("Bob", 25));
        peopleMap.put("3", new Person("Charlie", 35));

        // Sort by Key (String)
        LinkedHashMap<String, Person> sortedByKey = peopleMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, // merge function, not used in this context
                        LinkedHashMap::new
                ));

        System.out.println("Sorted by Key:");
        sortedByKey.forEach((key, value) -> System.out.println(key + ": " + value));

        // Sort by Value (e.g., by Person's Age)
        Comparator<Map.Entry<String, Person>> byAge = Map.Entry.comparingByValue(Comparator.comparing(Person::getAge));

        LinkedHashMap<String, Person> sortedByAge = peopleMap.entrySet()
                .stream()
                .sorted(byAge)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));

        System.out.println("\nSorted by Age:");
        sortedByAge.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}

