public class ItemInformation
{
    //declaration of variable
    String itemId;
    String itemName;
    double itemPrice;
    String datePurchase;
    
    //method constructor without parameter
    ItemInformation()
    {
        itemId = "";
        itemName = "";
        itemPrice = 0.0;
        datePurchase = "";
    }
    
    //method constructor with parameter
    ItemInformation(String id, String name, double price, String d)
    {
        itemId = id;
        itemName = name;
        itemPrice = price;
        datePurchase = d;
    }
    
    //accessor for ItemId
    public String getItemId()
    {
        return itemId;
    }
    
    //mutator for ItemId
    public void setItemId(String itemId)
    {
        this.itemId = itemId;
    }
    
    //accessor for ItemName
    public String getItemName()
    {
        return itemName;
    }
    
    //mutator for ItemName
    public void setItemName(String itemName)
    {
        this.itemName = itemName;
    }
    
    //accessor for ItemPrice
    public double getItemPrice()
    {
        return itemPrice;
    }
    
    //mutator for ItemPrice
    public void setItemPrice(double itemPrice)
    {
        this.itemPrice = itemPrice;
    }
    
    //accessor for DatePurchase
    public String getDatePurchase()
    {
        return datePurchase;
    }
}//end ItemInformation