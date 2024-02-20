package Homework3P1;

public class Square {
    Point Sq1, Sq2, Sq3, Sq4;
    public Square(Point a, Point b, Point c, Point d) {
        Sq1 = a;
        Sq2 = b;
        Sq3 = c;
        Sq4 = d;
    }

    public double largestDiagonal() {
        double angle1 = Math.sqrt(Math.pow((Sq1.point1 - Sq1.point2),2) + Math.pow((Sq4.point1 -Sq4.point2),2));
        double angle2 = Math.sqrt(Math.pow((Sq2.point1 - Sq2.point2),2) + Math.pow((Sq3.point1 - Sq3.point2),2));
        return Math.max(angle1, angle2);
    }

    public boolean isValidRectangle() {
        boolean testSides1 = Sq1.point2 == Sq3.point2;
        boolean testSides2 = Sq3.point1 == Sq4.point1;
        boolean testSides3 = Sq4.point2 == Sq2.point2;
        boolean testSides4 = Sq1.point1 == Sq2.point1;
        return testSides1 && testSides2 && testSides3 && testSides4;
    }

    public boolean isValidSquare() {
        double diff = Sq2.point1 - Sq1.point1 > 0 ? Sq2.point1 - Sq1.point1 : Sq2.point2 - Sq1.point2;
        boolean s1p1n = Sq1.point1 + diff == Sq3.point1;
        boolean s1p2e = Sq1.point2 + diff == Sq2.point2;
        boolean s4p2w = Sq4.point2 - diff == Sq3.point2;
        boolean s4p1s = Sq4.point1 - diff == Sq2.point1;

        boolean s1p2n = Sq1.point2 == Sq3.point2;
        boolean s1p1e = Sq1.point1 == Sq2.point1;
        boolean s4p1w = Sq4.point1 == Sq3.point1;
        boolean s4p2s = Sq4.point2 == Sq2.point2;

        return s1p1n && s1p2e && s4p1s && s4p2w && s1p2n && s1p1e && s4p2s && s4p1w;
    }

    public double Parimeter() {
        double side1 = Math.sqrt(Math.pow((Sq1.point1 - Sq2.point1),2) + Math.pow((Sq1.point2 - Sq2.point2),2));
        
        return side1 * 4;
    }

    public double Area(Square sqr) {
        double side1 = Math.sqrt(Math.pow((Sq1.point1 - Sq2.point1),2) + Math.pow((Sq1.point2 - Sq2.point2),2));

        return side1 * side1;
    }
}
