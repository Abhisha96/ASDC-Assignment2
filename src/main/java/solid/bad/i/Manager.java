package solid.bad.i;

public class Manager implements developer{
    private String Id;
    private String Name;
    private String salary;
    private String yearsExperience;

    public Manager(String id, String name) {
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
    private boolean canManageTeam;
    private boolean canHireTeam;
    @Override
    public void writeCode() {
    }

    @Override
    public void debugCode() {
    }

    @Override
    public void reviewCode() {
    }

    @Override
    public void manageTeam() {
        canManageTeam = true;
        System.out.println(canManageTeam);
    }

    @Override
    public void hireTeam() {
        canHireTeam = true;
        System.out.println(canHireTeam);
    }
}
