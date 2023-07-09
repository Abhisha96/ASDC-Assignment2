package solid.bad.o;

public class main {
    public static void main(String[] args) {
        Employee developer = new Employee("Abhisha",26,"Developer","athaker@dal.ca");
        developer.setJobResponsibility(developer.getPosition());
        System.out.println(developer.getJobResponsibility());

        developer.setProjectType(developer.getPosition());
        System.out.println(developer.getProjectType());

        developer.setShiftTime(developer.getPosition());
        System.out.println(developer.getShiftTime());

        System.out.println(developer.positionfulltimeSalary(developer.getPosition()));

        Employee HR = new Employee("Nisha",26,"HR","nisha@dal.ca");
        HR.setJobResponsibility(HR.getPosition());
        System.out.println(HR.getJobResponsibility());

        HR.setProjectType(HR.getPosition());
        System.out.println(HR.getProjectType());

        HR.setShiftTime(HR.getPosition());
        System.out.println(HR.getShiftTime());

        System.out.println(HR.positionPartTimeSalary(HR.getPosition()));

    }
}
