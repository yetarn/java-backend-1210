package az.familyapp;
import java.util.Set;

public class DomesticCat extends Pet implements Foul {
    public DomesticCat(Species species, String nickname) {
        super(species, nickname);
    }

    public DomesticCat(Species species, String nickname, int age, int trickLevel, Set<String> habits) {
        super(species, nickname, age, trickLevel, habits);
    }

    @Override
    public void eat() {
        System.out.println("DomesticCat is eating");
    }

    @Override
    public void respond() {
        System.out.println("Meow. I am your domestic cat");
    }

    @Override
    public void foul() {
        System.out.println("Oops. I dropped your meal");
    }
}

