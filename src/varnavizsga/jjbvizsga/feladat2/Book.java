package varnavizsga.jjbvizsga.feladat2;

public class Book {
	
	private int id;
	private String author;
	private String title;
	private int price;
	private boolean onSale;

	public int getId() {
		  return this.id;
	}
	
	public String getAuthor() {
		  return this.author;
	}
	
	public String getTitle() {
		  return this.title;
	}
	
	public int getPrice() {
		  return this.price;
	}
	
	public boolean getOnSale() {
		return this.onSale;
	}
	
    public Book(int id, String author, String title, int price, boolean onSale) {
    }

    public boolean isOnSale() {
        throw new UnsupportedOperationException();
    }

    public void setOnSale(boolean onSale) {
        throw new UnsupportedOperationException();
    }

    public int getCurrentPrice() {
        throw new UnsupportedOperationException();
    }

    public void printBook() {
        System.out.print("Szerző - " + this.author + "cím" + this.title + " : jelenlegi ár" + this.price + " Ft");
    }
}
