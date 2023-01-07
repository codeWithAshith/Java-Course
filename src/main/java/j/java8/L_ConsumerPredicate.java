package j.java8;

import j.java8.repo.Person;
import j.java8.repo.PersonRepository;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;

public class L_ConsumerPredicate {
    public static void main(String[] args) {
        BiPredicate<Integer, String> heightAndGenderCheck = (height, gender) ->
                height >= 140 && gender.equals("Male");
        BiConsumer<String, List<String>> hobbiesBiConsumer = (name, hobbies) ->
                System.out.println("Name: " + name + " /Hobbies: " + hobbies);

        List<Person> personList = PersonRepository.getAllPersons();

        personList.forEach(person -> {
            if (heightAndGenderCheck.test(person.getHeight(), person.getGender())) {
                hobbiesBiConsumer.accept(person.getName(), person.getHobbies());
            }
        });
    }
}
