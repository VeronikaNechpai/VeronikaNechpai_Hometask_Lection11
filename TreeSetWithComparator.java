package by.epam.lesson9.hometask; //hometask for lesson 11

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetWithComparator {
	public static void main(String[] args) {
		Comparator<Book> comparator = new BookComparator();
		Comparator<Book> comparator2 = new BookComparatorByYear();

		Set<Book> set = new TreeSet<Book>(comparator);
		Set<Book> set2 = new TreeSet<Book>(comparator2);

		set.add(new ClassicLiterature("Harry Potter", "Joan Rolling", 370, 2007, 105));
		set.add(new ElectronicBook("Windows for Dummies", "pdf", "Veres", 1999, 0));
		set.add(new ElectronicMap("Belarus Map", "Minsk", "nm2", "Veres", 2015, 5));
		set.add(new Newspaper("Times", "Veres", "24/06/2018", 1972, 7));

		set2.add(new ClassicLiterature("Harry Potter", "Joan Rolling", 370, 2007, 105));
		set2.add(new ElectronicBook("Windows for Dummies", "pdf", "Veres", 1999, 0));
		set2.add(new ElectronicMap("Belarus Map", "Minsk", "nm2", "VeresNew", 2015, 5));
		set2.add(new Newspaper("Times", "Veres", "24/06/2018", 1972, 7));

		System.out.println("A sorted set of Books by price:");
		Set<Book> set3 = new TreeSet<Book>(comparator);
		for (Book element : set) {
			if (element.getAuthor().equals("Veres")) {
				set3.add(element);
			}
		} System.out.println(set3);
		
		System.out.println("A sorted set of Books by Year Published:");
		Set<Book> set4 = new TreeSet<Book>(comparator2);
		set4.addAll(set3);
		System.out.println(set4);
	}
}
