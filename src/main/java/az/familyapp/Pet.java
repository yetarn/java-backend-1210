package az.familyapp;

import java.util.Arrays;

public abstract class Pet implements Foul {
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;
    private Species species;

    public Pet(){

    }

    public Pet(Species species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(Species species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public String getNickname() {return nickname;}

    public void setNickname(String nickname) {this.nickname = nickname;}

    public int getAge() {return age;}

    public void setAge(int age) {this.age = age;}

    public int getTrickLevel() {return trickLevel;}

    public void setTrickLevel(int trickLevel) {this.trickLevel = trickLevel;}

    public String[] getHabits() {return habits;}

    public void setHabits(String[] habits) {this.habits = habits;}

    public Species getSpecies() {return species;}

    public void setSpecies(Species species) {this.species = species;}

    public void eat() {
        System.out.println("I am eating.");
    }

    public void respond() {
        System.out.println("Hello, owner. I am " + nickname + ". I miss you!");
    }

    @Override
    public String toString() {
        return species + "{nickname='" + nickname + "', age=" + age + ", trickLevel=" + trickLevel + ", habits=" + Arrays.toString(habits) + "}";
    }

    @Override
    public abstract void foul();

    private static class PetCleanupAction implements Runnable {
        @Override
        public void run() {
            System.out.println("Pet object is being cleaned up.");
        }
    }
}

