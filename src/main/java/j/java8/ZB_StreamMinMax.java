package j.java8;

import j.java8.repo.Person;
import j.java8.repo.PersonRepository;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class ZB_StreamMinMax {
    public static void main(String[] args) {
        // get tallest and shortest person
        Optional<Person> tallestPerson = PersonRepository.getAllPersons()
                .stream()
                .collect(Collectors.maxBy(Comparator.comparing(Person::getHeight)));

        System.out.println("Tallest Person - " + tallestPerson);
        Optional<Person> shortestPerson = PersonRepository.getAllPersons()
                .stream()
                .collect(Collectors.minBy(Comparator.comparing(Person::getHeight)));

        System.out.println("Shortest Person - " + shortestPerson);
    }
}
