package by.epam.lesson9.hometask;

public class Newspaper extends Book {
	private String date;

	public Newspaper(String name, String author, String date, int yearPublished, int price) {
		super(name, author, yearPublished, price);
		setName(name);
		setAuthor(author);
		setPrice(price);
		setYearPublished(yearPublished);
		this.date = date;
	}

	public String getDate() {
		return date;
	}

	@Override
	public String toString() {
		return "[Newspaper " + name + ", By: " + author + ", Date: " + date + ", " + yearPublished + " year" + ", "
				+ price + "$" + "]";
	}

}
