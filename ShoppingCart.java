/** Name: George Yin
  * Date: May 1 2022
  * Description: This program contains the Shopping Cart class.
  * WORK IN PROGRESS
  */
import java.util.*; 
 
 public class ShoppingCart {
   public ShoppingCart() {
     this.numberOfItems = 0;
   }

  /* Attributes */
  
  /** */
  private final int MAX_ITEM = 1000;
  
  /** */
  private int numberOfItems = 0;
  
  /** */
  private double discount;
  
  /** cost of the item*/
  private double cost;
  
  /** */
  private int foodNum = 0;
  
  /** */
  private String order;
  
  /** */
  private ArrayList<String> itemInCart = new ArrayList<String>();
  
  /** */
  private ArrayList<Double> itemSellCost = new ArrayList<Double>();
  
  /** */
  private ArrayList<Double> itemBuyCost = new ArrayList<Double>();
  
  /** */
  private Food[] food = new Food[MAX_ITEM];
  
  /** */
  String errorCollector;

  //Scanner
  Scanner in = new Scanner(System.in);

  /* Getters */
  
  /**Gets the 
     *@return the 
     */
  public int getNumberOfItems(){
    return this.numberOfItems;
  }
  
  /**Gets the 
     *@return the 
     */
  public ArrayList<String> getItemsInCart(){
    return (this.itemInCart);
  }

  /**Gets the 
     *@return the 
     */
  public ArrayList<Double> getItemBuyCost(){
    return (this.itemBuyCost);
  }
  
  /**Gets the 
     *@return the 
     */
  public Food[] getFood(){
    return this.food;
  }
  
  
  /* Setters */
  
  /**Sets the 
     *@return the 
     */
  public void setFood(Food[] food){
    this.food = food;
  }
  

  /* Mutators */

  /**
  
  */
  public void addOrder(){

    //prompt the user for order info
    System.out.println("Press a to see food to cart");
    String key = in.nextLine();


    boolean validInput = false;
    while(!validInput} {
      //Prompts the user
      System.out.println("Enter the type of the Order:");
      order = in.nextLine();
      if(key.equals("a")){
        validInput = true;
      }
    }

     
    System.out.println("Enter the orginal cost of the Order:");
    double buyCost = in.nextDouble();
    System.out.println("Enter the sell cost of the Order:");
    double sellCost = in.nextDouble();
    System.out.println("Enter the percent off of the Order:");
    this.discount = in.nextDouble();


    



    //If statement that chekc the user item type is Food or not
    } else if(key.equals("f")) {
       String type, String rating, String expireDate, String currentDate
      
      System.out.println("Enter the type of the Order:");
      String type = in.nextLine();
      
      System.out.println("Enter the date of purchase");
      int currentDate = in.nextInt();


    //Else tell user that no such type exist
    } else {
      System.out.println("There is no such thing as" + type);
    }

    //Calculates Total cost of the customers order
    sellCost = sellCost * (100 - this.discount) / 100;

    //Update the cart with new order
    this.itemInCart.add(order);
    this.itemBuyCost.add(buyCost);
    this.itemSellCost.add(sellCost);
    this.itemInCart.set(numberOfItems, order);
    this.itemBuyCost.set(numberOfItems, buyCost);
    this.itemSellCost.set(numberOfItems, sellCost);
    this.numberOfItems++;
  }

/*
  
 */
   public void cancelOrder(){
   
    //Array to clear the whole shopping cart
    for(int i = 0; numberOfItems > i; i++){
        this.itemInCart.set(i, null);
        this.itemBuyCost.set(i, null);
        this.itemSellCost.set(i, null);
    }

    System.out.println("Orders have been removed.\n");

    
    this.numberOfItems = 0;
  }


  /*
  
 */
  public void status(){
    //To print out the stuff in the array list
    System.out.println(toString());
    System.out.printf("%s %10s %10s\n", "Item:", "SellCost:", "Cost to Produce:");
    //finish here
  }

  /*
 
 */
  public void productFind(){
    boolean productFound = false;
    String type = "";
    System.out.println("Enter the the product name:");
    String product = sc.nextLine();
    System.out.println("The type of product:");
    type = sc.nextLine();

    //
    if(type.equalsIgnoreCase("Food")){
      
   
  
  /**Method for returning the important data
    *@return the important data of the human
    */
  public String toString(){
    String shoppingCartData = "Number Of items in Cart: " + this.numberOfItems + "\nNumber of food items: " + foodNum + "\nNumber of electronic items: " + electronicNum + "\nNumber of closthing num: " + clothingNum +  "\ndiscount: " + discount + "\nOrder: " + order;
    return shoppingCartData;
    
  }

}