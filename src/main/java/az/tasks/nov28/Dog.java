package az.tasks.nov28;

class Dog {
    private String name;
    private int years;
    private String color;

    private Dog (String name, int year, String color){
        this.name=name;
        this.years=years;
        this.color=color;
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", years=" + years +
                ", color='" + color + '\'' +
                '}';
    }
}

