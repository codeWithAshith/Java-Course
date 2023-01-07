package j.java8;

import j.java8.repo.Person;
import j.java8.repo.PersonRepository;

import java.util.List;
import java.util.stream.Collectors;

public class R_Stream {
    public static void main(String[] args) {
        List<String> personHobbies = PersonRepository.getAllPersons() // list of persons
                .stream() // stream of persons
                .map(Person::getHobbies) // Stream<List<String>
                .flatMap(List::stream) // Stream<String>
                .distinct() // remove duplicates
                .toList();

        System.out.println(personHobbies);
    }
}
