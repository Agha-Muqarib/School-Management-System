package SMS;

// Fees and particulars

public class Student {
//    private is access specifier {No access outside student class}
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int totalFees;

    //    creating a constructor - when new is called by compiler it creates a new object by initializing

//  creating an object

    public Student(int id, String name, int grade ){

        this.id = id; // it tells that id defined above in student class(this) is = id passed in parameter
        this.name = name;
        this.grade = grade;
        feesPaid = 0; // No this for it because it isn't defined as parameter
        totalFees = 30000;
    }

//    If we don't have to alter a variable there's no need to use set method
//    Set should be void, get should return something

//    Setting Values

    //     To update students grade
    public void setGrade(int grade){
        this.grade = grade;
    }

//    Update fees - Here fees can be paid in installments so the status is updated

    public void payFees(int fees){
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }


    //    Getting Values

    public int getId() {
    return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getTotalFees() {
        return totalFees;
    }

    public int getRemainingFees() {
        return totalFees -= feesPaid;
    }

}
