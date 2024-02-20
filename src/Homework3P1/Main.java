package Homework3P1;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1.00, 5.00);
        Point p2 = new Point(1.00,10.00);
        Point p3 = new Point(3.00,6.00);
        Point p4 = new Point(3.00,11.00);

        Point p5 = new Point(1.00, 5.00);
        Point p6 = new Point(1.00,10.00);
        Point p7 = new Point(3.00,5.00);
        Point p8 = new Point(3.00,10.00);

        Point p9 = new Point(1.00, 5.00);
        Point p10 = new Point(1.00,7.00);
        Point p11 = new Point(3.00,5.00);
        Point p12 = new Point(3.00,7.00);

        //Points
        boolean checkPoints = p1.IsEqualTo(p3);

        //Lines
        Line l1 = new Line(p1, p2);
        Line l2 = new Line(p3,p4);
        double Line1length = l1.Length(l1);
        double Line2length = l2.Length(l2);
        boolean checkLine = l1.IsEqualTo(l1,l2);

        //Paralellograms
        Paralellogram para1 = new Paralellogram(p1, p1, p3,p4);
        double paraParameter = para1.Parameter();
        double paraLongestDiag = para1.largestDiagonal(para1);

        //Rectangles
        Rectangle rect1 = new Rectangle(p5, p6, p7, p8);
        Rectangle rect2 = new Rectangle(p1, p2, p3, p4);
        double rectLongestDiag = rect1.largestDiagonal(rect1);
        double rectParameter = rect1.Parimeter(rect1);
        double rectArea = rect1.Area(rect1);
        boolean isValid1 = rect1.isValidRectangle(rect1);
        boolean isValid2 = rect2.isValidRectangle(rect2);

        //Squares
        Square sq1 = new Square(p9, p10, p11, p12);
        Square sq2 = new Square(p5, p6, p7, p8);
        double sqLongestDiag = sq1.largestDiagonal();
        boolean sq1ValidRect = sq1.isValidRectangle();
        boolean sq2ValidRect = sq2.isValidRectangle();
        boolean sq1ValidSq = sq1.isValidSquare();
        boolean sq2ValidSq = sq2.isValidSquare();
        double sq1Parimeter = sq1.Parimeter();
        double sq1Area = sq1.Area(sq1);

        //Points
//        System.out.println("Check Points: " + checkPoints);

        //Lines
//        System.out.println(checkLine);
        System.out.println(Line1length);
        System.out.println(Line2length);

        //Paralellogram
//        System.out.println(paraParameter);
//        System.out.println(paraLongestDiag);

        //Rectangle
//        System.out.println(rectParameter);
//        System.out.println(rectArea);
//        System.out.println(rectLongestDiag);
//        System.out.println(isValid1);
//        System.out.println(isValid2);

        //Square
//        System.out.println(sqLongestDiag);
//        System.out.println(sq1ValidRect);
//        System.out.println(sq2ValidRect);
//        System.out.println(sq1ValidSq);
//        System.out.println(sq2ValidSq);
//        System.out.println(sq1Parimeter);
//        System.out.println(sq1Area);



    }
}
