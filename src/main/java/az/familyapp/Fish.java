package az.familyapp;
import java.util.Set;

public class Fish extends Pet {

    public Fish(Species species, String nickName, int age, int trickLevel, Set<String> habits) {
        super(species, nickName, age, trickLevel, habits);
    }

    @Override
    public void eat() {
        System.out.println("Fish is eating.");
    }

    @Override
    public void foul() {
        System.out.println("Fish needs to cover it up.");
    }
}
