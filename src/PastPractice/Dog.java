package PastPractice;

public class Dog {
    public Dog() {}
//    public PastPractice.Dog(String dName) {}

    String breed;
    int age;
    String color;
    void barking() {}
    void hungry() {}
    void sleeping(){}

    private int weight;
    public int getWeight() {
        return weight;
    }
    public void setWeight(int x) {
        weight = x;
    }

    private String name;
    public Dog(String nameDog) {
        name = nameDog;
    }

    public  static  void main(String[]args) {
        Dog myDog = new Dog("Tommy");
        System.out.println(myDog.name);
    }
}
