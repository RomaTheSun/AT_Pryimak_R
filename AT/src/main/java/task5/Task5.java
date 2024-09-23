package task5;

import java.util.*;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        int numElements = 10;
        //maven comand mvn exec:java -Dexec.mainClass="task5.Task5" -Dexec.args="20"
        if (args.length > 0) {
            try {
                numElements = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number provided. Using default value of 10.");
            }
        }

        List<Person> people = new ArrayList<>();
        for (int i = 0; i < numElements; i++) {
            people.add(generateRandomPerson());
        }

        System.out.println("Randomly Generated Persons:");
        people.forEach(System.out::println);

        List<Person> sortedPeople = people.stream()
                .sorted(Comparator.comparing(Person::getName)
                        .thenComparing(Person::getTimestamp))
                .collect(Collectors.toList());

        System.out.println("\nSorted by name and timestamp:");
        sortedPeople.forEach(System.out::println);

        List<Person> filteredPeople = sortedPeople.stream()
                .filter(person -> person.working() && person.getFriends().size() > 2)
                .collect(Collectors.toList());

        System.out.println("\nFiltered by working status and friends > 2:");
        filteredPeople.forEach(System.out::println);

        List<String> nameTimestampList = filteredPeople.stream()
                .map(person -> person.getName() + " - " + person.getTimestamp())
                .collect(Collectors.toList());

        System.out.println("\nCollected name and timestamp list:");
        nameTimestampList.forEach(System.out::println);
    }

    public static Person generateRandomPerson() {
        Random random = new Random();
        Person person = new Person();
        person.setId((long) random.nextInt(1000));
        person.setName(generateRandomName());
        person.setWorking(random.nextBoolean());
        person.setTimestamp(System.currentTimeMillis() / 1000L + random.nextInt(1000));
        person.setFriends(generateRandomFriends());
        return person;
    }

    public static String generateRandomName() {
        String[] names = {"Alex", "Emily", "Michael", "David", "Sophia", "Chris", "Olivia", "John", "Lucas", "Emma"};
        Random random = new Random();
        return names[random.nextInt(names.length)];
    }

    public static List<String> generateRandomFriends() {
        String[] names = {"Emily", "Michael", "David", "Sophia", "Olivia", "Chris", "Emma"};
        Random random = new Random();
        int numOfFriends = random.nextInt(5);
        List<String> friends = new ArrayList<>();
        for (int i = 0; i < numOfFriends; i++) {
            friends.add(names[random.nextInt(names.length)]);
        }
        return friends;
    }
}