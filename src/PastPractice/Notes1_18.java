package PastPractice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Notes1_18 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        String first = "Java";
//        String second = "Python";
//        String third = "JavaScript";
//        System.out.println(first);
//        System.out.println(second);
//        System.out.println(third);

//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        int number = input.nextInt();
//        System.out.println("You entered " + number);
//
//        System.out.print("Enter a float: ");
//        float myFloat = input.nextFloat();
//        System.out.println("Float entered " + myFloat);
//
//        System.out.print("Enter a double: ");
//        double myDouble = input.nextDouble();
//        System.out.println("Double entered " + myDouble);
//
//        System.out.print("Enter text: ");
//        String myString = input.next();
//        System.out.println("Text entered " + myString);
//
//        input.close();

//        System.out.println("Hello World");
//
//        String name = "James";
//        System.out.println(name);
//
//        int myNum = 15;
//        System.out.println(myNum);
//
//        int x=5, y=6, z=50;
//        System.out.println(x+y+z);
//
//        Double number = -10.6;
//        System.out.println(5);
//        System.out.println(number);
//
//        System.out.println("I am " + "awesome.");
//        System.out.println("Number = " + number);
    }
            }

            //Homework
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.Scanner;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//public class PastPractice.Main {

//    static void LastName() {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your last name: ");
//        String lName = input.nextLine();
//        System.out.println("Hello, " + lName + "!");
//        input.close();
//    }
//    static void FirstLastName() {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your First Name: ");
//        String fName = input.nextLine();
//        System.out.print("Enter your Last Name: ");
//        String lName = input.nextLine();
//        System.out.println("Hello, "+ fName + " " + lName + "!");
//        input.close();
//    }
//
//    static void MisterMissesNone() {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your first and last name: ");
//        String name = input.nextLine();
//        System.out.print("Enter your gender: ");
//        String gender = input.next();
//        if (gender.equalsIgnoreCase("male")) {
//            System.out.printf("Hello Mr. " + name);
//        } else if (gender.equalsIgnoreCase("female")) {
//            System.out.printf("Hello Ms. " + name);
//        } else {
//            System.out.printf("Hello " + name);
//        }
//        input.close();
//    }
//
//    static void nameAge() {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your full name: ");
//        String name = input.nextLine();
//        System.out.print("Enter your age: ");
//        double age = input.nextDouble();
//        System.out.println("Your name is: " + name + " and you are " + age + " years old");
//        input.close();
//    }
//
//    public static String formatPhoneNumber(String input) {
//        String regex = "(\\d{3})(\\d{3})(\\d{4})";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(input);
//        if (matcher.matches()) {
//            return matcher.group(1) + "-" + matcher.group(2) + "-" + matcher.group(3);
//        } else {
//            return "Invalid phone number format";
//        }
//    }
//
//    static void nameAgeWeightPhoneNumber() {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter full name: ");
//        String name = input.nextLine();
//        System.out.print("Enter your age: ");
//        int age = input.nextInt();
//        System.out.print("Enter your weight: ");
//        double weight = input.nextDouble();
//        String f = input.nextLine();
//        System.out.print("(Numbers only) Enter your cell phone number: ");
//        String phoneNumRaw = input.nextLine();
//        String phoneNum = formatPhoneNumber(phoneNumRaw);
//        System.out.print("Your name: " + name + ",\nYour age: " + age + ",\nYour weight: " + weight + ",\nYour phone number: " + phoneNum );
//        input.close();
//    }
//
//    static void displayNumbers() {
//        System.out.println("Number 6");
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }
//        System.out.println("Number 7");
//        for (int i = 1; i <= 100; i++) {
//            System.out.println(i);
//        }
//        System.out.println("Number 8");
//        for (int i = 20; i <= 55; i++) {
//            System.out.println(i);
//        }
//        System.out.println("Number 13");
//        for (int i = 0; i <= 100; i++) {
//            if (i % 2 != 0) {
//                System.out.println(i);
//            }
//        }
//        System.out.println("Number 9");
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter number 1 - 10 to exclude: ");
//        int number  = input.nextInt();
//        for (int i = 1; i <= 10; i++) {
//            if (i  == number){
//                continue;
//            }
//            System.out.println(i);
//        }
//        input.close();
//    }
//
//    static void betweenNumbers() {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter starting number: ");
//        int firstNumber  = input.nextInt();
//        System.out.print("Enter Ending number: ");
//        int secondNumber = input.nextInt();
//        if (firstNumber > secondNumber) {
//            for (int i = firstNumber; i >= secondNumber; i--) {
//                System.out.println(i);
//            }
//        } else {
//            for (int i = firstNumber; i <= secondNumber; i++) {
//                System.out.println(i);
//            }
//        }
//    }
//
//    static void EvenOdd() {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter number to check Odd or Even: ");
//        int number = input.nextInt();
//        if (number % 2 == 0) {
//            System.out.println("Even");
//        } else {
//            System.out.println("Odd");
//        }
//        input.close();
//    }
//
//    static void checkSqrt() {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter number to get its square root: ");
//        int number = input.nextInt();
//        System.out.println(Math.sqrt(number));
//        input.close();
//    }
//
//    static void bee1(int A, int B) {
//        System.out.println("X = " + (A + B));
//    }
//
//    static void bee2(double num) {
//        System.out.printf("A=%,.4f\n", (3.14159 * Math.pow(num,2)));
//    }
//
//    static void bee3(int A, int B) {
//        System.out.println("SOMA = " + (A + B));
//    }
//
//    static void bee4(int A, int B) {
//        System.out.println("PROD = " + (A * B));
//    }
//
//    static void bee5( double A, double B) {
//        double weightA = 3.5;
//        double weightB = 7.5;
//        double weightedA = weightA * A;
//        double weightedB = weightB * B;
//        System.out.printf("MEDIA = %,.5f\n",(weightedA + weightedB) / (weightA + weightB));
//    }
//
//    static void bee6(int A, int B, int C, int D) {
//        System.out.println("DIFERENCA = " + (A * B - C * D));
//    }
//
//    static void bee7(int empNum, int hours, double hourly) {
//        System.out.printf("NUMBER = " + empNum + "\nSALARY = U$ %,.2f\n", (hours * hourly));
//    }
//
//    static void bee8(String empName, float salary, float monthly) {
//        System.out.println("Total = R$ "+ String.format("%.2f",(salary + .15*monthly)));
//    }
//
//    static void bee9(int item1Num, int int1Quantity, float item1Price,int item2Num, int item2Quantity,float item2Price) {
//        System.out.println("VALOR A PAGAR: R$ "+ String.format("%.2f",(int1Quantity * item1Price + item2Quantity * item2Price)));
//    }
//
//    static void bee10(double x1, double x2, double y1, double y2) {
//        System.out.printf("%,.4f\n",(Math.sqrt((Math.pow(x2-x1,2)+Math.pow(y2-y1,2)))));
//    }
//
//    static void hacker1() {
//        Scanner input = new Scanner(System.in);
//        System.out.print("a: ");
//        int a = input.nextInt();
//        System.out.print("b: ");
//        int b = input.nextInt();
//        System.out.print("c: ");
//        int c = input.nextInt();
//        System.out.println(a + "\n" + b + "\n" + c);
//        input.close();
//    }
//
//    static void hacker3(int num) {
//        if (num % 2 != 0 || num >= 6 && num <= 20) {
//            System.out.println("Weird");
//        } else {
//            System.out.println("Not Weird");
//        }
//    }
//
//    static void hacker4(int i, double d, String s) {
//        System.out.println("String: " + s);
//        System.out.println("Double: " + d);
//        System.out.println("Int: " + i);
//    }
//
//    static void hacker5() {
//        Scanner input =new Scanner(System.in);
//        System.out.println("================================");
//        for(int i=0;i<3;i++){
//            System.out.print("String " + (i + 1) + ": ");
//            String s1 = input.next();
//            System.out.print("Integer " + (i + 1) + ": ");
//            int x = input.nextInt();
//            System.out.printf("%-15.15s%03d%n",s1, x);
//        }
//        System.out.println("================================");
//    }
//
//
//    public static void main(String[] args) {
        //1
        //LastName();

        //2
        //FirstLastName();

        //3
        //MisterMissesNone();

        //4
        //nameAge();

        //5
        //nameAgeWeightPhoneNumber();

        //6, 7, 8, 9, 13
        //displayNumbers();

        //10
        //betweenNumbers();

        //11
        //EvenOdd();

        //12
        //checkSqrt();

        // Bee1
