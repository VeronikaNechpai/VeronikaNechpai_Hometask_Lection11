package by.epam.lesson9.hometask;

public class ElectronicBook extends Book {
	protected String format;

	public ElectronicBook(String name, String format, String author, int yearPublished, int price) {
		super(name, author, yearPublished, price);
		setName(name);
		setAuthor(author);
		setYearPublished(yearPublished);
		setPrice(price);
		this.format = format;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	@Override
	public String toString() {
		return "[Electronic Book " + name + ", " + author + ", " + format + ", " + yearPublished + " year" + " ,"
				+ price + "$" + "]";
	}
}

class ElectronicMap extends ElectronicBook {
	private String city;

	public ElectronicMap(String name, String city, String format, String author, int yearPublished, int price) {
		super(name, format, author, yearPublished, price);
		setName(name);
		setFormat(format);
		setAuthor(author);
		setYearPublished(yearPublished);
		setPrice(price);
		this.city = city;
	}

	private String getCity() {
		return city;
	}

	@Override
	public String toString() {
		return "[Electronic Map of " + name + ", for city of " + city + ", " + format + ", " + author + ", "
				+ yearPublished + " year" + ", " + price + "$" + "]";
	}

}
