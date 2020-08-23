package Question3;

import java.util.Iterator;
import java.util.LinkedList;

public class MissingElementQ3 {

	public static void main(String[] args) {

//		Given a linked list of integers , find out number of missing elements in linked list. 
//		E.g. list
//		contains { 2 , 3, 7} missing elements are 4, 5, 6. 
//		If list contains { 3 , 13 , 7 , 2 } . missing
//		elements are 4,5,6,8,9,10,11,12 and so on. Write a logic which will work for
//		any list

	
	
	LinkedList <Integer>linklist=new LinkedList();
	linklist.add(9);
	linklist.add(3);
	linklist.add(7);
	System.out.println(linklist);

	int max=linklist.get(0);
	int min=linklist.get(0);
for(int i=0;i<linklist.size();i++)
{
	if(linklist.get(i)>max)
		max=linklist.get(i);
	if(linklist.get(i)<min)
		min=linklist.get(i);
}

boolean flag=true;


for(int j=min;j<=max;j++)
{
	flag=true;
	for(int k=0;k<linklist.size();k++)
	{
		int tmp=linklist.get(k);
		
		if(j==tmp)
		{
			flag =false;
			break;
		}
		
	}
	if(flag==true)
	{
		System.out.println(j);
	}
}

	}

}
