package az.familyapp;
import java.util.Set;

public class Dog extends Pet {
    public Dog(Species species, String nickname) {
        super(species, nickname);
    }

    public Dog(Species species, String nickname, int age, int trickLevel, Set<String> habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    @Override
    public void respond() {
        System.out.println("Woof! I am your dog " + getNickname());
    }

    @Override
    public void foul() {
        System.out.println("Oops! I made a mess.");
    }
}

