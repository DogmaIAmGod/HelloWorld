package Userful;

public class CheckLuhn {
    public static boolean isValidLuhn(String num) {
        int payload = Character.getNumericValue(num.charAt(num.length()-1));
        int total = 0;
        for (int i = num.length()-2;i>-1; i--) {
            int atPos = Character.getNumericValue(num.charAt(i));
            if (i % 2 == num.length() % 2) atPos = atPos * 2;
            total += atPos / 10 + atPos % 10;
        }
        return total % 10 != 0 ? 10 - total % 10 == payload : payload == 0;
    }

    public static boolean isValidUPS(String num) {
         int payload = Character.getNumericValue(num.charAt(num.length()-1)), even = 0, odd = 0;
         for(int i = num.length()-2;i>-1; i--) {
             int atPos = Character.getNumericValue(num.charAt(i));
             if (i % 2 == 0) even += atPos; else odd += atPos;
         }
         return ((even*3) + odd + payload) % 10 == 0;
    }
}