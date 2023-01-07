package j.java8;

import j.java8.repo.Person;
import j.java8.repo.PersonRepository;

public class ZA_StreamMapFilterReduce {
    public static void main(String[] args) {
        // return count of kids
        int count = PersonRepository.getAllPersons()
                .stream()
                .filter(person -> person.getHeight() >= 140)
                .filter(person -> person.getGender().equals("Male"))
                .map(Person::getKids)
                .reduce(0, (x, y) -> x + y);

        System.out.println("Count of kids - " + count);
    }
}
