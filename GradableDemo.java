// Interface
interface Gradable {
    String calculateGrade();
}

// Parent Class
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void introduce() {
        System.out.println("I am " + name);
    }
}

// Student Class
class Student extends Person implements Gradable {
    int marks;

    Student(String name, int marks) {
        super(name);
        this.marks = marks;
    } 

    @Override
    public String calculateGrade() {
        if (marks >= 90)
            return "A";
        else if (marks >= 75)
            return "B";
        else if (marks >= 60)
            return "C";
        else if (marks >= 40)
            return "D";
        else
            return "F";
    }

    @Override
    void introduce() {
        System.out.println("Hi, I am Student " + name +
                ", Marks = " + marks +
                ", Grade = " + calculateGrade());
    }
}

// Teacher Class
class Teacher extends Person {
    String subject;

    Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    @Override
    void introduce() {
        System.out.println("Hello, I am Teacher " + name +
                ". I teach " + subject);
    }
}

// Principal Class
class Principal extends Person {

    Principal(String name) {
        super(name);
    }

    @Override
    void introduce() {
        System.out.println("Good Morning! I am Principal " + name);
    }
}

// Main Class
public class GradableDemo {
    public static void main(String[] args) {

        Person[] people  = {
                new Student("karthik", 92),
                new Teacher("Arshad", "Java"),
                new Principal("Lakshmi")
        };

        for (Person p : people) {
            p.introduce();     // Same line of code, different output
        }
    }
}