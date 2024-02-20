package PastPractice;

public class Base {
    public int calculate(int num1, int num2) {
        return num1+num2;
    }
}

class Derived extends Base{
public int calculate(int num1, int num2) {
    return num1*num2;
}
public static void main(String[] args) {
    Derived b1 = new Derived();
    int result = b1.calculate(10,10);
    System.out.println("Result: " + result);
}
}
