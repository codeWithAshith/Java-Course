package j.java8;

import j.java8.repo.Person;
import j.java8.repo.PersonRepository;

import java.util.List;
import java.util.function.BiConsumer;

public class H_BiConsumer {
    public static void main(String[] args) {
//        To display person name and hobbies
        List<Person> personList = PersonRepository.getAllPersons();
        // Persons name - string, hobbies - List<String>
        BiConsumer<String, List<String>> hobbiesBiConsumer = (name, hobbies) -> {
            System.out.println("Name: " + name + " /Hobbies: " + hobbies);
        };
        personList.forEach((person) ->
                hobbiesBiConsumer.accept(person.getName(), person.getHobbies())
        );

//        To display person name and salary
        BiConsumer<String, Double> salaries = (name, salary) -> {
            System.out.println("Name: " + name + " /Salary: " + salary);
        };

        personList.forEach(person -> salaries.accept(person.getName(), person.getSalary()));
    }
}