//        bee1(10, 9);
//        bee1(-10, 4);
//        bee1(15, -7);
        //Bee2
//        bee2(2.00);
//        bee2(100.64);
//        bee2(150.00);

        // Bee3
//        bee3(30,10);
//        bee3(-30,10);
//        bee3(0, 0);

        //Bee4
//        bee4(3, 9);
//        bee4(-30,10);
//        bee4(0,9);

        //Bee5
//        bee5(5,7.1);
//        bee5(0,7.1);
//        bee5(10,10);

        //Bee6
//        bee6(5,6,7,8);
//        bee6(0,0,7,8);
//        bee6(5,6,-7,8);

        // Bee7
//        bee7(25,100,5.5);
//        bee7(1,200,20.5);
//        bee7(6,145,15.55);

        //Bee8
//        bee8("JOAO", 500,1230.3f);
//        bee8("PEDRO", 700,0);
//        bee8("MANGOJATA",1700,1230.50f);

        //Bee9
//        bee9(12,1,5.30f,16,2,5.10f);
//        bee9(13,2,15.30f,161,4,5.20f);
//        bee9(1,1,15.10f,2,1,15.10f);

        //Bee10
//        bee10(1,5,7,9);
//        bee10(-2.5,12.1,.4,7.3);
//        bee10(2.5,-12.2,-.4,7);

        //Hacker1
