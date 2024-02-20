package Homework3P2;

import java.util.*;

public class Research {
    final String ResearchTitle,ResearchAuthor,ResearchAbstract,ResearchURL;
    public Research(String rTitle, String rAuthor, String rAbstract, String rURL) {
        ResearchTitle = rTitle;
        ResearchAuthor = rAuthor;
        ResearchAbstract = rAbstract;
        ResearchURL = rURL;
    }

    static void PublishResearch(ArrayList<Research> a) {
        Scanner rInformation = new Scanner(System.in);
        System.out.print("Input Research Paper Title: ")    ;
        String rTitle = rInformation.nextLine();
        System.out.print("Input Research Paper Author: ");
        String rAuthor = rInformation.nextLine();
        System.out.print("Input Research Paper Abstract: ");
        String rAbstract = rInformation.nextLine();
        System.out.print("Input Research Paper URL: ");
        String rURL = rInformation.next();
        Research add = new Research(rTitle,rAuthor,rAbstract,rURL);
        a.add(add);
        System.out.println("Research Added");
    }
    
}
