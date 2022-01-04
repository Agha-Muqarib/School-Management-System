package SMS;

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getSalary(){
        return this.salaryEarned;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int recieveSalary(int salary){
        this.salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
        return this.salaryEarned;
    }

}
