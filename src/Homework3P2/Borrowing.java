package Homework3P2;

import java.util.*;

@SuppressWarnings("SpellCheckingInspection")
public class Borrowing {
    static String individualName, title, statusType,materialType;
    static void borrow(ArrayList<Student> s, ArrayList<Teacher> t, ArrayList<Book> b, ArrayList<Research> r,ArrayList<int[]> record) {
        Scanner userInput = new Scanner(System.in);
        Main goBack = new Main(t,s,b,r,record);
        int checkoutIndividual, checkoutItem;
        String[] personType = {"Teacher", "Student"}, material = {"Book", "Research Paper"};

        System.out.print("\nWho is checking out:\n1 | Teacher\n2 | Student\nInput: ");
        int individualType = userInput.nextInt(); userInput.nextLine();
                for (int i = 0; i < t.size(); i++) {
                    switch(individualType-1) {
                        case 0:
                            System.out.print((i + 1) + " | " + t.get(i).TeacherName + "\n");
                            break;
                        case 1:
                            System.out.print((i + 1) + " | " + s.get(i).StudentName + "\n");
                            break;
                    }
                }
                System.out.print("Which " +  (personType[individualType-1]) +": ");
                checkoutIndividual = userInput.nextInt()-1; userInput.nextLine();

        System.out.print("What is being checked out:\n1 | Book\n2 | Research Paper\nInput: ");
        int checkoutType = userInput.nextInt(); userInput.nextLine();

        for (int i = 0; i < t.size(); i++) {
            switch (checkoutType) {
                case 1:
                    System.out.print((i + 1) + " | " + b.get(i).BookTitle + "\n");
                    break;
                case 2:
                    System.out.print((i + 1) + " | " + r.get(i).ResearchTitle + "\n");
                    break;
            }
        }
        System.out.print("Which " + material[checkoutType-1] +": ");
        checkoutItem = userInput.nextInt()-1; userInput.nextLine();


        int[] borrowerBook = {checkoutIndividual, individualType, checkoutItem, checkoutType};
        System.out.println(Arrays.toString(borrowerBook));
        if(!record.isEmpty()) {
            for (int[] ints : record) {
                if (borrowerBook[2] == ints[2] && borrowerBook[3] == ints[3]) {
                    if (ints[1] == 1) {
                        individualName = t.get(ints[0]).TeacherName;
                    } else {
                        individualName = s.get(ints[0]).StudentName;
                    }

                    if (ints[3] == 1) {
                        title = b.get(ints[2]).BookTitle;
                    } else {
                        title = r.get(ints[2]).ResearchTitle;
                    }

                    System.out.println("\n" + title + " is already checked out to " + individualName + "\n");
                    goBack.task(1);
                }
            }
        }
        record.add(borrowerBook);
        goBack.task(1);
    }

    static void checkBorrow(ArrayList<Student> s, ArrayList<Teacher> t, ArrayList<Book> b, ArrayList<Research> r,ArrayList<int[]> record) {
        Main goBack = new Main(t,s,b,r,record); System.out.println();
        if(!record.isEmpty()) {
            for (int[] ints : record) {
                if (ints[1] == 1) {
                    statusType = "Teacher";
                    individualName = t.get(ints[0]).TeacherName;
                } else {
                    statusType = "Student";
                    individualName = s.get(ints[0]).StudentName;
                }

                if (ints[3] == 1) {
                    materialType = "Book";
                    title = b.get(ints[2]).BookTitle;
                } else {
                    materialType = "Research Paper";
                    title = r.get(ints[2]).ResearchTitle;
                }

                System.out.println(statusType + " " + individualName + " has " + materialType + ": \"" + title + "\" checked out.");
            }
            System.out.println();
            goBack.task(1);
        } else {
            System.out.print("\nThere are no books checked out\n");
            goBack.task(1);
        }
    }
}
