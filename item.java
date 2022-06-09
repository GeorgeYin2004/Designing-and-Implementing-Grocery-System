import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
   // properties
   private int pname;
   private int qty;
   private double price;
   private double totalPrice;

   // constructor
   Product(int pname, int qty, 
               double price, double totalPrice) {
      this.pname = pname;
      this.qty = qty;
      this.price = price;
      this.totalPrice = totalPrice;
   }

   // getter methods
   public int getPname() {
      return pname;
   }
   public int getQty() {
      return qty;
   }
   public double getPrice() {
      return price;
   }
   public double getTotalPrice() {
      return totalPrice;
   }

   // displayFormat
   public static void displayFormat() {
      System.out.print(
           "\nName      Quantity    Price   Total Price\n");
   }

   // display
   public void display() {
      System.out.format("%-9s %8d %10.2f %10.2f\n", 
            pname, qty, price, totalPrice);
   }
}

public class item {
   public static void main(String[] args) {
      
      // variables
      int productName = 0;
      int quantity = 0;
      double price = 0.0;
      double totalPrice = 0.0;
      double overAllPrice = 0.0;
      char choice = '\0';
   
      // create Scanner class object
      Scanner scan = new Scanner(System.in);
   
      List<Product> product = new ArrayList<Product>();
   
      do {
         // read input values
         System.out.println ( "1) Apple \n2) Banana \n3) Orange" );
         System.out.print("Please enter the item number: ");
         productName = scan.nextInt();
         System.out.print("Quantity: ");
         quantity = scan.nextInt();   
        
      
         // calculate total price for that product
         totalPrice = productName * quantity;
      
         // calculate overall price
         overAllPrice += totalPrice;
      
         // create Product class object and add it to the list
         product.add( new Product(
              productName, quantity, price, totalPrice) );
      
         // ask for continue?
         System.out.print("would you like to buy more? (y or n): ");
         choice = scan.next().charAt(0);
      
         // read remaining characters
         scan.nextLine();
      } while (choice == 'y' || choice == 'Y');
   
      // display all product with its properties
      Product.displayFormat();
      for (Product p : product) {
         p.display();
      }
   
      // overall price
      System.out.println("\nTotal Price = " + overAllPrice);
      
   
      // close Scanner
      scan.close();
   }
}
