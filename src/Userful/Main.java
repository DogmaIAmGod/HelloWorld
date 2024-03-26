package Userful;

import static Userful.BinaryTree.*;

public class Main {
    public static void main(String[] args) {
        String[] words = {"tie","grip","ethereal","steal","heavenly","industrious","jolly","basket","delay","satisfying","educate","observation","crush","dedicate","repeat","notebook","fail","create","hush","prickly"};
        BinaryTree root = binaryTreeSearch(words);
        System.out.println(root.name + ": " + root.value +"\nLeft Node: " + root.leftN.value + "\nRight Node: " + root.rightN.value);
//        inOrderPrint(root);
    }
}
