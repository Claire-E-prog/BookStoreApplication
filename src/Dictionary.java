
public class Dictionary extends Book {
	String language;
	int numDefinitions;

	public Dictionary(int code, double price, int quantity, String author, int numPages, String language, int numDefinitions) {
		super(code, price, quantity, author, numPages);
		this.language = language;
		this.numDefinitions = numDefinitions;
		
	}
	
	public double getRatio() {
		double avgDefPerPage = numDefinitions/numPages;
		return avgDefPerPage;
		
		
	}

	@Override
	public String toString() {
		return "Dictionary [language=" + language + ", numDefinitions=" + numDefinitions + ", author=" + author
				+ ", numPages=" + numPages + ", code=" + code + ", price=" + price + ", quantity=" + quantity + "]";
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getNumDefinitions() {
		return numDefinitions;
	}

	public void setNumDefinitions(int numDefinitions) {
		this.numDefinitions = numDefinitions;
	}
	

}
