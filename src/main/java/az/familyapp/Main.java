package az.familyapp;

public class Main {
    public static void main(String[] args) {

        Pet dog = new Dog (Species.Dog, "Rock");

        Human mother = new Human("Jane", "Karleone", 1977);
        Human father = new Human("Vito", "Karleone", 1975);
        Human child = new Human("Michael", "Karleone", 2000, 90, dog, father, mother,new String[][]{{"Monday", "Gym"},
                {"Tuesday", "Piano class"},
                {"Wednesday", "Swimming"}});

        Family family = new Family(mother, father);
        family.addChild(child);
        family.setPet(dog);

        System.out.println("Family info: " + family);

        child.greetPet();
        child.describePet();

        dog.eat();
        dog.respond();
        dog.foul();

        family.deleteChild(0);
        System.out.println("Family members count: " + family.countFamily());
    }
}



