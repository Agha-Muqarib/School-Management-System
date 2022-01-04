package SMS;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;

    private static int totalMoneySpent;
    private static int totalMoneyEarned; // with static we can access the method directly

//    new school object

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

//    Getters

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

//    Setters

    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    /**
     *
     * @uodateTotalMoneyEarned adds the total money earned by school
     */

    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @updateTotalMoney Spent adds the salary given by school to the teachers
     */
    public static void updateTotalMoneySpent(int MoneySpent) {
        totalMoneySpent = totalMoneyEarned - MoneySpent;
    }
}