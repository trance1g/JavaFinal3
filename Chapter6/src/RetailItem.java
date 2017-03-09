import java.text.DecimalFormat;

/**
 * This class uses an inner class.
 */

public class RetailItem
{
   private String description;  // Item description
   private int itemNumber;      // Item number
   private CostData cost;       // Cost data

   /**
    * RetailItem class constructor
    */

   public RetailItem(String desc, int itemNum, 
                     double wholesale, double retail)
   {
      setDescription(desc);
      setItemNumber(itemNum);
      cost = new CostData(wholesale, retail);
   }

   /**
    * RetailItem class toString method 
    */

   public String toString()
   {
      String str;  // To hold a descriptive string.
      
      // Create a DecimalFormat object to format output.
      DecimalFormat dollar = new DecimalFormat("#,##0.00");

      // Create a string describing the item.
      str = "Description: " + getDescription()
          + "\nItem Number: " + getItemNumber()
          + "\nWholesale Cost: $" 
          + dollar.format(cost.getWholesale())
          + "\nRetail Price: $" 
          + dollar.format(cost.getRetail());
      
      // Return the string.
      return str;
   }
   
   public double heyThere(){
	   return cost.getRetail();
   }

   /**
 * @return the description
 */
public String getDescription() {
	return description;
}

/**
 * @param description the description to set
 */
public void setDescription(String description) {
	this.description = description;
}

/**
 * @return the itemNumber
 */
public int getItemNumber() {
	return itemNumber;
}

/**
 * @param itemNumber the itemNumber to set
 */
public void setItemNumber(int itemNumber) {
	this.itemNumber = itemNumber;
}

/**
    * CostData Inner Class
    */

   private class CostData
   {
      public double wholesale,  // Wholesale cost
                    retail;     // Retail price

      /**
       * CostData class constructor 
       */

      public CostData(double w, double r)
      {
         wholesale = w;
         retail = r;
      }

	/**
	 * @return the wholesale
	 */
	public double getWholesale() {
		return wholesale;
	}

	/**
	 * @param wholesale the wholesale to set
	 */
	public void setWholesale(double wholesale) {
		this.wholesale = wholesale;
	}

	/**
	 * @return the retail
	 */
	public double getRetail() {
		return retail;
	}

	/**
	 * @param retail the retail to set
	 */
	public void setRetail(double retail) {
		this.retail = retail;
	}
      
   }
}