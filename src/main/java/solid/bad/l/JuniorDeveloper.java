package solid.bad.l;

class JuniorDeveloper extends SeniorDeveloper{
    @Override
    public int getYearsExperience() {
        return super.getYearsExperience();
    }
    @Override
    public void setYearsExperience(int yearsExperience) {
        if(yearsExperience > 5){
            throw new UnsupportedOperationException("Junior Developer can't have more than 5 years of experience");
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
        if(salary > 50000){
            throw new UnsupportedOperationException("JuniorDeveloper can't hve more than 50000 salary");
        }
        super.setSalary(salary);
    }
    public void debugCode(){
        System.out.println("Able to debug");
    }
    public void writeCode(){
        System.out.println("Write code");
    }
    public void manageTeam(){
        super.manageTeam();
    }
    public void reviewCode(){
    }
    public void hireJuniorDevelopers(){
    }
}
