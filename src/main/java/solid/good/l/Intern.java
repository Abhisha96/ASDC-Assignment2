package solid.good.l;

public class Intern extends abstractinternDev {

    public Intern(String Id, String name, int age) {
        super(Id, name, age);
    }

    @Override
    public void writeCode() {
        System.out.println("can write code");
    }

    @Override
    public boolean setYearsExperience(int yearsExperience) {
        if(yearsExperience <= 1){
            return true;
        }
        return false;
    }

    @Override
    public boolean setSalary(double salary) {
        if(salary <= 30000){
            return true;
        }
        return false;
    }
}
