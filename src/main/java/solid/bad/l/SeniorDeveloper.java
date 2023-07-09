package solid.bad.l;

import static java.lang.Boolean.TRUE;

class SeniorDeveloper {
    private int name;
    private int age;
    private int salary;
    private int yearsExperience;
    Boolean canWriteCode;
    Boolean canHire;
    Boolean canReview;
    Boolean canDebug;
    Boolean canManageTeam;
    public int getYearsExperience() {
        return yearsExperience;
    }
    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }
    public int getName() {
        return name;
    }
    public void setName(int name) {
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
    public int calculateSalary() {
        return  yearsExperience*getSalary();
    }
    void writeCode(){
        canWriteCode = TRUE;
        System.out.println(canWriteCode);
    }
    void debugCode(){
        canDebug = TRUE;
        System.out.println(canDebug);
    }
    void manageTeam(){
        canManageTeam = TRUE;
        System.out.println(canManageTeam);
    }
    void reviewCode(){
        canReview = TRUE;
        System.out.println(canReview);
    }
    void hireJuniorDevelopers(){
        canHire = TRUE;
        System.out.println(canHire);
    }
}
