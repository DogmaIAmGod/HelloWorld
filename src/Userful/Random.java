package Userful;

import java.util.SplittableRandom;

public class Random {
    public static int generateRandomNumber(int rangeMin, int rangeMax) {
        SplittableRandom splittableRandom = new SplittableRandom();
        return splittableRandom.nextInt(rangeMin,rangeMax+1);
    }

    public static int[] generateRandomArray(int arraySize, int rangeMin, int rangeMax) {
        int[] array = new int[arraySize];
        for (int i=0;i<array.length;i++) {
            array[i] = generateRandomNumber(rangeMin,rangeMax);
        }
        return array;
    }

    public static String[] generateRandomArray(int arraySize) {
        String[] array = new String[arraySize];
        for (int i=0;i<array.length;i++) {
            array[i] = generateRandomLetter();
        }
        return array;
    }


    public static String generateRandomLetter() {
        if(generateRandomNumber(0,1) == 0) {
            return Character.toString((char) generateRandomNumber(65,90));
        }
        return Character.toString((char) generateRandomNumber(97,122));
    }

    public static String[] generateRandomWords(int numOfWords) {
        int[] lens = new int[numOfWords];
        String[] words = new String[numOfWords];
        StringBuilder a = new StringBuilder();
        for (int i=0;i<lens.length;i++) {
            lens[i] = generateRandomNumber(1, 10);
        }
        for (int i=0;i<lens.length;i++) {
            for(int j=0;j<lens[i];j++) {
                a.append(generateRandomLetter());
            }
            words[i] = String.valueOf(a);
            a = new StringBuilder("");
        }
        return words;
    }
}
