// Parent class
/*class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks: Woof! Woof!");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows: Meow!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Parent class references pointing to subclass objects (Upcasting)
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // The JVM decides which method to run at execution time
        myDog.makeSound(); // Outputs: The dog barks: Woof! Woof!
        myCat.makeSound(); // Outputs: The cat meows: Meow!
    }
}*/

// Parent Class
class PaymentGateway {
    public void processPayment(double amount) {
        System.out.println("Processing generic payment of $" + amount);
    }
}

// Subclass 1
class CreditCard extends PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of $" + amount + " with 2% fee.");
    }
}

// Subclass 2
class UPI extends PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of $" + amount + " with zero fees.");
    }
}

// Demonstration
public class Main {
    public static void main(String[] args) {
        PaymentGateway myMethod; // Superclass reference

        myMethod = new CreditCard();
        myMethod.processPayment(150.00); // Calls CreditCard's method at runtime

        myMethod = new UPI();
        myMethod.processPayment(500.00);  // Calls UPI's method at runtime
    }
}