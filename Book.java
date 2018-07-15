package by.epam.lesson9.hometask;

public class Book {
	protected String name;
	protected int price;
	protected String author;
	protected int yearPublished;

	public Book(String name, String author, int yearPublished, int price) {
		this.name = name;
		this.author = author;
		this.yearPublished = yearPublished;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYearPublished() {
		return yearPublished;
	}

	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price=" + price + ", getName()=" + getName()
				+ ", getAuthor()=" + getAuthor() + ",getYearPublished()= " + getYearPublished() + " , getPrice()="
				+ getPrice() + "]";
	}

}
