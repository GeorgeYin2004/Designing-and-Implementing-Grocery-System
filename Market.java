/**
 * Designer: Ryan Xiong
 * Date: May 4
 * Description: Market class
 */
public class Market {
    private String marketName;
    private Product[] productArr;

    public String getMarketName(){
        return marketName;
    }

    public void setMarketName(String marketName){
        this.marketName = marketName;
    }

    public Product[] getProductArr(){
        return productArr;
    }

    public void setProductArr(Product[] productArr){
        this.productArr = productArr;
    }

    Product sell(String name){
        for(int i=0; i<productArr.length; i++){
            if(productArr[i].getProductName()==name){
                return productArr[i];
            }
        }
        return null;
    }
}
