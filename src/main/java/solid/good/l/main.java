package solid.good.l;

public class main {
    public static void main(String[] args) {
        seniorDev dev = new SeniorDeveloper("101","Abhisha",26);

        abstractinternDev intern = new Intern("102","Nisha",19);
        intern.writeCode();

        Developer juniordev = new JuniorDeveloper("291","ASASA",232);
        juniordev.debugCode();
        juniordev.setSalary(1000);
        juniordev.setYearsExperience(1);

        //seniorDev intern = new Intern("102","Nisha",89);
        //intern.writeCode();
    }
}
