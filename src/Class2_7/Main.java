package Class2_7;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.SplittableRandom;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    static void generateRandomNumber(int amountToGenerate, int rangeMin, int rangeMax) {
        SplittableRandom splittableRandom = new SplittableRandom();
        for (int i=0;i<amountToGenerate;i++) {
            int random = splittableRandom.nextInt(rangeMin,rangeMax+1);
            if (i == amountToGenerate-1) {
                System.out.println(random);
                return;
            }
            System.out.print(random + ",");
        }
    }

    static void RPS() {
        Scanner input = new Scanner(System.in);
        int p1Win = 0, p2Win = 0;
        System.out.print("1 | ROCK\n2 | PAPER\n3 | SCISSORS\n Input: ");
        int player1 = input.nextInt(); input.nextLine();
        System.out.print("1 | ROCK\n2 | PAPER\n3 | SCISSORS\n Input: ");
        int player2 = input.nextInt(); input.nextLine();
        if (player2 == player1) {
            p1Win++;
            p2Win++;
        } else {
            if ((player1 == 1 && player2 == 3) || (player1 == 2 && player2 == 1) || (player1 == 3 && player2 == 2)) {
                p1Win++;
            } else {
                p2Win++;
            }
        }

        System.out.println("Player1 Score: " + p1Win + "\nPlayer2 Score: " + p2Win);

    }

    static void intoSequence(int num) {
        String number = Integer.toString(num);
        for (int i=0;i<number.length();i++) {
            System.out.print(number.charAt(i) + " ");
        }
    }

    static void bunchOut(int num1, int num2) {
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println((num1 + num2)/2);
        System.out.println(Math.abs(num1-num2));
        System.out.println(Math.max(num1, num2));
        System.out.println(Math.min(num1,num2));
    }

    static void calculator() {
        Scanner input = new Scanner(System.in);
        System.out.print("1 | Add\n2 | Subtract\n3 | Multiply\n4 | Divide\nInput: ");
        int num = input.nextInt(); input.nextLine();
        System.out.print("Num1: ");
        int num1 = input.nextInt(); input.nextLine();
        System.out.print("Num2: ");
        int num2 = input.nextInt(); input.nextLine();
        switch (num) {
            case 1:
                System.out.println(num1 + num2);
                break;
            case 2:
                System.out.println(num1 - num2);
                break;
            case 3:
                System.out.println(num1 * num2);
            case 4:
                double ans = (double) num1 / num2;
                if (num1 == 0) {
                    System.out.println("No dividing zero");
                    System.out.print("Num1: ");
                    num1 = input.nextInt(); input.nextLine();

                } 
                System.out.println(ans);
                System.out.println(Math.round(ans * Math.pow(10, 2)) / Math.pow(10, 2));
                System.out.println(Math.round(ans));
                break;
        }
    }

    static void smallest(int a, int b, int c) {
        System.out.println("The smallest value is " + Math.min(c,Math.min(a,b)));
    }

    static void average(int a, int b, int c) {
        System.out.println("The average value is " + ((a+b+c)/3));
    }

    static void middleNumber(int a) {
        String nums = String.valueOf(a);
        if (nums.length() == 1 || nums.length() == 2) {
            System.out.println(nums);
            return;
        }
        if (nums.length() % 2 == 0) {
            System.out.println(nums.charAt(nums.length()/2) + " " + nums.charAt(nums.length()/2+1));
        } else {
            System.out.println(nums.charAt((nums.length()-1)/2+1));
        }
    }

    static void countVowels(String a) {
        int count = 0;
        for (int i=0;i<a.length();i++) {
            char b = a.toLowerCase().charAt(i);
            boolean isVowel = "aeiou".indexOf(b) != -1;
            if (isVowel) {
                count++;
            }
        }
        System.out.println("Number of Vowels in the string: " + count);
    }

    static void countWords(String a) {
        int count = 0;
        for (int i=0;i<a.length();i++) {
            String b = String.valueOf(a.charAt(i));
            if (Objects.equals(b, " ")) {
                count++;
            }
        }
        System.out.println("Number of words in the string: " + (count+1));
    }

    static void countingNumbers(int a) {
        String b = String.valueOf(a);
        int sum = 0;
        for (int i=0;i<b.length();i++) {
            sum += Integer.parseInt(String.valueOf(b.charAt(i)));
        }
        System.out.println(sum);
    }

    static void pentagonal(int a) {
        int count = 1;
        for(int i = 1; i <= 50; i++) {
            System.out.printf("%-6d", (i * (3 * i - 1)) / 2);
            if (count % 10 == 0) System.out.println();
            count++;
        }
    }

    static void interest(double investment, double rate, int years) {
        rate *= .01;
        System.out.println("Year       Investment");
        for(int i=0;i<years;i++) {
            for(int j=0;j<12;j++) {
                investment += investment*(rate/12);
            }
            System.out.printf((i+1) + "             %.2f\n", investment);
        }
    }

    static void lettersBetween(char a, char b) {
        for(int i = 0; i< (int) b - (int) a +1; i++) {
            if ((double)i % 19 == 0) {
                System.out.print("\n");
            }
            System.out.print(" " + Arrays.toString(Character.toChars((int) a + i)));
        }
    }

    static void checkLeapYear(int a) {
        boolean check;
        if (a % 100 == 0) {
            check = a % 400 == 0;
        } else {
            check = a % 4 == 0;
        }
        System.out.println(check);
    }

    static void checkPassword(String pass) {
        if (pass.length() < 8) {
            System.out.println("false");
            return;
        }

        Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
        Matcher matcher = pattern.matcher(pass);
        if (!matcher.matches()) {
            System.out.println("false");
            return;
        }

        int digitCount = 0;
        for (char c : pass.toCharArray()) {
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        if (digitCount <= 2) {
            System.out.println("Password is not valid");
            return;
        }
        System.out.println("Password is valid");
    }

    static void printMatrix(int a) {
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < a; j++) {
                System.out.print((int)(Math.random() * 2) + " ");
            }
            System.out.println();
        }
    }

    static void triangleArea(double a, double b, double c) {
        double d = (a + b + c)/2;
        if (a + b > c && b + c > a &&  a + c > b) {
            System.out.println(Math.sqrt(d*(d - a)*(d - b)*(d - c)));
        } else {
            throw new ArithmeticException("Not a triangle");
        }
    }

    static void pentagon(int a) {
        System.out.println((5 * a * (a / (2 * Math.tan(Math.PI / 5)))) / 2);
    }

    static void dateTime() {
        System.out.println(java.time.LocalDateTime.now());
    }

    static void twinPrime() {
        for (int i = 2; i < 100; i++) {

            if (is_Prime(i) && is_Prime(i + 2)) {
                System.out.printf("(%d, %d)\n", i, i + 2);
            }
        }
    }
    static boolean is_Prime(long n) {
    if (n < 2) return false;
    for (int i = 2; i <= n / 2; i++) {
        if (n % i == 0) return false;
    }
    return true;
}

