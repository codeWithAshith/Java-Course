package j.java8;

import j.java8.repo.Person;
import j.java8.repo.PersonRepository;

import java.util.List;
import java.util.stream.Collectors;

public class T_StreamMap {
    public static void main(String[] args) {
        // get all names and convert to upper case
        List<String> personNameInUpperCase = PersonRepository.getAllPersons()
                .stream()
                .map(Person::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(personNameInUpperCase);
    }
}
