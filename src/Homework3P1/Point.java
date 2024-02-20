package Homework3P1;

public class Point {
    double point1, point2;
    public Point(double xValue, double yValue) {
        this.point1 = xValue;
        this.point2 = yValue;
    }
    public boolean IsEqualTo(Point PassedInPoint) {
        boolean checkX = this.point1 == PassedInPoint.point1;
        boolean checkY = this.point2 == PassedInPoint.point2;
        return checkX && checkY;
    }
}

