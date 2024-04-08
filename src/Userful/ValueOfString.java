package Userful;

public class ValueOfString {
    public static Integer valueOfCharacter(String input, int i) {
            char character = input.charAt(i);
        return Character.isLowerCase(character) ? (int) character -96 :  (int) character -38;
    }

    public static boolean startsWith(String word1, String word2) {
        int minLength = Math.min(word1.length(), word2.length());
        for (int i = 0; i < minLength; i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean compareString(String string1, String string2) {
        string1 = string1.replaceAll("[^a-zA-Z]","");
        string2 = string2.replaceAll("[^a-zA-Z]","");

        boolean checkStartsWith = startsWith(string1,string2);
        if(checkStartsWith && string1.length() < string2.length()) {
            return true;
        }
        
        int minLength = Math.min(string1.length(),string2.length());
        for(int i=0;i<minLength;i++) {
            int char1 = valueOfCharacter(string1,i), char2 = valueOfCharacter(string2,i);
            if(char1 != char2) {
                return char1 < char2;
            }
        }
        return false;
    }
}
