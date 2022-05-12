/**
 * Designer: Ryan Xiong
 * Date: May 4
 * Description: Customer class
 */
public class Customer {
    private String customerName;
    private int customerId;
    private boolean gender;
    private String genderStr;

   // public Customer(String customerName, int customerId, boolean gender){
        //this.customerName = customerName;
        //this.customerId = customerId;
        //this.gender = gender;
    //}
    //Getter
    /**
     * @return The name of customer
     */
    public String getName(){

        return customerName;
    }

    /**
     * @return The ID of customer
     */
    public int getCustomerId(){

        return customerId;
    }

    /**
     * if gender = true, the customer is a male; if gender = false, the customer is a female
     * @return The gender of customer
     */
    public boolean getGender(){

        if(gender==true){
            genderStr = "male";
        }else{
            genderStr = "female";
        }
        return gender;

    }

    //Setter

    /**
     * @param customerName The name of customer
     */
    public void setName(String customerName){

        this.customerName = customerName;
    }

    /**
     * @param customerId The ID of customer
     */
    public void setCustomerId(int customerId){

        this.customerId = customerId;
    }

    /**
     * @param gender The gender of customer
     */
    public void setGender(boolean gender){

        this.gender = gender;
        if(gender==true){
            genderStr = "male";
        }else{
            genderStr = "female";
        }
    }

    /**
     * Update the customer information
     * @param customerName The name of customer
     * @param customerId The Id of customer
     * @param gender The gender of customer
     */
    public void updateProfile(String customerName, int customerId, boolean gender){
        this.customerName = customerName;
        this.customerId = customerId;
        this.gender = gender;
    }
    
    /**
     * @return The information of customer
     */
    public String toString(){
        if(gender==true){
            genderStr = "male";
        }else{
            genderStr = "female";
        }
        return "Customer name: " + customerName + ", Customer ID: " + customerId + ", Gender: " + genderStr;
    }
}
