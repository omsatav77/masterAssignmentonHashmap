package question14;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> array_list=new ArrayList ();
ArrayList<Integer> array_list2=new ArrayList ();
ArrayList<Integer> joinArrayList=new ArrayList ();
array_list.add(1);array_list.add(2);
array_list.add(3);array_list.add(4);array_list.add(5);
array_list2.add(11);array_list2.add(22);
array_list2.add(33);
Iterator iterator_1=array_list.iterator();
Iterator iterator_2=array_list2.iterator();
while(iterator_1.hasNext()||iterator_2.hasNext())
{
	if(iterator_1.hasNext())
		joinArrayList.add((Integer) iterator_1.next());
	if(iterator_2.hasNext())
		joinArrayList.add((Integer) iterator_2.next());
	
	
}
System.out.println(joinArrayList);
}
}


