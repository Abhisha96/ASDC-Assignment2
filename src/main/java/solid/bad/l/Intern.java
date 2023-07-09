package solid.bad.l;
public class Intern extends SeniorDeveloper{
    @Override
    public int getYearsExperience() {
        return super.getYearsExperience();
    }
    @Override
    public void setYearsExperience(int yearsExperience) {
        if(yearsExperience > 1){
            throw new UnsupportedOperationException("Intern can't have more than one year experience");
        }
        super.setYearsExperience(yearsExperience);
    }
    @Override
    public int getName() {
        return super.getName();
    }
    @Override
    public void setName(int name) {
        super.setName(name);
    }
    @Override
    public int getAge() {
        return super.getAge();
    }
    @Override
    public void setAge(int age) {
        super.setAge(age);
    }
    @Override
    public int getSalary() {
        return super.getSalary();
    }
    @Override
    public void setSalary(int salary) {
        if(salary > 30000){
            throw new UnsupportedOperationException("JuniorDeveloper can't hve more than 50000 salary");
        }
        super.setSalary(salary);
    }
    public void debugCode(){
    }
    public void writeCode(){
        System.out.println("Write code");
    }
    public void manageTeam(){
    }
    public void reviewCode(){
    }
    public void hireJuniorDevelopers(){
    }
}
