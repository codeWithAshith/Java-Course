package j.java8;

import j.java8.repo.Person;
import j.java8.repo.PersonRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class N_FunctionInterface {
    public static void main(String[] args) {
        Predicate<Person> heightPredicate = person -> person.getHeight() >= 140;
        Predicate<Person> genderPredicate = person -> person.getGender().equals("Male");

        Function<List<Person>, Map<String, Double>> personDetails = list -> {
            Map<String, Double> map = new HashMap<>();
            list.forEach(person -> {
                if (heightPredicate.and(genderPredicate).test(person)) {
                    map.put(person.getName(), person.getSalary());
                }
            });
            return map;
        };

        List<Person> personList = PersonRepository.getAllPersons();
        System.out.println(personDetails.apply(personList));
    }
}
