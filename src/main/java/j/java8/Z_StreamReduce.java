package j.java8;

import j.java8.repo.Person;
import j.java8.repo.PersonRepository;

import java.util.Optional;

public class Z_StreamReduce {
    public static void main(String[] args) {
        // return name of person in a string
        String names = PersonRepository.getAllPersons()
                .stream()
                .map(Person::getName)
                .reduce("", (a, b) -> a.concat(b)); // "" - initial value , so does return optional

        System.out.println(names);

        // return tallest person
        Optional<Person> tallestPerson = PersonRepository.getAllPersons()
                .stream()
                .reduce((x, y) -> x.getHeight() > y.getHeight() ? x : y); // no initial value so returns optional person
        System.out.println(tallestPerson.get());
    }
}
