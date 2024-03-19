package Userful;

import Sorts.Quick;

import java.util.Arrays;

public class Main {
public static void main(String[] args) {
   String[] strings =  Random.generateRandomWords(10);
    System.out.println(Arrays.toString(strings));
    System.out.println(Random.generateRandomWord(30));
}
}
