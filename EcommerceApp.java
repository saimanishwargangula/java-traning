import java.util.ArrayList;
import java.util.Scanner;

class Product {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    void display() {
        System.out.println(id + ". " + name + " - ₹" + price);
    }
}

class CartItem {
    Product product;
    int quantity;

    CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    double getTotal() {
        return product.price * quantity;
    }
}

public class EcommerceApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(1, "Laptop", 50000));
        products.add(new Product(2, "Smartphone", 20000));
        products.add(new Product(3, "Headphones", 2000));
        products.add(new Product(4, "Mouse", 700));
        products.add(new Product(5, "Keyboard", 1200));

        ArrayList<CartItem> cart = new ArrayList<>();

        while (true) {
            System.out.println("\n===== E-Commerce Store =====");
            System.out.println("1. View Products");
            System.out.println("2. Add Product to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nAvailable Products:");
                    for (Product p : products) {
                        p.display();
                    }
                    break;

                case 2:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();

                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();

                    boolean found = false;

                    for (Product p : products) {
                        if (p.id == id) {
                            cart.add(new CartItem(p, qty));
                            System.out.println("Product Added Successfully!");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Invalid Product ID!");
                    }
                    break;

                case 3:

                    if (cart.isEmpty()) {
                        System.out.println("Cart is Empty!");
                    } else {
                        double total = 0;

                        System.out.println("\n----- Shopping Cart -----");

                        for (CartItem item : cart) {
                            System.out.println(
                                    item.product.name +
                                            " | Qty: " + item.quantity +
                                            " | Total: ₹" + item.getTotal());

                            total += item.getTotal();
                        }

                        System.out.println("-------------------------");
                        System.out.println("Grand Total = ₹" + total);
                    }

                    break;

                case 4:

                    if (cart.isEmpty()) {
                        System.out.println("Cart is Empty!");
                    } else {

                        double total = 0;

                        System.out.println("\n========== BILL ==========");

                        for (CartItem item : cart) {
                            System.out.println(
                                    item.product.name +
                                            " x " + item.quantity +
                                            " = ₹" + item.getTotal());

                            total += item.getTotal();
                        }

                        System.out.println("---------------------------");
                        System.out.println("Total Amount = ₹" + total);
                        System.out.println("Thank You for Shopping!");
                        System.out.println("==========================");

                        cart.clear();
                    }

                    break;

                case 5:
                    System.out.println("Thank You! Visit Again.");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}