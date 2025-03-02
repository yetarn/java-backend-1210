package az.familyapp;

import java.util.*;
import java.time.LocalDate;

public class Human {
    private String name;
    private String surname;
    private int birthdayYear;
    private int IQ;
    private Map<String, String> schedule;
    private Family family;
    private Set<Pet> pets;

    public Human() {
        this.schedule = new HashMap<>();
        this.pets = new HashSet<>();
    }

    public Human(String name, String surname, int birthdayYear, int IQ, Map<String, String> schedule) {
        this.name = name;
        this.surname = surname;
        this.birthdayYear = birthdayYear;
        this.IQ = IQ;
        this.schedule = schedule;
    }


    public Human(String name, String surname, int birthdayYear) {
        this();
        this.name = name;
        this.surname = surname;
        this.birthdayYear = birthdayYear;
    }

    public Human(String name, String surname, int birthdayYear, int IQ, Set<Pet> pets, Human father, Human mother, Map<String, String> schedule) {
        this(name, surname, birthdayYear);
        this.IQ = IQ;
        this.schedule = schedule;
        this.pets = pets;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }

    public int getBirthdayYear() { return birthdayYear; }
    public void setBirthdayYear(int year) { this.birthdayYear = year; }

    public int getIq() { return IQ; }
    public void setIq(int iq) { this.IQ = iq; }

    public Map<String, String> getSchedule() { return schedule; }
    public void setSchedule(Map<String, String> schedule) { this.schedule = schedule; }

    public Family getFamily() { return family; }
    public void setFamily(Family family) { this.family = family; }

    public Set<Pet> getPets() { return pets; }
    public void setPets(Set<Pet> pets) { this.pets = pets; }

    public int getAge() {
        return LocalDate.now().getYear() - birthdayYear;
    }

    public void addPet(Pet pet) {
        this.pets.add(pet);
    }

    public void removePet(Pet pet) {
        this.pets.remove(pet);
    }

    public void greetPets() {
        if (!pets.isEmpty()) {
            for (Pet pet : pets) {
                System.out.println("Hello " + pet.getNickname());
            }
        } else {
            System.out.println("I don't have pets to greet.");
        }
    }

    public void describePets() {
        if (!pets.isEmpty()) {
            for (Pet pet : pets) {
                String sly = pet.getTrickLevel() > 50 ? "very sly" : "almost not sly";
                System.out.println("I have a " + pet.getSpecies() + " who is " + pet.getAge() + " years old, and is " + sly);
            }
        } else {
            System.out.println("I don't have pets to describe.");
        }
    }

    public boolean feedPet(boolean isHungry) {
        if (!pets.isEmpty() && isHungry) {
            for (Pet pet : pets) {
                System.out.println("I will feed " + pet.getNickname());
                pet.eat();
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return birthdayYear == human.birthdayYear && IQ == human.IQ &&
                Objects.equals(name, human.name) && Objects.equals(surname, human.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthdayYear, IQ, schedule, family, pets);
    }

    @Override
    public String toString() {
        return "Human{name='" + name + "', surname='" + surname + "', year=" + birthdayYear +
                ", iq=" + IQ + ", pets=" + pets +
                ", schedule=" + schedule + "}";
    }
}





