package Userful;

import static Userful.BinaryTree.*;

public class Main {

    public static StringBuilder ceasar(String words) {
        StringBuilder returnString = new StringBuilder();
        for (int i = 0; i < words.length(); i++) {
            int a = words.charAt(i);
            if(a == 90) {
                a = 65;
            }
            else if (a == 122) {
                a = 97;
            }
            else if ((a >= 65 && a<=90) || (a >= 97 && a <= 122)) {
                a += 1;
            }
            char b = (char) a;
           returnString.append(b);
        }
        return returnString;
    }
    public static void main(String[] args) {
//        String[] words = {"tie", "grip", "ethereal", "steal", "heavenly", "industrious", "jolly", "basket", "delay", "satisfying", "educate", "observation", "crush", "dedicate", "repeat", "notebook", "fail", "create", "hush", "prickly"};
//        BinaryTree root = binaryTreeSearch(words);
//        inOrderPrint(root);

        System.out.println(ceasar("Hopefully this works"));
    }
}
