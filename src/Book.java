
public class Book extends SalesItem {
	
	String author;
	int numPages;
	
	public Book(int code, double price, int quantity, String author, int numPages) {
		super(code, price, quantity);
		this.author = author;
		this.numPages = numPages;
	}
	
	

	@Override
	public double monthlyPromo() {
		double bookPromo = 0.03 * price;
		price = price - bookPromo;
		return price;
	}


	@Override
	public String toString() {
		return "Book [author=" + author + ", numPages=" + numPages + ", code=" + code + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public int getNumPages() {
		return numPages;
	}



	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}
	

}
