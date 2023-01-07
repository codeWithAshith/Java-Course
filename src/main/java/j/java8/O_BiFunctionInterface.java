package j.java8;

import j.java8.repo.Person;
import j.java8.repo.PersonRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class O_BiFunctionInterface {
    public static void main(String[] args) {
//        <input1, input2, output>
        BiFunction<String, String, String> bf1 = (a, b) -> a.concat(b);
        System.out.println(bf1.apply("Java 8 ", "Features"));

        Predicate<Person> heightPredicate = person -> person.getHeight() >= 140;
        Predicate<Person> genderPredicate = person -> person.getGender().equals("Male");

        BiFunction<List<Person>, Predicate<Person>, Map<String, Double>> personDetails
                = (list, predicate) -> {
            Map<String, Double> map = new HashMap<>();
            list.forEach(person -> {
                if (predicate.test(person)) {
                    map.put(person.getName(), person.getSalary());
                }
            });
            return map;
        };

        List<Person> personList = PersonRepository.getAllPersons();
//        System.out.println(personDetails.apply(personList, heightPredicate));
        System.out.println(personDetails.apply(personList, heightPredicate.and(genderPredicate)));
    }
}
