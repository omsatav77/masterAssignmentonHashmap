package Question5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Customer  implements Comparable<Customer>{

	int cid;
	String name;
	int items;
		public Customer(int cid, String name, int items) {
		super();
		this.cid = cid;
		this.name = name;
		this.items = items;
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList<Customer>arraylist1=new ArrayList<Customer>();
arraylist1.add(new Customer(101,"Sonu Nigam",5));
arraylist1.add(new Customer(102,"Sgreya ghosal",4));
arraylist1.add(new Customer(103,"Arjit Sing",9));
arraylist1.add(new Customer(101,"mankrit Aullakh",2));
System.out.println(arraylist1);
for(int i=0;i<arraylist1.size();i++)
{
	int  ccid=arraylist1.get(i).cid;
	String nname=arraylist1.get(i).name;
			int items=arraylist1.get(i).items;
		
		
		for(int k=i+1;k<arraylist1.size();k++)
		{
			int kcid=arraylist1.get(k).cid;
			if(kcid==ccid)
			{
				int temp2=items+arraylist1.get(k).items;
				
				arraylist1.get(i).items=temp2;
				
			}
			
		}
}
System.out.println(arraylist1);
Collections.sort(arraylist1);
System.out.println(arraylist1);

	}
		@Override
		public String toString() {
			return "Customer [cid=" + cid + ", name=" + name + ", items=" + items + "]";
		}
		@Override
		public int compareTo(Customer o) {
			// TODO Auto-generated method stub
			return o.items-this.items;
		}

}
