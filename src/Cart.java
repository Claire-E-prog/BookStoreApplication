public class Cart {

	private SalesItem[] itemsList;
	int numItems;

	public Cart(int maxItems) {
		numItems = 0;
		itemsList = new SalesItem[maxItems];
	}

	public int capacity() {
		return itemsList.length;
	}

	public int size() {
		return numItems;
	}

	public void ensureCapacity(int increasedCapacity) {
		SalesItem[] tempArray = new SalesItem[increasedCapacity];
		for (int i = 0; i < numItems; i++) {
			tempArray[i] = itemsList[i];
		}

		itemsList = tempArray;
	}

	/*
	 * addItem: a method that takes one input parameter of type SalesItem as input
	 * and adds it to the itemsList array. If the cart is full, double the size of
	 * the cart. Hint: check ensureCapacity method from IntArrayBag in
	 * BagCollectionClasses that is posted on D2L.
	 */

	public void addItem(SalesItem itemToAdd) { // help
		if (numItems == itemsList.length) {
			ensureCapacity((numItems + 1) * 2);
		}
		itemsList[numItems] = itemToAdd;
		numItems++;
	}

	public double cartTotalCost() {
		double totalCost = 0;
		for (int i = 0; i < numItems; i++) {
			totalCost = totalCost + itemsList[i].price;
		}
		return totalCost;
	}

	@Override
	public String toString() {
		String output = "";
		output += "Item                                   " + "Code     " + "Price     " + "Quantity" + "\n";

		output += "******************************************************************** \n";
		for (int i = 0; i < numItems; i++) {
			output += itemsList[i].toString() + "\n";

		}

		return output;
	}

	public SalesItem getAtIndex(int index) {
		if (index < numItems) {
			return itemsList[index];
		}
		return null;
	}
	/*
	 * countType: a method that takes as input one integer that represents the type
	 * of items to be counted where 1 means Book, 2 means Dictionary, and 3 means
	 * AudioCD. The method then counts how many items of this type are there in the
	 * cart. For example, if the input is 1 and the cart has an item of type Book
	 * and quantity 2 then this adds 2 the output count. The method returns 0 for
	 * any input value other than 1,2, or 3.
	 */

	public int countType(int input) {
		int bookCount = 0;
		int audCount = 0;
		int dictCount = 0;
		for (int i = 0; i < numItems; i++) {
			if (itemsList[i] instanceof Dictionary) {
				dictCount++;
			} else if (itemsList[i] instanceof AudioCD) {
				audCount++;
			} else if (itemsList[i] instanceof Book) {
				bookCount++;
			}

		}
		if (input == 1){
		return bookCount;
		}else if(input == 2) {
			return dictCount;
		}else if(input == 3) {
			return audCount;
		}else return 0;
		
	}

}
