package j.java8;

import j.java8.repo.Person;
import j.java8.repo.PersonRepository;

public class X_StreamFilter {
    public static void main(String[] args) {
        // Filter male with height more than 140
        PersonRepository.getAllPersons()
                .stream()
                .filter(person -> person.getHeight() >= 140)
                .filter(person -> person.getGender().equals("Male"))
                .forEach(person -> System.out.println(person));
    }
}
