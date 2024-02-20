package PastPractice;

class Parent {
//    public void p1() {
//        System.out.println("PastPractice.Parent Method");
//    }
    int id=11;
    String name="Adil";
}

public class Child extends Parent {
    public void display() {
        System.out.println("ID is: " + id);
        System.out.println("Name is: " + name);
    }
//    public void c1() {
//        System.out.println("PastPractice.Child method");
//    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
    }
}

