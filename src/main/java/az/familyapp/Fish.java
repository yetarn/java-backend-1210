package az.familyapp;

public class Fish extends Pet {

    public Fish(Species species, String nickName, int age, int trickLevels, String[] habits) {
        super(species, nickName, age, trickLevels, habits);
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
