/** Name: George Yin
  * Date: May 1 2022
  * Description: This program contains the Shopping Cart class.
  */
import java.util.*;

public class ShoppingCart {
   public ShoppingCart() {
      this.numberOfItems = 0;
   }

   /* Attributes */
   
   /** Number of items in the cart */
   private int numberOfItems;
   
   /** Whether there is a discount or not */
   private double discount;
   
   /** Stock of the product */
   private int avaliableNumber;
   
   /** Gets item */
   private String getItem;
   
   /** Cost of the item */
   private double cost;
   
   private String order; 
   
   
   /* Accesors */
   
   /* getters */
   
   public int getNumberOfItems() {
      return this.numberOfItems;
   }
   
   /* setters */
   
   public void set
   
   /**Method for returning the important data
     *@return the important data of the human
     */
   public String toString(){
     String shoppingCartData = "Number Of item(s) in shopping cart: " + this.numberOfItems +  
         return shoppingCartData;
   }
    
  }
}