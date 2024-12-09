package az.tasks.nov28;

class Cat {
    private String name;
    private int years;
    private String gender;

    private Cat(String name, int year, String species){
        this.name=name;
        this.years=years;
        this.gender=gender;
    }

    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", years=" + years +
                ", gender='" + gender + '\'' +
                '}';
    }
}