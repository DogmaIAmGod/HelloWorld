package Homework3P1;

public class Line {
    Point linePoint1, linePoint2;
    public Line(Point xLine, Point yLine) {
        linePoint1 = xLine;
        linePoint2 = yLine;
    }
    public boolean IsEqualTo(Line x, Line y) {
        return x == y;
    }
    public double Length(Line line) {
        return Math.sqrt(Math.pow((line.linePoint1.point1 - line.linePoint1.point2),2) + Math.pow((line.linePoint2.point1 - line.linePoint2.point1),2));
    }
}
