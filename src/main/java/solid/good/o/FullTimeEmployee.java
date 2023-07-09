package solid.good.o;

public class FullTimeEmployee extends Employee {
    private double salary;
    private String position;

    public void setSalary(double salary) {
        this.salary = salary*400;
    }

    public String getPosition() {
        return position;
    }
    public double getSalary(){
        return salary;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public FullTimeEmployee(String name, int age,String emailId) {
        super(name,age,emailId);
    }
}
