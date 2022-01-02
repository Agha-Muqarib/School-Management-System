package SMS;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;

    private int totalMoneyEarned;
    private int totalMoneySpent;

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

    public void setTotalMoneyEarned(int totalMoneyEarned) {
        this.totalMoneyEarned = totalMoneyEarned;
    }

    public void setTotalMoneySpent(int totalMoneySpent) {
        this.totalMoneySpent = totalMoneySpent;
    }
}