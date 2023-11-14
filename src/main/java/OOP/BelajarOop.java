package OOP;

public class BelajarOop {
    public static void main(String[] args) {
//        Person Person1 = getPerson();
//        Person1.firstName = "Candra";
//        Person1.lastName = "Sinaga";
//        System.out.println("FirstName " + Person1.firstName);
//        System.out.println("LastName " + Person1.lastName);
//
//        Person1.sayHello("Hello");

        Person Person2 = new Person("Darmawan", "Hadiprasetyo");
        System.out.println("Firstname person2 " + Person2.firstName);
        System.out.println("lastName person2 " + Person2.lastName);

        Person Person3 = new Person("Satrio", "Edi", 20);
        System.out.println("Firstname person3 " + Person3.firstName);
        System.out.println("lastName person3 " + Person3.lastName);
        System.out.println("Umur person 3 " + Person3.age);

        Person3.firstName = "Chandra";
        System.out.println("Firstname person3 " + Person3.firstName);
    }
//    public static Person getPerson(){
//        Person PersonNew = new Person();
//        return PersonNew;
//    }
}
