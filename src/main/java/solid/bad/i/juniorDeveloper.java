package solid.bad.i;

import static java.lang.Boolean.TRUE;

class juniorDeveloper implements developer {
    private String Id;
    private String Name;
    private String salary;
    private String yearsExperience;

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

    juniorDeveloper(String ID, String Name){
        this.Id = Id;
        this.Name = Name;
    }
    private boolean canWriteCode;
    private boolean canDebugCode;
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
        // not supported
    }
    @Override
    public void manageTeam() {
        // not supported
    }
    public void hireTeam(){
    }
}
