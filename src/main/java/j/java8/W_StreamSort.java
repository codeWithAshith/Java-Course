package j.java8;

import j.java8.repo.Person;
import j.java8.repo.PersonRepository;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class W_StreamSort {
    public static void main(String[] args) {
        // custom sort by name
        System.out.println("---Sort by Name---");
        List<Person> sortedByName = PersonRepository.getAllPersons()
                .stream()
                .sorted(Comparator.comparing(Person::getName))
                .collect(Collectors.toList());
        System.out.println(sortedByName);

        System.out.println("---Sort and Print---");
        PersonRepository.getAllPersons()
                .stream()
                .sorted(Comparator.comparing(Person::getName))
                .forEach(person -> System.out.println(person));


        // custom sort by height
        System.out.println("---Sort and Print by height---");
        PersonRepository.getAllPersons()
                .stream()
                .sorted(Comparator.comparing(Person::getHeight))
                .forEach(person -> System.out.println(person));


        System.out.println("---Sort and Print by height reverse---");
        PersonRepository.getAllPersons()
                .stream()
                .sorted(Comparator.comparing(Person::getHeight).reversed())
                .forEach(person -> System.out.println(person));
    }
}
