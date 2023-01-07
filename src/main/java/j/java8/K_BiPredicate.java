package j.java8;

import j.java8.repo.Person;
import j.java8.repo.PersonRepository;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class K_BiPredicate {
    public static void main(String[] args) {
        BiPredicate<Integer, String> heightAndGenderCheck = (height, gender) -> {
            return height >= 140 && gender.equals("Male");
        };
        List<Person> personList = PersonRepository.getAllPersons();
        personList.forEach(person -> {
            if (heightAndGenderCheck.test(person.getHeight(), person.getGender())) {
                System.out.println(person);
            }
        });
    }
}
