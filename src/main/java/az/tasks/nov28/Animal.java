package az.tasks.nov28;

class Animal {
    private String name;
    private int years;

    private Animal(String name, int year, String species){
        this.name=name;
        this.years=years;
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", years=" + years +
                '}';
    }
}
