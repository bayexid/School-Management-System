package bayezid;

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feespaid;
    private int feesTotal;


    public Student (int id, String name, int grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
        this.feesTotal = 30000;
    }


    public void  setGrade(int grade) {
        this.grade = grade;
    }

    public void payFees(int fees){
        feespaid+=fees;
        School.updateTotalMoneyEarned(feespaid);
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void setFeespaid(int feespaid) {
        this.feespaid = feespaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }
    public int getRemanigFees(){
        return feesTotal-feespaid;
    }

}

