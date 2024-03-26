package StudentManagement;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import static StudentManagement.Main.run;

public class SortAlgorithms {
    public static void sortStudentsById(ArrayList<Student> student) {
        Scanner input = new Scanner(System.in);
        System.out.print("1 | Sort by ID\n2 | Sort by Age\n3 | Sort by Grade\n4 | Sort by Name\nHow would you like to sort: ");
        while(!input.hasNextInt()) {
            input.nextLine();
            System.out.print("How would you like to sort: ");
        }
        int choice = input.nextInt();
        input.nextLine();

        while(choice > 4) {
            System.out.print("1 | Sort by ID\n2 | Sort by Name\nHow would you like to sort: ");
            choice = input.nextInt();
            input.nextLine();
        }

        if(choice == 1) {
            student.sort(Comparator.comparingInt(s -> s.id));
        }
        if (choice == 4) {
            student.sort(Comparator.comparing(s -> s.name));
        }
        if (choice == 2) {
            student.sort(Comparator.comparingInt(s -> s.age));
        }
        if (choice == 3) {
            student.sort(Comparator.comparing(s -> s.grade));
        }

        for(Student i : student) {
            System.out.print("ID: " + i.id + "\nAge: " + i.age + "\nGrade: " + i.grade + "\nName: " + i.name + "\n_______________\n");
        }
        run(student);
    }
}
