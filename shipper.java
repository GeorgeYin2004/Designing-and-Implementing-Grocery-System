class shipper extends employee {
  private String ShipperName = "Bob";    //shipper attributes
  private int ShipperId = 560;
  private String HireDate = "6/2/2022";
  private int WorkDays = 5;
  private double SalaryPerWeek = 500.0;
  public static void main(String[] args) {

    // Create a myCar object
    Car myemployee = new employee();
    /*getters */
    
    /** Gets the Shipper Id
     *@return ShipperId
     */
     public int getShipperId() {
      return shipperid;
   }
   /** Gets the Hire Date
     *@return HireDate
     */
    public string getHireDate() {
      return HireDate;
   }
   /** Gets the Work Days
     *@return WorkDays
     */
    public int getWorkDays() {
      return WorkDays;
   }
   /** Gets the Shipper Name
     *@return ShipperName
     */
    public int getShipperName() {
      return shipperName;
   }
   /** Gets the Salary Per Week
     *@return SalaryPerWeek
     */
    public double getSalaryPerWeek() {
      return SalaryPerweek;
   }
   /*setters */
   
   /** Set the cola stock
     *@param ShipperId change the Shipper Id
     */
   public void setShipperId() {
      this.ShipperId = ShipperId;
   }
   /** Set the cola stock
     *@param HireDate change the Hire Date
     */
   public void setHireDate() {
      this.HireDate = HireDate;
   }
   /** Set the cola stock
     *@param WorkDays change the Work Days
     */
   public void setWorkDays() {
      this.WorkDays = WorkDays;
   }
   /** Set the cola stock
     *@param ShipperName change the Shipper Name
     */
   public void ShipperName() {
      this.ShipperName = ShipperName;
   }
   /** Set the cola stock
     *@param SalaryPerweek change the Salary Per Week
     */
   public void setSalaryPerWeek() {
      this.SalaryPerweek = SalaryPerWeek;
   }



    // Call the honk() method (from the employee class) on the shipper object
    myemployee.shipsitems();
    

    // Display the value of the brand attribute (from the Employee class) and the value of the modelName from the shipper class
    System.out.println(myEmployee.type + " " + myEmployee.shipperName);
  }
}