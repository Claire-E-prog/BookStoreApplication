
public class ItemDiscount {
	int discount;
	int qualifiedQuantity;
	
	
	public ItemDiscount(int discount, int qualifiedQuantity) {
		this.discount = discount;
		this.qualifiedQuantity = qualifiedQuantity;
	}
	
	public double calculateDiscount(SalesItem item) {
		double deductedAmount;
		
		if (item.getQuantity() >= qualifiedQuantity) {
			deductedAmount = (item.itemTotalCost()) * (item.getQuantity()) * (discount/100);
			return deductedAmount;
		}
		return 0;
	}
}
