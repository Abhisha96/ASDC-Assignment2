package solid.good.o;

public class BusinessAnalyst extends Employee{
    public BusinessAnalyst(String name, int age, String emailId) {
        super(name, age, emailId);
    }
    private String position;
    private String shiftTime;
    private String jobResponsibility;

    public String getJobResponsibility() {
        return jobResponsibility;
    }
    public void setJobResponsibility(String jobResponsibility) {
        this.jobResponsibility = jobResponsibility;
    }
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
