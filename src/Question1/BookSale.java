package Question1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class BookSale {
	Book b;
	int CopiesSold;

	public BookSale(Book b, int copiesSold) {
		super();
		this.b = b;
		CopiesSold = copiesSold;
	}

	public static void main(String[] args) {
		ArrayList<BookSale> BookSalelist = new ArrayList();
		BookSalelist.add(new BookSale(new Book(1, "p.l.Deshpande", 5.00f), 6));
		BookSalelist.add(new BookSale(new Book(2, "Shivaji sawant", 3.00f), 5));
		BookSalelist.add(new BookSale(new Book(3, "kabeer", 8.00f), 6));
		BookSalelist.add(new BookSale(new Book(4, "tanaji sawant", 7.00f), 7));
		BookSalelist.add(new BookSale(new Book(5, "omkar", 3.00f), 8));
		BookSalelist.add(new BookSale(new Book(6, "om", 4.00f), 3));
		BookSalelist.add(new BookSale(new Book(1, "kar", 5.00f), 4));
		// bookid as key and value as float amount
		HashMap<Integer, Float> map = new HashMap<Integer, Float>();
		map.put(1, 2.00f);
		map.put(2, 3.00f);
		map.put(3, 6.00f);
		map.put(4, 4.00f);

		Iterator<BookSale> iterator = BookSalelist.iterator();
		while (iterator.hasNext()) {
			BookSale booksale = iterator.next();
			int bookid1 = booksale.b.bookid;
			// System.out.println(bookid1);
		float BusiAmt = (booksale.CopiesSold * booksale.b.price);
		//
			Set set = map.entrySet();
			java.util.Iterator iterator1 = set.iterator();
			while (iterator1.hasNext()) {
				Map.Entry entry = (Entry) iterator1.next();

				int string = (int) entry.getKey();
				if (bookid1 == string) {
					float amount = (float) entry.getValue();
					BusiAmt = BusiAmt + amount;
				}

			}

			//
			map.put(bookid1, BusiAmt);
		}

		Set set = map.entrySet();
		java.util.Iterator iterator1 = set.iterator();
		while (iterator1.hasNext()) {
			Map.Entry entry2 = (Entry) iterator1.next();

			int string = (int) entry2.getKey();
			float float1 = (float) entry2.getValue();
			System.out.println(string + " " + float1);
		}

	}

}