//        hacker1();

        //Hacker3
//        hacker3(3);
//        hacker3(24);

        //Hacker4
//        hacker4(42,3.1415,"Welcome to HacerRank's Java tutorials");
//        hacker4(100,42,"42 is the answer to life, the universe, and everything!");

        //Hacker5
//        hacker5();

        // Hacker6
        /*
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for (int i=1;i<=10;i++){
            System.out.println(N + " x " + i + " = " + (N*i));
        }
        bufferedReader.close();

         *///Hacker7
        /*
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int z = 0;z<n;z++) {
                a += Math.pow(2,z)*b;
                System.out.print(a + " ");
            }
            System.out.println();
        }
        in.close();

         *///Hacker8
        /*
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-32768 && x<=32767)System.out.println("* short");
                if(x>=-2147483648 && x<=2147483647)System.out.println("* int");
                if(x>=-9223372036854775808l && x<=9223372036854775807l)System.out.println("* long");
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }

         *///Hacker9
        /*
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length() + B.length());
        System.out.println((int)A.charAt(0) > (int)B.charAt(0) ? "Yes" : "No");
        System.out.println(
                A.substring(0, 1).toUpperCase() + A.substring(1)
                        + " " +
                        B.substring(0, 1).toUpperCase() + B.substring(1)
        );
         *///Hacker10
        /*
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start, end));

         *///Codeforces1
        /*
        System.out.print("Input watermellon weight: ");
        int weight = input.nextInt();
        System.out.println(weight%2==0?"Yes":"No");

         *///Codeforces2
        /*
        String [] words = {"word","localization","internationalization","pneumonoultramicroscopicsilicovolcanoconiosis"};
        for (String i:words) {
            if (i.length() > 10) {
                System.out.println(i.charAt(0) + String.valueOf(i.length()-2) + i.charAt(i.length()-1));
            } else {
                System.out.println(i);
            }
        }

         *///Codeforces3
        /*
        Scanner input = new Scanner(System.in);
        System.out.print("Input N: ");
        long N = input.nextLong();
        System.out.print("Input M: ");
        long M = input.nextLong();
        System.out.print("Input A: ");
        long A = input.nextLong();
        System.out.println(((N+A-1)/A) * ((M+A-1)/A));
         */


//    }
//}