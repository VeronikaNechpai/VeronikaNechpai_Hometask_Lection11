package by.epam.lesson9.hometask;

import java.util.Comparator;

public class BookComparator implements Comparator<Book>{
	public int compare(Book anyBook1, Book anyBook2) {
		int price1=anyBook1.getPrice();
		int price2=anyBook2.getPrice();
		if (price1<price2) {
			return -1;
		} else if (price1==price2) {
			return 0;
		}else {
			return 1;
		}
	}
}
