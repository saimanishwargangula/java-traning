// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
import java.util.ArrayList;
import java.util.Scanner;

public class EcommerceApp {
   public EcommerceApp() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      ArrayList var2 = new ArrayList();
      var2.add(new Product(1, "Laptop", (double)50000.0F));
      var2.add(new Product(2, "Smartphone", (double)20000.0F));
      var2.add(new Product(3, "Headphones", (double)2000.0F));
      var2.add(new Product(4, "Mouse", (double)700.0F));
      var2.add(new Product(5, "Keyboard", (double)1200.0F));
      ArrayList var3 = new ArrayList();

      while(true) {
         System.out.println("\n===== E-Commerce Store =====");
         System.out.println("1. View Products");
         System.out.println("2. Add Product to Cart");
         System.out.println("3. View Cart");
         System.out.println("4. Checkout");
         System.out.println("5. Exit");
         System.out.print("Enter Choice: ");
         int var4 = var1.nextInt();
         switch (var4) {
            case 1:
               System.out.println("\nAvailable Products:");

               for(Product var13 : var2) {
                  var13.display();
               }
               break;
            case 2:
               System.out.print("Enter Product ID: ");
               int var5 = var1.nextInt();
               System.out.print("Enter Quantity: ");
               int var6 = var1.nextInt();
               boolean var7 = false;

               for(Product var9 : var2) {
                  if (var9.id == var5) {
                     var3.add(new CartItem(var9, var6));
                     System.out.println("Product Added Successfully!");
                     var7 = true;
                     break;
                  }
               }

               if (!var7) {
                  System.out.println("Invalid Product ID!");
               }
               break;
            case 3:
               if (var3.isEmpty()) {
                  System.out.println("Cart is Empty!");
                  break;
               }

               double var14 = (double)0.0F;
               System.out.println("\n----- Shopping Cart -----");

               for(CartItem var17 : var3) {
                  String var18 = var17.product.name;
                  System.out.println(var18 + " | Qty: " + var17.quantity + " | Total: ₹" + var17.getTotal());
                  var14 += var17.getTotal();
               }

               System.out.println("-------------------------");
               System.out.println("Grand Total = ₹" + var14);
               break;
            case 4:
               if (var3.isEmpty()) {
                  System.out.println("Cart is Empty!");
                  break;
               }

               double var8 = (double)0.0F;
               System.out.println("\n========== BILL ==========");

               for(CartItem var11 : var3) {
                  String var10001 = var11.product.name;
                  System.out.println(var10001 + " x " + var11.quantity + " = ₹" + var11.getTotal());
                  var8 += var11.getTotal();
               }

               System.out.println("---------------------------");
               System.out.println("Total Amount = ₹" + var8);
               System.out.println("Thank You for Shopping!");
               System.out.println("==========================");
               var3.clear();
               break;
            case 5:
               System.out.println("Thank You! Visit Again.");
               var1.close();
               System.exit(0);
            default:
               System.out.println("Invalid Choice!");
         }
      }
   }
}