package solid.good.o;

public class Developer extends Employee{
    public Developer(String name, int age, String emailId) {
        super(name, age, emailId);
    }
    private String position;
    private String shiftTime;
    private String jobResponsibility;
    public String getShiftTime() {
        return shiftTime;
    }
    public void setShiftTime(String shiftTime) {
        this.shiftTime = shiftTime;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
}
