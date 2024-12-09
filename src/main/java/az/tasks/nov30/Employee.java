package az.tasks.nov30;

class Employee {
    private String name;
    private double salary;

    Employee(String name, double salary){
      this.name=name;
      this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    void displayinfo(){
        System.out.println("Name: " + name + "Salary: " + salary);
    }

    public double calculateBonus(double percentage, double fixedAmount) {
        return salary * (percentage / 100) + fixedAmount;
    }
}
