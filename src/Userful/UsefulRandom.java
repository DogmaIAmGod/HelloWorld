package Userful;

import java.util.Arrays;
import java.util.Random;
import java.util.SplittableRandom;

@SuppressWarnings("unused")
public class UsefulRandom {
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
            a = new StringBuilder();
        }
        return words;
    }


    public static String generateRandomWord(int lengthOfWord) {
        StringBuilder word = new StringBuilder();
        for(int i=0;i<lengthOfWord;i++) {
            word.append((char) generateRandomNumber(33, 126));
        }
        return word.toString();
    }

    public static void shuffleArray(int[] array) {
        Random rand = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            int index = rand.nextInt(i + 1);
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }

    public static int[] generateNonRepeatingRandomArray(int min, int max) {
        int diff = max-min + 1;
        int[] result = new int[diff];
        for (int i = min, j = 0; j < diff; i++) {
            result[j] = i;
            j++;
        }
        System.out.println(Arrays.toString(result));
        shuffleArray(result);
        return result;
    }
}
