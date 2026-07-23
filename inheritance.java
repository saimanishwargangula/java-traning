class Person {
    String name = "Ravi";

    void display() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    int rollNo = 101;

    void showRollNo() {
        System.out.println("Roll Number: " + rollNo);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Student s = new Student();

        s.display();      // Inherited method
        s.showRollNo();   // Child method
    }
}