package solid.bad.o;

public class Employee {
    private String name;
    private int age;
    private String position;
    private double salary;
    private String jobResponsibility;
    private String reportingManagerName;
    private String projectType;
    private String roleType;
    private String emailId;
    private String shiftTime;

    public Employee(String name, int age, String position, String emailId, String roleType) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.emailId = emailId;
        this.roleType = roleType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setShiftTime(String position){
        if(this.position == "Developer") {
            this.shiftTime = "Morning";
        } else if (this.position == "HR") {
            this.shiftTime = "Noon";
        }else if (this.position == "Manager"){
            this.shiftTime = "Evening";
        }else if(this.position == "Business Analyst"){
            this.shiftTime = "Night";
        }else {
            this.shiftTime = "No Time";
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJobResponsibility() {
        return jobResponsibility;
    }

    public void setJobResponsibility(String position) {
        if(this.position == "Developer"){
            this.jobResponsibility = "code";
        } else if (this.position == "HR") {
            this.jobResponsibility = "hirefire";
        }else if(this.position == "Manager"){
            this.jobResponsibility = "getworkfrompeople";
        }else if(this.position == "Business Analyst"){
            this.jobResponsibility = "requirementgathering";
        }else{
            this.jobResponsibility = "employee";
        }
    }

    public String getReportingManagerName() {
        return reportingManagerName;
    }

    public void setReportingManagerName(String reportingManagerName) {
        this.reportingManagerName = reportingManagerName;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String position) {
        if(this.position == "Developer"){
            this.projectType = "Project A";
        } else if (this.position == "HR") {
            this.projectType = "University";
        }else if(this.position == "Manager"){
            this.projectType = "Project B";
        }else if(this.position == "Business Analyst"){
            this.projectType = "Project C";
        }else{
            this.projectType = "No Project";
        }
    }
    public double positionfulltimeSalary(String position){
        if(this.position == "Developer") {
            this.salary = 50000.00;
        } else if (this.position == "HR") {
            this.salary = 40000.00;
        }else if (this.position == "Manager"){
            this.salary = 60000.00;
        }else if(this.position == "Business Analyst"){
            this.salary = 70000.00;
        }else {
            this.salary = 20000.00;
        }
        return this.salary;
    }

    public double positionPartTimeSalary(String position){
        int constPartTime = 200;
        if(this.position == "Developer") {
            this.salary = 50000.00 - constPartTime;
        } else if (this.position == "HR") {
            this.salary = 40000.00 - constPartTime;
        }else if (this.position == "Manager"){
            this.salary = 60000.00 - constPartTime;
        }else if(this.position == "Business Analyst"){
            this.salary = 70000.00 - constPartTime;
        }else {
            this.salary = 20000.00 - constPartTime;
        }
        return this.salary;
    }
    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getShiftTime() {
        return shiftTime;
    }
}
