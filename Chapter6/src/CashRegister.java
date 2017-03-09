import java.text.DecimalFormat;

public class CashRegister {
	private double quantity;
	private RetailItem retail;
	
	
	public CashRegister(RetailItem item, double quantity) {
		// TODO Auto-generated constructor stub
		this.retail = item;
		this.quantity = quantity;
	}
	
	DecimalFormat d = new DecimalFormat("$#,##0.00");
	
	public String toString(){
		String newLine = System.getProperty("line.separator");
		String str = "";
		str = "SALES RECEIPT" +  newLine + "Unit Price: " + d.format(retail.heyThere()) 
				+  newLine + "Quantity: " + quantity + newLine + "Subtotal: " +  d.format(getSubTotal())
				+  newLine + "Sales Tax: " +  d.format(getTax()) +  newLine + "Total: " +  d.format(getTotal());
		
		return str;
	}
	public double getSubTotal(){
		return quantity * retail.heyThere();
	}
	
	public double getTax(){
		return getSubTotal() * (0.06);
	}
	
	public double getTotal(){
		return getSubTotal() + getTax();
	}
}

