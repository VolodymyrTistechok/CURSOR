import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static country.Country.*;
import static gender.Gender.*;


public class Test {
    public static void main(String[] args) {
        List<Person> arrayPeople = new ArrayList<>();
        arrayPeople.add(new Person("Petro", 25, MALE, UKRAINE));
        arrayPeople.add(new Person("Olena", 19, FEMALE, UKRAINE));
        arrayPeople.add(new Person("Marek", 50, MALE, POLAND));
        arrayPeople.add(new Person("Rasine", 65, FEMALE, POLAND));
        arrayPeople.add(new Person("Cherina", 42, FEMALE, FRANCE));
        arrayPeople.add(new Person("Bridgett", 18, FEMALE, FRANCE));
        arrayPeople.add(new Person("Jaron", 42, MALE, ISRAEL));
        arrayPeople.add(new Person("Namir", 18, MALE, ISRAEL));
        arrayPeople.add(new Person("John", 10, MALE, USA));
        arrayPeople.add(new Person("Jane", 78, FEMALE, USA));
        arrayPeople.add(new Person("Alonzo", 12, MALE, ARGENTINA));
        arrayPeople.add(new Person("Azael", 43, FEMALE, ARGENTINA));
        arrayPeople.add(new Person("Thomas", 12, MALE, AUSTRALIA));
        arrayPeople.add(new Person("Brittney", 43, FEMALE, AUSTRALIA));

        System.out.println("Task1");

        arrayPeople.stream()
                .filter(x -> x.getAge() >= 18)
                .filter(x -> x.getAge() < 60)
                .forEach(x -> System.out.println(x.getName() + " = " + x.getGender()));

        System.out.println("---------------------------------");
        System.out.println("Task2");


        arrayPeople.stream()
                .filter(x -> x.getAge() >= 18)
                .filter(x -> x.getAge() < 60)
                .collect(Collectors.groupingBy(person -> person.getCountry().getContinent(),
                        Collectors.groupingBy(Person::getCountry,
                                Collectors.groupingBy(Person::getGender, Collectors.toList()))))
                .forEach((a, b) ->
                {
                    System.out.println(a);
                    b.forEach((c, d) -> {
                        System.out.println("     " + c);
                        d.forEach((e, f) -> {
                            System.out.println("          " + e);
                            System.out.println("               " + f);
                        });
                    });
                });

    }
}