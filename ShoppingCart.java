/** Name: George Yin
  * Date: May 1 2022
  * Description: This program contains the Shopping Cart class.
  */
import java.util.*; 

public class ShoppingCart {

   /* Attributes */

   /* Number of items in the cart */
   private int numberOfItems;
  
   /* Picks up a item */
   private ArrayList<String> item = new ArrayList<String>();
  
   /* Cost of the item */
    private ArrayList<Double> cost = new ArrayList<Double>();
  
   /* Total cost of the items */
   private double totalCost;
  
   /* Discount amount (put 0 if no discount) */
   private double discount;
  
   /* Pay in cash, credit, gift card */
   private String paymentMethod;

   /* Declaring the scanner */
   Scanner sc = new Scanner(System.in);
  
  
   /* Constructors */
  
   public ShoppingCart(ArrayList<String> item, ArrayList<Double> cost, double totalCost, double discount, String paymentMethod ) {
     this.numberOfItems = 0;
     this.item = item;
     this.cost = cost;
     this.totalCost = totalCost;
     this.discount = discount;
     this.paymentMethod = paymentMethod;
   }
   
  /* Getters */
  
  /** Gets the number of items 
    *@return numberOfItems
    */
  public int getNumberOfItems() {
    return numberOfItems;
  }
  
  /** Gets the items
    *@return item
    */
  public ArrayList<String> getItem() {
    return item;
  }
  
  /** Gets the cost of the items
    *@return cost
    */
  public ArrayList<Double> getCost() {
    return cost;
  }
  
  /** Gets the total cost of the items
    *@return totalCost
    */
  public double getTotalCost() {
    return totalCost;
  }
  
  /** Gets the discount amount
    *@return discount
    */
  public double getDiscount() {
    return discount;
  }
  
  /** Gets the payment method
    *@return paymentMethod
    */
  public String getPaymentMethod() {
    return paymentMethod;
  }
  
  
  /* Setters */
  
  /** Set the number of items
    *@param numberOfItems change the number of items
    */
  public void setNumberOfItems(int numberOfItems) {
   this.numberOfItems = numberOfItems;
  }
  
  /** Set the items
    *@param item change the item
    */
  public void setItem(ArrayList<String> item) {
    this.item = item;
  }
  
  /** Set the costs
    *@param cost change the cost
    */
  public void setCost(ArrayList<Double> cost) {
    this.cost = cost;
  }
  
  /** Set the total cost
    *@param totalCost change the total cost
    */
  public void setTotalCost(double totalCost) {
    this.totalCost =totalCost;
  }
  
  /** Set the discount
    *@param discount change the discount value
    */
  public void setDiscount(double discount) {
    this.discount = discount;
  }
  
  /** Set the payment method
    *@param paymentMethod change the payment method
    */
  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  /* Methods */

  /** Creates the cart for the customer to put items in 
    */
  public void Cart(){
    System.out.println("Order: ");
    String order = sc.nextLine();
    System.out.println("Order: ");
    double productCost = sc.nextDouble();

    this.item.add(order);
    this.cost.add(productCost);
  }

  /** Method to put items in the cart
    */
  public void getItemInCart(){
    System.out.printf("%s %15s\n", "Item:", "SellCost:");
    for(int i = 0; i < numberOfItems; i++){
      System.out.println(this.item.get(i) + "     $" + this.cost.get(i));
    }
  }

  
  /**Method for returning the important data
    *@return the important data of ShoppingCart
    */
  public String toString() {
      String shoppingCartData = "Number of items in the cart: " + this.getNumberOfItems() + "\n" + "Total cost: " + this.getTotalCost() + "\n" + "You have saved $" + this.getDiscount() + "today with your purchase with us!" + "\n" + "You payed with" + this.getPaymentMethod() + "\n";
      return shoppingCartData;       
  }
}