static void valueTwo(int number) {
    int count = 0;
    while (number > 0) {
        if (number % 10 == 2) {
            count++;
        }
        number /= 10;
    }
    System.out.println(count);
}

static void consecutive(int a, int b, int c) {
        if(b-a == 1 && c-b == 1) {
            System.out.println("consecutive");
            return;
        }
    System.out.println("Not consecutive");
}

static void midpoint(double a, double b, double c) {
    if((a+b)/2 == c || (b+c)/2 == a || (a+c)/2 == b) {
        System.out.println("true");
        return;
    }
    System.out.println("false");
}

static void firstDigit(int a) {
        int b = Math.abs(a);
        String c = String.valueOf(b);
    System.out.println(c.charAt(0));
}

static void factors(int a) {
    System.out.print(a + " = ");
    int result = a;
    while (result % 3 == 0){
        System.out.print("3 * ");
        result = result / 3;
    }
    System.out.print(result);
}

static void checkEvens(int a) {
        String b = String.valueOf(a);
        for(int i=0;i<b.length();i++) {
            if(Integer.parseInt(String.valueOf(b.charAt(i))) % 2 != 0) {
                System.out.println("false");
                return;
            }
        }
    System.out.println("true");
}



    public static void main(String[] args) {
//        generateRandomNumber(5,1,10);
//        RPS();
//        intoSequence(123412);
//        bunchOut(1,10);
//        countWords("The quick brown fox jumps over the lazy dog.");
//        countingNumbers(25);
//        pentagonal(1);
//        interest(1000,10,5);
//        lettersBetween('(', 'z');
//        checkPassword("abcd1234");
//        printMatrix(10);
//        pentagon(7);
//        dateTime();
//        midpoint(2,4,6);
//        factors(81);
    }
}

/*
Upcasting: child obj can access methods of parent obj

Down casting: parent obj type cast to child obj

typecasting: up or down casting from a derived class

Dynamic: method call at runtime.

Polymorphism: When there is inheritance there is a single task that performs a single action in different ways.
Through Inheritance a class can gain and perform different tasks thereby achieving the same action many different ways.
Example: One person having a relationship with many different people
A father, a son, a brother, a friend, all at the same time. Thereby performing other actions in different situations

Exceptions:  Effective approach to manage runtime errors, ensuring the uninterrupted application execution.
Example: Code error, Out-Of-Memory, Device Failure

class GFG {
    public static void main (String[] args) {
      int a=5;
      int b=0;
        try{
          System.out.println(a/b);
        }
      catch(ArithmeticException e){
        e.printStackTrace();
      }
    }

 Runtime error from typecasting

Integer a = 1;
String b = (String)(Object)a;

 */
