package solid.good.s;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // get basic student details
        StudentInfo basicInfoS1 = new StudentInfo("B00937694");
        basicInfoS1.setName("Abhisha");
        basicInfoS1.setAge(26);
        basicInfoS1.setEmail("ab@gmail.com");
        basicInfoS1.getStudentDetails();

        // set and get course details for the student
        StudentCourse courseInfoS1 = new StudentCourse(basicInfoS1.getBannerNo());
        ArrayList<String> enrolledcourseList = new ArrayList();
        enrolledcourseList.add("Intro to Programming");
        enrolledcourseList.add("Database design");
        enrolledcourseList.add("DataStructures and Algorithms");
        courseInfoS1.getCoursesByBannerNo(enrolledcourseList);

        // set and get professor details for the course that the student has taken
        Map<String,String> professorCourse = new HashMap<>();
        professorCourse.put(enrolledcourseList.get(0),"Mr. Akshay");
        professorCourse.put(enrolledcourseList.get(1),"Mr. Rajesh");
        professorCourse.put(enrolledcourseList.get(2),"Mr. Zin Lee");
        courseInfoS1.getProfessorForCourse(professorCourse);

        //set and get fee details for the course that the student has taken
        StudentFees feeInfoS1 = new StudentFees(basicInfoS1.getBannerNo());
        Map<String,Double> courseFee = new HashMap<>();
        courseFee.put(enrolledcourseList.get(0),1000.00);
        courseFee.put(enrolledcourseList.get(1),4000.00);
        courseFee.put(enrolledcourseList.get(2),5000.00);
        System.out.println(feeInfoS1.getTotalFeesPaid(courseFee));
        feeInfoS1.getFeesbyCourse(courseFee);

        StudentGrades gradesInfoS1 = new StudentGrades(basicInfoS1.getBannerNo());
        Map<String,String> gradeCourse = new HashMap<>();
        gradeCourse.put(enrolledcourseList.get(0),"A+");
        gradeCourse.put(enrolledcourseList.get(1),"A-");
        gradeCourse.put(enrolledcourseList.get(2),"A");

        gradesInfoS1.getGradesbyCourse(gradeCourse);

        StudentInfo basicInfoS2 = new StudentInfo("923");
        basicInfoS2.setName("Nisha");
        basicInfoS2.setAge(21);
        basicInfoS2.setEmail("nt@gmail.com");
        basicInfoS2.getStudentDetails();

        // set and get course details for the student
        StudentCourse courseInfoS2 = new StudentCourse(basicInfoS2.getBannerNo());
        courseInfoS2.getCoursesByBannerNo(enrolledcourseList);

        // set and get professor details for the course that the student has taken
        courseInfoS2.getProfessorForCourse(professorCourse);

        //set and get fee details for the course that the student has taken
        StudentFees feeInfoS2 = new StudentFees(basicInfoS2.getBannerNo());

        System.out.println(feeInfoS2.getTotalFeesPaid(courseFee));
        feeInfoS2.getFeesbyCourse(courseFee);

        StudentGrades gradesInfoS2 = new StudentGrades(basicInfoS2.getBannerNo());
        gradeCourse.put(enrolledcourseList.get(0),"B-");
        gradeCourse.put(enrolledcourseList.get(1),"A+");
        gradeCourse.put(enrolledcourseList.get(2),"A");

        gradesInfoS2.getGradesbyCourse(gradeCourse);
    }
}
