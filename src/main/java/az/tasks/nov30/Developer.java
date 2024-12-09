package az.tasks.nov30;

class Developer extends Employee {
    private String progLang;

    Developer(String name, double salary, String progLang) {
        super(name, salary);
        this.progLang = progLang;
    }

    public String getProgLang() {
        return progLang;
    }

    public void setProgLang(String progLang) {
        this.progLang = progLang;
    }

    public void displayinfo() {
        System.out.println("Name: " + getName() + ", Salary: " + getSalary() + ", Programming Language " + progLang);
    }

}