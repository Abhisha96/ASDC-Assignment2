package solid.bad.o;

public class main {
    public static void main(String[] args) {
        Employee developer = new Employee("Abhisha",26,"Developer","athaker@dal.ca","partTime");
        developer.setJobResponsibility(developer.getPosition());
        System.out.println(developer.getJobResponsibility());

        developer.setProjectType(developer.getPosition());
        System.out.println(developer.getProjectType());

        developer.setShiftTime(developer.getPosition());
        System.out.println(developer.getShiftTime());
        developer.setRoleType("partTime");

        System.out.println(developer.positionfulltimeSalary(developer.getPosition()));
        System.out.println(developer.positionPartTimeSalary(developer.getPosition()));

        System.out.println(developer.getRoleType());
    }
}
