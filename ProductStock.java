/** Name: George Yin
  * Date: May 10 2022
  * Description: This program contains the Product Stock class.
  */
import java.util.*; 

public class ProductStock {

   /* Attributes */
   
   /* Amount of stocks for Coca Cola */
   private int colaStock;
   
   /* Amount of stocks for the product */
   private int penStock;
  
   /* Amount of stocks for the product */
   private int eraserStock;
   
   /* Price of the cola to purchase from the distrubtor */
   private double colaCost;

   /* Price of the pen to purchase from the distrubtor */
   private double penCost;
  
   /* Price of the eraser to purchase from the distrubtor */
   private double eraserCost;
   
   
   /* Constructors */
   
   /**
     *@param colaStock the number of Cola Colas in stock
     *@param penStock the number of Pens in stock
     *@param eraserStock the number of Erasers in stock
     *@param colaCost the cost of cola 
     *@param penCost the cost of a pen
     *@param eraserCost the cost of a eraser
     */
   public ProductStock(int colaStock, int penStock, int eraserStock, double colaCost, double penCost, double eraserCost) {
     this.colaStock = colaStock;
     this.penStock = penStock;
     this.eraserStock = eraserStock;
     this.colaCost = colaCost;
     this.penCost = penCost;
     this.eraserCost = eraserCost;
   }
    
   /* Getters */
   
   /** Gets the number of cola in stock
     *@return colaStock
     */
   public int getColaStock() {
      return colaStock;
   }
   
   /** Gets the pen stock
     *@return penStock
     */
   public int getPenStock() {
      return penStock;
   }
   
   /** Gets the eraser stock
     *@return eraserStock
     */
   public int getEraserStock() {
      return eraserStock;
   }
   
   /** Gets the cola cost
     *@return colaCost
     */
   public double getColaCost() {
      return colaCost;
   }
  
   /** Gets the pen cost
     *@return penCost
     */
   public double getPenCost() {
      return penCost;
   }
   
   /** Gets the eraser cost
     *@return eraserCost
     */
   public double getEraserCost() {
      return eraserCost;
   }
   
   /* Setters */
   
   /** Set the cola stock
     *@param colaStock change the cola stock
     */
   public void setColaStock() {
      this.colaStock = colaStock;
   }
   
   /** Set the pen stock
     *@param penStock change the pen stock
     */
   public void setPenStock() {
      this.penStock = penStock;
   }
  
   /** Set the eraser stock
     *@param eraserStock change the eraser stock
     */
   public void setEraserStock() {
      this.eraserStock = eraserStock;
   }
  
   /** Set the cola cost
     *@param colaCost change the cola cost
     */
   public void setColaCost() {
      this.colaCost = colaCost;
   }
  
   /** Set the pen cost
     *@param penCost change the pen cost
     */
   public void setPenCost() {
      this.penCost = penCost;
   }
  
   /** Set the eraser cost
     *@param eraserCost change the eraser cost
     */
   public void setEraserCost() {
      this.eraserCost = eraserCost;
   }
   
   
   /* Methods */
   
   /** This method determines if a restock is needed. If the product stock is less than 10, a restock is required
     *@param productName name of the product
     */
   public void reStock(String productName) {
     boolean restock = false;
     if(productName.equals("Cola")) {
       if(colaStock < 10) {
        restock = true;
      }
     } else if(productName.equals("Pen")) {
       if(penStock < 10) {
        restock = true;
      }
     } else if(productName.equals("Eraser")) {
       if(eraserStock < 10) {
        restock = true;
      }
     }
     if(restock) {
        System.out.println("Restock is needed for " + productName);
      } else {
        System.out.println("There is enough stock for " + productName);
      }
   } 
   
   
   /**Method for returning the important data
    *@return the important data of ProductStock
    */
  public String toString() {
      String productStockData = "Coca cola stock: " + this.getColaStock() + "\n" + "Pen stock: " + this.getPenStock() + "\n" + "Eraser stock: " + this.getEraserStock() + "\n" + "Price of cola: " + this.getColaCost() + "\n" + "Pen cost: " + this.getPenStock() + "\n" + "Eraser cost: " + this.getEraserCost() + "\n";
      return productStockData;       
  }
}