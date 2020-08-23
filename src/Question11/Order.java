package Question11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Order {

	int ordid;
	String menuName;
	float price;
	int QtyOrd;
	
	public Order(int ordid, String menuName, float price, int qtyOrd) {
		super();
		this.ordid = ordid;
		this.menuName = menuName;
		this.price = price;
		QtyOrd = qtyOrd;
	}

	public static void main(String[] args) {
HashMap <String ,Float>hashmap1=new HashMap <String ,Float>();

	ArrayList<Order>arraylist=new ArrayList<Order>();
	arraylist.add(new Order(101,"Vada-Paav",5.00f,10));
	arraylist.add(new Order(102,"Paav-Bhaji",14.00f,3));
	arraylist.add(new Order(103,"Hakka-Nuddles",25.00f,5));
	arraylist.add(new Order(104,"Grilled-Sandwitch",35.00f,2));
	arraylist.add(new Order(105,"Vada-Paav",5.00f,05));
	
	Iterator iterator1=arraylist.iterator();
	while(iterator1.hasNext())
	{
		Order o=(Order) iterator1.next();
		String string1=o.menuName;
		int sum=0;
		Iterator iterator2=arraylist.iterator();
		while(iterator2.hasNext())
		{
			Order o2=(Order) iterator2.next();
		if(string1.equals(o2.menuName))
{
  sum=(int) (sum+(o2.price*o2.QtyOrd));
}
				
		}
		hashmap1.put(string1, (float) sum);
		
	}
	System.out.println(hashmap1);
	}

}
