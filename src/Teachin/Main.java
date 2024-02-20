package Teachin;

public class Main {
    /*
Write a Java method to count all the words in a string.
Test Data:
Input the string: The quick brown fox jumps over the lazy dog.
Expected Output:

Number of words in the string: 9
*/
    static void countingWords(String a) {
        int countSpaces = 1;
        a = a.trim();
        for(int i=0;i<a.length()-1;i++) {
            if (String.valueOf(a.charAt(i)).equals(" ") && !String.valueOf(a.charAt(i+1)).equals(" ")) {
                countSpaces++;
            }
        }
        if(countSpaces != 1) {
            throw new ArithmeticException("No words.");
        }
        System.out.println("Number of words in the string: " + (countSpaces));
    }

    /*
Write a Java method to compute the sum of digits in an integer.
Test Data:
Input an integer: 25
Expected Output:

The sum is 7
*/
    static void sumComputation(int a) {
        String b = String.valueOf(a);
        int counting = 0;
        for(int i=0;i<b.length();i++) {
            counting += Integer.parseInt(String.valueOf(b.charAt(i)));
        }
        System.out.println(counting);
    }

    public static String testing(String a, String b) {
        String c = a+b;
        return c;
    }

    public static int testing(int a, int b) {
        int c = a+b;
        return c;
    }

    public static void main(String[] args) {
//        countingWords("The quick brown fox jumps over the lazy dog.");
        sumComputation(25);
        int num1 = 2,num2 = 1;
        String who = "This", that = "That";
        System.out.println(testing(1,2));
        System.out.println(testing(who,that));

    }
}
