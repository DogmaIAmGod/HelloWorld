package Homework3P1;

public class Paralellogram {
    Point ParaPoint1, ParaPoint2, ParaPoint3, ParaPoint4;
    public Paralellogram(Point a, Point b, Point c, Point d) {
        ParaPoint1 = a;
        ParaPoint2 = b;
        ParaPoint3 = c;
        ParaPoint4 = d;
    }


    public double Parameter() {
        double side1 = Math.sqrt(Math.pow((this.ParaPoint1.point1 - this.ParaPoint2.point1),2) + Math.pow((this.ParaPoint1.point2 - this.ParaPoint2.point2),2));
        double side2 = Math.sqrt(Math.pow((this.ParaPoint1.point1 - this.ParaPoint3.point1),2) + Math.pow((this.ParaPoint1.point2 - this.ParaPoint3.point2),2));
        return (side2*2) + (side1*2);
    }

    public double largestDiagonal(Paralellogram para) {
        double angle1 = Math.sqrt(Math.pow((para.ParaPoint1.point1 - para.ParaPoint1.point2),2) + Math.pow((para.ParaPoint4.point1 - para.ParaPoint4.point2),2));
        double angle2 = Math.sqrt(Math.pow((para.ParaPoint2.point1 - para.ParaPoint2.point2),2) + Math.pow((para.ParaPoint3.point1 - para.ParaPoint3.point2),2));
        return Math.max(angle1, angle2);
    }

}
