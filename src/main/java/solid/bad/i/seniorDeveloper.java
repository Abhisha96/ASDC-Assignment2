package solid.bad.i;

import static java.lang.Boolean.TRUE;

public class seniorDeveloper implements developer {
    private String Id;
    private String Name;
    private String salary;
    private String yearsExperience;

    public seniorDeveloper(String id, String name) {
        Id = id;
        Name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(String yearsExperience) {
        this.yearsExperience = yearsExperience;
    }
    private boolean canWriteCode;
    private boolean canDebugCode;
    private boolean canReviewCode;
    private boolean canManageTeam;
    private boolean canHireTeam;
    @Override
    public void writeCode() {
        canWriteCode = TRUE;
        System.out.println(canWriteCode);
    }
    @Override
    public void debugCode() {
        canDebugCode = TRUE;
        System.out.println(canDebugCode);
    }
    @Override
    public void reviewCode() {
        canReviewCode = TRUE;
        System.out.println(canReviewCode);
    }
    @Override
    public void manageTeam() {
        canManageTeam = TRUE;
        System.out.println(canManageTeam);
    }
    @Override
    public void hireTeam() {
        canHireTeam = TRUE;
        System.out.println(canHireTeam);
    }
}
