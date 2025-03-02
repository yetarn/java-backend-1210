package az.familyapp;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> dogHabits = new HashSet<>(Arrays.asList("barking", "chewing"));
        Pet dog = new Dog(Species.Dog, "Rock", 3, 75, dogHabits);

        Human mother = new Human("Jane", "Karleone", 1977);
        Human father = new Human("Vito", "Karleone", 1975);

        Map<String, String> schedule = new HashMap<>();
        schedule.put("Monday", "Gym");
        schedule.put("Tuesday", "Piano class");
        schedule.put("Wednesday", "Swimming");

        Human child = new Human("Michael", "Karleone", 2000, 90, schedule);

        Family family = new Family(mother, father);
        family.addChild(child);
        family.addPet(dog);

        System.out.println("Family info: " + family);
        System.out.println("Family members count: " + family.countFamily());
    }
}
