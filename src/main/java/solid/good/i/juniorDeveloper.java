package solid.good.i;

import static java.lang.Boolean.TRUE;

public class juniorDeveloper implements codeWriter,codeDebugger {
    private String Id;
    private String Name;
    private String salary;
    private String yearsExperience;
    private Boolean canWriteCode;
    private Boolean canDebugCode;
    public String getId() {
        return Id;
    }

    public juniorDeveloper(String id, String name) {
        Id = id;
        Name = name;
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
    public void writeCode(){
        canWriteCode = TRUE;
        System.out.println(canWriteCode);
    }
    public void debugCode(){
        canDebugCode = TRUE;
        System.out.println(canDebugCode);
    }
}
