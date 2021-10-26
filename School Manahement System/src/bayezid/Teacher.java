package bayezid;

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryearned;

    public Teacher(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryearned=0;

    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }
    public void reciveSalary(int salary){
        salaryearned+=salary;
        School.updateTotalMoneySpent(salary);
    }




}
