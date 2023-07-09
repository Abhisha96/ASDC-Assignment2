package solid.good.i;

import static java.lang.Boolean.TRUE;

public class Manager implements teamManager{
    private String Id;
    private String Name;
    private String salary;
    private String yearsExperience;

    public Manager(String id, String name) {
        Id = id;
        Name = name;
    }

    Boolean canManageTeam;
    Boolean canHireTeam;

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
