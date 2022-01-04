package SMS;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Teacher Alina = new Teacher(1, "Alina", 500);
        Teacher Sonia = new Teacher(2, "Sonia", 1500);

        Student Ali = new Student(1,"Ali", 4);
        Student Saad = new Student(2,"Saad", 8);

//        For new School

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Alina);
        teacherList.add(Sonia);

        List<Student> studentList = new ArrayList<>();
        studentList.add(Ali);
        studentList.add(Saad);

        School SLBS = new School(teacherList, studentList);
        System.out.println("SLBS has earned PKR " + SLBS.getTotalMoneyEarned());

        //        To add a new teacher and retrieve the list of teachers

        Teacher Akram = new Teacher(3, "Akram", 2200);
        SLBS.addTeachers(Akram);

//        Making a student pay school fees

        Ali.payFees(5000);
        System.out.println("************* After Ali paid fees *************");
        System.out.println("SLBS has earned PKR " + SLBS.getTotalMoneyEarned());

        System.out.println("\n******************************************************************\n");

        Saad.payFees(5000);
        System.out.println("************* After Ali paid fees *************");
        System.out.println("SLBS has earned PKR " + SLBS.getTotalMoneyEarned());

        System.out.println("\n******************************************************************\n");

//        Making SLBS pay teacher's Salary

        Alina.recieveSalary(2500);
        System.out.println("************* After SLBS earns salary *************");
        System.out.println("SLBS after spending PKR " + Alina.getSalary() + " has a remaining amount of PKR " + SLBS.getTotalMoneySpent() + " to pay ID: " + Alina.getId() + " her salary.");

        System.out.println(Ali);

    }
}
