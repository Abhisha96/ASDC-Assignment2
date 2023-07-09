package solid.good.i;

import static java.lang.Boolean.TRUE;

public class seniorDeveloper implements codeWriter,codeDebugger,codeReviewer,teamManager{
    private String Id;
    private String name;
    private int age;
    private int salary;
    private int yearsExperience;
    Boolean canHireTeam;
    Boolean canReviewCode;
    Boolean canDebugCode;
    Boolean canManageTeam;
    Boolean canWriteCode;

    public seniorDeveloper(String Id,String name) {
        this.Id = Id;
        this.name = name;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
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
    public void writeCode() {
        canWriteCode = TRUE;
        System.out.println(canWriteCode);
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
