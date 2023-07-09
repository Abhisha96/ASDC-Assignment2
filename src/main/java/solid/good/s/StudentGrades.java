package solid.good.s;

import java.util.Map;

public class StudentGrades {
    private String bannerNo;
    public StudentGrades(String bannerNo){
        this.bannerNo = bannerNo;
    }
    public void getGradesbyCourse(Map<String, String> gradesbyCourse) {
        for(Map.Entry<String,String> gradescourse: gradesbyCourse.entrySet()){
            String courseName = gradescourse.getKey();
            String grade = gradescourse.getValue();
            System.out.println(courseName+""+grade+""+bannerNo);
        }
    }
}
