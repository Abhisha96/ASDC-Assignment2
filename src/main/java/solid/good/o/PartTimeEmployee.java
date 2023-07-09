package solid.good.o;

public class PartTimeEmployee extends Employee {
    private double salary;
    private String position;

    public void setSalary(double salary) {
        this.salary = salary*200;
    }
    public double getSalary(){
        return salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public PartTimeEmployee(String name, int age, String emailId) {
        super(name, age, emailId);
    }
}
