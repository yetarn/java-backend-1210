package az.tasks.nov30;

class Manager extends Employee {
    private int teamSize;

    Manager(String name, double salary, int teamSize){
        super(name,salary);
        this.teamSize=teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }
    @Override
    public void displayinfo() {
        System.out.println("Name: " + getName() + ", Salary: " + getSalary() + ", Team Size: " + teamSize);
    }

}
