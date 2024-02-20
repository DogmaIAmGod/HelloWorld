package Homework3P1;

public class Rectangle {
    Point RectPoint1, RectPoint2, RectPoint3, RectPoint4;
    public Rectangle(Point a, Point b, Point c, Point d) {
        this.RectPoint1 = a;
        this.RectPoint2 = b;
        this.RectPoint3 = c;
        this.RectPoint4 = d;
    }

    public double largestDiagonal(Rectangle rect) {
        double angle1 = Math.sqrt(Math.pow((rect.RectPoint1.point1 - rect.RectPoint1.point2),2) + Math.pow((rect.RectPoint4.point1 - rect.RectPoint4.point2),2));
        double angle2 = Math.sqrt(Math.pow((rect.RectPoint2.point1 - rect.RectPoint2.point2),2) + Math.pow((rect.RectPoint3.point1 - rect.RectPoint3.point2),2));
        return Math.max(angle1, angle2);
    }

    public boolean isValidRectangle(Rectangle rect) {
        boolean testSides1 = RectPoint1.point2 == RectPoint3.point2;
        boolean testSides2 = RectPoint3.point1 == RectPoint4.point1;
        boolean testSides3 = RectPoint4.point2 == RectPoint2.point2;
        boolean testSides4 = RectPoint1.point1 == RectPoint2.point1;
        return testSides1 && testSides2 && testSides3 && testSides4;
    }

    public double Parimeter(Rectangle rect) {
        double side1 = Math.sqrt(Math.pow((rect.RectPoint1.point1 - rect.RectPoint1.point2),2) + Math.pow((rect.RectPoint2.point1 - rect.RectPoint2.point2),2));
        double side2 = Math.sqrt(Math.pow((rect.RectPoint1.point1 - rect.RectPoint1.point2),2) + Math.pow((rect.RectPoint3.point1 - rect.RectPoint3.point2),2));
        return (side2*2) + (side1*2);
    }

    public double Area(Rectangle rect) {
        double side1 = Math.sqrt(Math.pow((rect.RectPoint1.point1 - rect.RectPoint1.point2),2) + Math.pow((rect.RectPoint2.point1 - rect.RectPoint2.point2),2));
        double side2 = Math.sqrt(Math.pow((rect.RectPoint1.point1 - rect.RectPoint1.point2),2) + Math.pow((rect.RectPoint3.point1 - rect.RectPoint3.point2),2));
        return side1 * side2;
    }
}
