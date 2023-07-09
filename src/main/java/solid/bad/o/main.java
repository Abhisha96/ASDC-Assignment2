package solid.bad.o;

public class main {
    public static void main(String[] args) {
        Employee developer = new Employee("Abhisha",26,"Developer","athaker@dal.ca","partTime");
        developer.getSalary();
        developer.getProjectType();
        double salary = developer.calculateSalary(developer.getPosition(), developer.getRoleType());
        System.out.println(salary);
    }
}
