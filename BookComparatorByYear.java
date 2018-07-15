package by.epam.lesson9.hometask;

import java.util.Comparator;

	public class BookComparatorByYear implements Comparator<Book>{
		public int compare(Book anyBook1, Book anyBook2) {
			int yearPublished1=anyBook1.getYearPublished();
			int yearPublished2=anyBook2.getYearPublished();
			if (yearPublished1<yearPublished2) {
				return -1;
			} else if (yearPublished1==yearPublished2) {
				return 0;
			}else {
				return 1;
			}
		}
	}

