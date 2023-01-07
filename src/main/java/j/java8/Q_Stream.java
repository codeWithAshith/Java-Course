package j.java8;

import j.java8.repo.Person;
import j.java8.repo.PersonRepository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q_Stream {
    public static void main(String[] args) {
        // Person, List of hobbies
        Map<String, List<String>> map1 = PersonRepository.getAllPersons()// list of persons
                .stream() // stream of persons
                .collect(Collectors
                        .toMap(Person::getName, Person::getHobbies)); // to convert into desired type ie. Map
        System.out.println("Person Map: " + map1);

        // Person, List of hobbies
        Map<String, List<String>> map2 = PersonRepository.getAllPersons()// list of persons
                .stream() // stream of persons
                .filter(person -> person.getHeight() >= 140) // to filter height
                .collect(Collectors
                        .toMap(Person::getName, Person::getHobbies)); // to convert into desired type ie. Map
        System.out.println("Person Map: " + map2);

        // Person, List of hobbies
        Map<String, List<String>> map3 = PersonRepository.getAllPersons()// list of persons
                .stream() // stream of persons
                .filter(person -> person.getHeight() >= 140) // to filter height
                .filter(person -> person.getGender().equals("Male"))
                .collect(Collectors
                        .toMap(Person::getName, Person::getHobbies)); // to convert into desired type ie. Map
        System.out.println("Person Map: " + map3);
    }
}
