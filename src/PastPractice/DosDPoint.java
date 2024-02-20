package PastPractice;

public class DosDPoint {
    double x, y;
    public DosDPoint(double xValue, double yValue) {
        x = xValue;
        y = yValue;
    }
    public boolean IsEqualTo(double x, double y) {
        return x == y;
    }

    public static void main(String[] args) {
        DosDPoint obj = new DosDPoint(15.6,17.8);
        boolean isEqual = obj.IsEqualTo(obj.x,obj.y);
        System.out.println(obj.x);
        System.out.println("Does " + obj.x + " = " + obj.y + ": " + isEqual);
    }

}
