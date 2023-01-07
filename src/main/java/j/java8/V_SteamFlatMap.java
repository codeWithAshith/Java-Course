package j.java8;

import j.java8.repo.Person;
import j.java8.repo.PersonRepository;

import java.util.List;
import java.util.stream.Collectors;

public class V_SteamFlatMap {
    public static void main(String[] args) {
        // retrieve person hobby

        System.out.println("---Hobbies---");
        List<String> hobbies = PersonRepository.getAllPersons() // list of person
                .stream() // stream of list of person
                .map(Person::getHobbies) // stream of list of string
                .flatMap(List::stream) // stream of string
                .collect(Collectors.toList());

        System.out.println(hobbies);

        System.out.println("---Distinct---");
        List<String> distinctHobbies = PersonRepository.getAllPersons() // list of person
                .stream() // stream of list of person
                .map(Person::getHobbies) // stream of list of string
                .flatMap(List::stream) // stream of string
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctHobbies);

        System.out.println("---Sort---");
        List<String> sortedDistinctHobbies = PersonRepository.getAllPersons() // list of person
                .stream() // stream of list of person
                .map(Person::getHobbies) // stream of list of string
                .flatMap(List::stream) // stream of string
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedDistinctHobbies);

        System.out.println("---Count---");
        long countHobbies = PersonRepository.getAllPersons() // list of person
                .stream() // stream of list of person
                .map(Person::getHobbies) // stream of list of string
                .flatMap(List::stream) // stream of string
                .distinct()
                .count();
        System.out.println(countHobbies);


    }
}
