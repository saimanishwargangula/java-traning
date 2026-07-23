class Payment {
    void pay() {
        System.out.println("Payment Process");
    }
}

class DebitCard extends Payment {
    void pay() {
        System.out.println("Paid using Debit Card");
    }
}

class CreditCard extends Payment {
    void pay() {
        System.out.println("Paid using Credit Card");
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        Payment p;

        p = new DebitCard();
        p.pay();

        p = new CreditCard();
        p.pay();
    }
}