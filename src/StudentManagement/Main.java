package StudentManagement;

import java.util.ArrayList;
import java.util.Scanner;

import static StudentManagement.StudentManagementSystem.*;
import static StudentManagement.SortAlgorithms.*;

public class Main {

    public static void run(ArrayList<Student> students) {
//        ArrayList<Student> students = new ArrayList<>();
//        students.add(new Student(3, 22, 85, "Alice"));
//        students.add(new Student(1, 20, 75, "Bob"));
//        students.add(new Student(2, 21, 80, "Charlie"));
        Scanner input = new Scanner(System.in);
        System.out.print("\n1 | Add Student\n2 | Delete Student\n3 | Search for Student\n4 | Display all Students\n5 | Sort Students\nWhat do you want to do: ");
        int want = input.nextInt();
        switch (want) {
            case 1:
                addStudent(students);
                break;
            case 2:
                deleteStudent(students);
                break;
            case 3:
                searchStudent(students);
                break;
            case 4:
                displayStudent(students);
                break;
            case 5:
                sortStudentsById(students);
                break;
            default:
//                run();
                System.exit(0);
                break;
        }
    }
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(3, 22, 85, "Alice"));
        students.add(new Student(1, 20, 75, "Bob"));
        students.add(new Student(2, 21, 80, "Charlie"));
        run(students);
    }
}
