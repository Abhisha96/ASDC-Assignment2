package solid.good.l;

public class JuniorDeveloper extends Developer  {
    public JuniorDeveloper(String Id, String name, int age) {
        super(Id, name, age);
    }

    public void writeCode(){
        System.out.println("yes, it can write code");
    }

    @Override
    public void debugCode() {
        System.out.println("yes it can debug code");
    }

    @Override
    public boolean setYearsExperience(int yearsExperience) {
        if(yearsExperience <= 5){
            return true;
        }
        return false;
    }

    @Override
    public boolean setSalary(double salary) {
        if(salary <= 50000){
            return true;
        }
        return false;
    }
}
