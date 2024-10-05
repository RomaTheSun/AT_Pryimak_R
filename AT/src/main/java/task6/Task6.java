package task6;

import task5.Person;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDAO();

        Person person = new Person();
        person.setName("Alex");
        person.setWorking(true);
        person.setTimestamp(Long.parseLong("1645532452"));
        person.setFriends(Arrays.asList("Emily", "Michael", "David"));

        personDAO.createPerson(person);

        Person fetchedPerson = personDAO.getPersonById(person.getId());
        System.out.println(fetchedPerson);

        fetchedPerson.setName("John");
        personDAO.updatePerson(fetchedPerson);

        personDAO.deletePerson(fetchedPerson.getId());
    }
}
