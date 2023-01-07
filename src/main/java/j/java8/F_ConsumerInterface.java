package j.java8;

import j.java8.repo.Person;
import j.java8.repo.PersonRepository;

import java.util.List;
import java.util.function.Consumer;

public class F_ConsumerInterface {
    public static void main(String[] args) {
//        To print all persons but the goal is to print person name in caps

//        Consumer<Person> personConsumer = person -> System.out.println(person);
        Consumer<Person> personConsumer = System.out::println;

        List<Person> personList = PersonRepository.getAllPersons();
//        personList.forEach(person -> System.out.println(person));
        personList.forEach(personConsumer);

//        To print person name in caps
        System.out.println("---PERSON---");
        Consumer<Person> personNameConsumer = person -> System.out.println(person.getName().toUpperCase());
        personList.forEach(personNameConsumer);

//        Now, try to print all male person
        System.out.println("---MALE PERSON---");
        personList.forEach(person -> {
            if (person.getGender().equals("Male")){
                personNameConsumer.accept(person);
            }
        });
    }
}
