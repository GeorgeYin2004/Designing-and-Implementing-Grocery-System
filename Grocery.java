/**
 * Designer: Ryan Xiong
 * Date: May 4
 * Description: Main class
 */
public class Grocery {
    public static void main(String[] args) {
        /*
        Create 5 products
         */
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
        Product p4 = new Product();
        Product p5 = new Product();
        /*
        Name 5 products
         */
        p1.setProductName("Fruits");
        p2.setProductName("Meat");
        p3.setProductName("Drinks");
        p4.setProductName("Vegetables");
        p5.setProductName("Snacks");
        /*
        Create a market
         */
        Market m = new Market();
        /*
        Name the market
         */
        m.setMarketName("Grocery");
        /*
        Combine 5 products with market
         */
        m.setProductArr(new Product[] {p1,p2,p3,p4,p5});
        /*
        Create a customer
         */
        Customer c1 = new Customer();
        /*
        Name the customer
         */
        c1.setName("Tailey");
        /*
        The customer is shopping
         */
        Product result = c1.shopping(m, "Drinks" );
        System.out.println("Welcome to "+m.getMarketName());
        /*
        If the chosen product exists, the customer get that product
         */
        if (result!=null){
            System.out.println("Thank you for your buying, goodbye!");
        }else{
            System.out.println("There is currently no such item, sorry!");
        }
    }
}
