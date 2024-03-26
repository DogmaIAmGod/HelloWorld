package StudentManagement;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import static StudentManagement.Main.*;

public class StudentManagementSystem {
    public static void addStudent(ArrayList<Student> student) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student ID: ");
        while(!input.hasNextInt()) {
            input.nextLine();
            System.out.print("Enter student ID: ");
        }
        int id = input.nextInt();
        input.nextLine();
        System.out.print("Enter student age: ");
        while(!input.hasNextInt()) {
            input.nextLine();
            System.out.print("Enter student age: ");
        }
        int age = input.nextInt();
        input.nextLine();
        System.out.print("Enter student numeric grade: ");
        while(!input.hasNextInt()) {
            input.nextLine();
            System.out.print("Enter student numeric grade: ");
        }
        int grade = input.nextInt();
        input.nextLine();
        System.out.print("Enter student name: ");
        String name = input.nextLine();

        for (Student i : student) {
            if(i.id == id || Objects.equals(i.name, name)) {
                System.out.println("This person already exists!");
                addStudent(student);
            }
        }

        Student newStudent = new Student(id, age, grade, name);
        student.add(newStudent);
        run(student);
    }
    public static void deleteStudent(ArrayList<Student> student) {
        Scanner input = new Scanner(System.in);
        for (Student i : student) {
            System.out.println("ID: " + i.id + "| Name: " + i.name);
        }
        System.out.print("\nEnter ID of student to delete: ");
        while(!input.hasNextInt()) {
            input.nextLine();
            System.out.print("Enter ID of student to delete: ");
        }
        int deleteNum = input.nextInt();
        input.nextLine();

        for(int i = 0; i < student.size(); i++) {
            if (deleteNum == student.get(i).id) {
                student.remove(i);
                System.out.println("Deleted!");
                for (Student j : student) {
                    System.out.println("ID: " + j.id + "| Name: " + j.name);
                }
                run(student);
                break;
            }
            if (i == student.size() - 1) {
                System.out.println("Not found!");
            }
        }
    }

    public static void searchStudent(ArrayList<Student> student) {
        Scanner input = new Scanner(System.in);

        System.out.print("1 | ID\n2 | Name\nChoose search type: ");
        while(!input.hasNextInt()) {
            input.nextLine();
            System.out.print("Choose search type: ");
        }
        int choice = input.nextInt();
        input.nextLine();

        while (choice > 2) {
            System.out.print("Choose search type:\n1 | ID\n2 | Name");
            choice = input.nextInt();
            input.nextLine();
        }

        if (choice == 1) {
            System.out.print("\nEnter ID of student to search for: ");
            while(!input.hasNextInt()) {
                input.nextLine();
                System.out.print("\nEnter ID of student to search for: ");
            }
            int searchNum = input.nextInt();
            input.nextLine();
            for (int i = 0; i < student.size(); i++) {
                if (searchNum == student.get(i).id) {
                    System.out.println("ID: " + student.get(i).id + " | Name: " + student.get(i).name);
                    run(student);
                    break;
                }
                if (i == student.size() - 1) {
                    System.out.println("Not found!");
                    run(student);
                }
            }
        }

        if (choice == 2) {
            System.out.print("\nEnter name of student to search for: ");
            String searchName = input.nextLine();
            for (int i = 0; i < student.size(); i++) {
                if (Objects.equals(searchName.toLowerCase(), student.get(i).name.toLowerCase())) {
                    System.out.println("ID: " + student.get(i).id + "| Name: " + student.get(i).name);
                    run(student);
                    break;
                }
                if (i == student.size() - 1) {
                    System.out.println("Not found!");
                    run(student);
                }
            }
        }
    }

    public static void displayStudent (ArrayList<Student> student) {
        for(Student i : student) {
            System.out.print("ID: " + i.id + "\nAge: " + i.age + "\nGrade: " + i.grade + "\nName: " + i.name + "\n_______________\n");
        }
        run(student);
    }
}
