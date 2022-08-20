
public class ShppingDriver {

	public static void main(String[] args) {
		
		SalesItem item1 = new Book(152, 10.99, 1, "Dahl", 250);
		SalesItem item2 = new Dictionary(336, 50.25, 11, "Webster", 1000, "English", 5000);
		SalesItem item3 = new AudioCD(550, 12.99, 1, "Empire", 90);
		SalesItem item4 = new Book(152, 10.99, 1, "Rowling", 600);
		SalesItem item5 = new Dictionary(399, 30.25, 1, "Collins", 500, "Spanish", 1000);
		SalesItem item6 = new AudioCD(522, 6.99, 1, "Sony" , 60);
		
		Cart cart1 = new Cart(5);
		cart1.addItem(item1);
		cart1.addItem(item2);
		cart1.addItem(item3);
		cart1.addItem(item4);
		cart1.addItem(item5);
		
		System.out.println(cart1);
		
		System.out.println(item1);
		
		ItemDiscount discount1 = new ItemDiscount(10,15);
		
			double promoPrice = 0;
			for(int i = 0;i < cart1.size(); i++) {
				SalesItem item = cart1.getAtIndex(i);
				item.monthlyPromo();
				discount1.calculateDiscount(item);
			}
	}
	
}
