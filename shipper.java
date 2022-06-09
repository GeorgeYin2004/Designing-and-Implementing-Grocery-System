class shipper extends employee {
  private String ShipperName = "Bob";    //shipper attributes
  private int Shipperid = 560;
  private String Hiredate = "6/2/2022";
  private int workdays = 5;
  private double salaryperweek = 500.0;
  public static void main(String[] args) {

    // Create a myCar object
    Car myemployee = new employee();

    // Call the honk() method (from the Vehicle class) on the myCar object
    myemployee.shipsitems();
    

    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
    System.out.println(myEmployee.type + " " + myEmployee.shipperName);
  }
}