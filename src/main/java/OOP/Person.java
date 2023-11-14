package OOP;
public class Person {
    String firstName;
    String lastName;
    Integer age;

    Person(String firstName1, String lastName1){
        this.firstName = firstName1;
        this.lastName = lastName1;
    }

    Person(String firstName2, String lastName2, Integer age1){
        this.firstName = firstName2;
        this.lastName = lastName2;
        this.age = age1;
    }
    public void sayHello(String paramName) {
        System.out.println( paramName +" " + "my name is " + firstName);
    }
}


