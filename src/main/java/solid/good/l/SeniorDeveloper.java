package solid.good.l;

import static java.lang.Boolean.TRUE;

public class SeniorDeveloper extends seniorDev{
    private String Id;
    private String name;
    private int age;

    public SeniorDeveloper(String Id,String name,int age ){
        super(Id,name,age);
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
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

    Boolean canWriteCode;
    Boolean canHire;
    Boolean canReview;
    Boolean canDebug;
    Boolean canManageTeam;
    public void writeCode(){
        System.out.println("yes, it can write code");
    }

    @Override
    public void debugCode() {
        System.out.println("yes it can debug code");
    }

    @Override
    public boolean setYearsExperience(int yearsExperience) {
        if(yearsExperience > 5){
            return true;
        }
        return false;
    }

    @Override
    public boolean setSalary(double salary) {
        if(salary >= 50000){
            return true;
        }
        return false;
    }
    public void manageTeam(){
        canManageTeam = TRUE;
        System.out.println(canManageTeam);
    }
   public void reviewCode(){
        canReview = TRUE;
        System.out.println(canReview);
    }
    public void hireJuniorDevelopers(){
        canHire = TRUE;
        System.out.println(canHire);
    }
}
