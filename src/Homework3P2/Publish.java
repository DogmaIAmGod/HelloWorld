package Homework3P2;

import java.util.ArrayList;
import java.util.Scanner;

public class Publish {
    Main inMain;
    int personType;


    public Publish(Main main, int type) {
        inMain = main;
        personType = type;
    }

    public void publishMaterial(Publish publish, ArrayList<Book> book, ArrayList<Research> research) {
        Scanner input = new Scanner(System.in);
        int materialType = 0; String bGenre = "";
        String[][] material = {{"Book","Title", "Author","Description","URL","Genre"}, {"Research Paper","Title","Author","Abstract","URL"}};
        switch (publish.personType) {
            case 2: {
                System.out.println("1 | Publish Book\n2 | Publish Research");
                int publishType = input.nextInt(); input.nextLine();
                materialType = publishType-1;
                break;
            }
            case 3: {
                materialType = 1;
                break;
            }
        }
        System.out.print("Input " + material[materialType][0] + " " + material[materialType][1] + ": ");
        String bTitle = input.nextLine();
        System.out.print("Input " + material[materialType][0] + " " + material[materialType][2] + ": ");
        String bAuthor = input.nextLine();
        if(materialType == 0) {
            System.out.print("Input " + material[materialType][0] + " " + material[materialType][5] + ": ");
            bGenre = input.nextLine();
        }
        System.out.print("Input " + material[materialType][0] + " " + material[materialType][3] + ": ");
        String bDescription = input.nextLine();
        System.out.print("Input " + material[materialType][0] + " " + material[materialType][4] + ": ");
        String bURL = input.next();
        this.inMain.task(publish.personType);

        if(materialType == 0) {
            book.add(this.publishBook(bTitle, bAuthor, bGenre, bDescription,bURL));

        } else {
            research.add(this.publishResearch(bTitle,bAuthor,bDescription,bURL));
        }
    }

    public Book publishBook(String title, String author, String genre, String description, String url) {
        return new Book(title,author,genre,description,url);

    }
    public Research publishResearch(String title, String author, String abstractt, String url) {
        return new Research(title,author,abstractt,url);
    }

}
