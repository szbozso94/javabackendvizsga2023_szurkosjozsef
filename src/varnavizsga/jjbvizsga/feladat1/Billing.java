package varnavizsga.jjbvizsga.feladat1;

public class Billing {

	private int priceWithVAT;
	private int priceWithoutVAT;
	private String author;
	private String title;
	
	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	private String displayBook;
	
    public Integer getPriceWithVAT() {
		return priceWithVAT;
	}

	public Integer getPriceWithoutVAT() {
		return priceWithoutVAT;
	}

	public String getDisplayBook() {
		return displayBook;
	}

	public static int priceWithVAT(int vatRate, int priceWithoutVAT) {
        return -1;
    }

    public static int priceWithoutVAT(int vatRate, int priceWithVAT) {
        return -1;
    }

    public static String displayBook(String author, String title, int priceWithVAT) {
        return null;
    }
    
    public void printBook() {
        System.out.print(this.author + " - " + this.title + "Áfával: " + this.priceWithVAT + " Ft, Áfa nélkül: " + this.priceWithoutVAT + "Ft");
    }
}
