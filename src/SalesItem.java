
public abstract class SalesItem {
	int code;
	double price;
	int quantity;
	
	public SalesItem(int code, double price, int quantity) {
		this.code = code;
		this.price = price;
		this.quantity = quantity;
	}
	
	public double itemTotalCost() {
		double totalCost = price * quantity;
		return totalCost;
		
	}
	
	public abstract double monthlyPromo();
	
	
	@Override
	public String toString() {
		return "SalesItem [code=" + code + ", price=" + price + ", quantity=" + quantity + "]";
	}

	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
