package by.epam.lesson9.hometask;

public class ClassicLiterature extends Book {
	private int countPages;

	public ClassicLiterature(String name, String author, int yearPublished, int countPages, int price) {
		super(name, author, yearPublished, price);
		setName(name);
		setAuthor(author);
		setYearPublished(yearPublished);
		setPrice(price);
		this.countPages = countPages;
	}

	public int getYearPublished() {
		return countPages;
	}

	public void setYearPublished(int datePublished) {
		this.countPages = countPages;
	}

	@Override
	public String toString() {
		return "[Classic Literature " + name + ", " + author + ", " + yearPublished + " year" + ", " + countPages + "p."
				+ ", " + price + "$" + "]";
	}
}
