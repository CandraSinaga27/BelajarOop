package OOP;

public class Polymorphism {
    public static void main(String[] args) {
        Parent parent = new Parent(10, "A", "B");
        parent = new Child(100, "C", "D");
        parent = new ChildToChild(1000, "F", "G");


    }
}
