package az.familyapp;

import java.util.Arrays;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private int birthdayYear;
    private int IQ;
    private String[][] schedule;
    private Family family;
    private Pet pet;

    public Human() {}

    public Human(String name, String surname, int birthdayYear) {
        this.name = name;
        this.surname = surname;
        this.birthdayYear = birthdayYear;
    }

    public Human(String name, String surname, int birthdayYear, int IQ, Pet pet, Human father, Human mother, String[][] schedule) {
        this(name, surname, birthdayYear);
        this.IQ =IQ;
        this.schedule = schedule;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getSurname() { return surname; }
    public void setSurname(String surname) { this.surname = surname; }

    public int getBirthdayYear() { return birthdayYear; }
    public void setBirthdayYear(int year) { this.birthdayYear = year; }

    public int getIq() { return IQ; }
    public void setIq(int iq) { this.IQ = iq; }

    public String[][] getSchedule() { return schedule; }
    public void setSchedule(String[][] schedule) { this.schedule = schedule; }

    public Family getFamily() { return family; }
    public void setFamily(Family family) { this.family = family; }

    public Pet getPet() {return pet;  }
    public void setPet(Pet pet) { this.pet = pet; }


    public void greetPet() {
        if (pet != null) {
            System.out.println("Hello " + pet.getNickname());
        } else {
            System.out.println("I don't have a pet to greet.");
        }
    }

    public void describePet() {
        if (pet != null) {
            String sly = pet.getTrickLevel() > 50 ? "very sly" : "almost not sly";
            System.out.println("I have a " + pet.getSpecies() + " who is " + pet.getAge() + " years old, and is " + sly);
        } else {
            System.out.println("I don't have a pet to describe.");
        }
    }

    public boolean feedPet(boolean isHungry) {
        if (isHungry) {
            System.out.println("I will feed " + pet.getNickname());
            pet.eat();
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return birthdayYear == human.birthdayYear && IQ == human.IQ &&
                name.equals(human.name) && surname.equals(human.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthdayYear, IQ, Arrays.deepHashCode(schedule), family);
    }


    @Override
    public String toString() {
        return "Human{name='" + name + "', surname='" + surname + "', year=" + birthdayYear +
                ", iq=" + IQ + ", pet=" + (pet != null ? pet.toString() : "null") +
                ", schedule=" + Arrays.deepToString(schedule) + "}";
    }
}




