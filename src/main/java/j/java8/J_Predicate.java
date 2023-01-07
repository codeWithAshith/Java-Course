package j.java8;

import j.java8.repo.Person;
import j.java8.repo.PersonRepository;

import java.util.List;
import java.util.function.Predicate;

public class J_Predicate {
    public static void main(String[] args) {
        // Print all persons with male height 140
        Predicate<Person> heightPredicate = person -> person.getHeight() >= 140;
        Predicate<Person> genderPredicate = person -> person.getGender().equals("Male");

        List<Person> personList = PersonRepository.getAllPersons();

        personList.forEach(person -> {
            if (heightPredicate.and(genderPredicate).test(person)) {
                System.out.println(person);
            }
        });
    }
}
