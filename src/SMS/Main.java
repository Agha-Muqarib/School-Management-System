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


    }
}
