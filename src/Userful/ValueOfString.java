package Userful;

public class ValueOfString {
    public static Integer valueOfString(String input) {
        input = input.replaceAll("[^a-zA-Z]","");
        int number = 0;
        for(int i = 0; i < 2; i++) {
            char character = input.charAt(i);
            number += Character.isLowerCase(character) ? (int) character -96 :  (int) character -38;
        }
        return number;
    }

    public static Object[][] stringValuePair(String[] words) {
        Object[][] returnArray = new Object[words.length][2];
        for(int i = 0; i < words.length; i++) {
            returnArray[i][0] = words[i];
            returnArray[i][1] = valueOfString(words[i]);
//            System.out.println(returnArray[i][0] + ", " + returnArray[i][1]);
        }
        return returnArray;
    }
}
