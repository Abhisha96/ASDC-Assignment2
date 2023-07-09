package solid.good.s;

import java.util.Map;

public class StudentFees {
    private Double feesPaid;
    private Double startFees = 0.0;
    private String bannerNo;
    public StudentFees(String bannerNo){
        this.bannerNo = bannerNo;
    }
    public double getFeesPaid() {
        return feesPaid;
    }
    public void setFeesPaid(double feesPaid) {
        this.feesPaid = feesPaid;
    }
    public void getFeesbyCourse(Map<String,Double> courseFee){
        for(Map.Entry<String,Double> feesByCourse: courseFee.entrySet()){
            String courseName = feesByCourse.getKey();
            Double grade = feesByCourse.getValue();
            System.out.println(courseName+""+grade+""+bannerNo);
        }
    }
    public Double getTotalFeesPaid(Map<String,Double> courseFee){
        for(Double totalFees: courseFee.values())
        {
            totalFees += totalFees + startFees;
            startFees = totalFees;
        }
        return startFees;
    }
    public Double pendingFees(Double startFees){
        Double pendingFees = getFeesPaid() - startFees;
        return pendingFees;
    }
}
