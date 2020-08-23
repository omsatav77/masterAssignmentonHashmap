package Question2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 boolean flag=false;
		LinkedHashMap<String,Integer> Linkhashmap1 =new LinkedHashMap<String,Integer>();
		Linkhashmap1.put("pqr",12);
		Linkhashmap1.put("rst",43);
		Linkhashmap1.put("abc",4);
		Linkhashmap1.put("mno",2);
		
		
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("pqr");
		arrayList.add("rst");
		arrayList.add("abc");
		Iterator<String>iterator1=arrayList.iterator();
		int number=5;
		Set set=Linkhashmap1.entrySet();
		Iterator iterator2=set.iterator();			
		while (iterator1.hasNext())
		{
			String str1=iterator1.next();
			while(iterator2.hasNext())
			{
		
			Map.Entry entry=(Entry) iterator2.next();
			String tmp=(String) entry.getKey();
			if(str1.equals(tmp))
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
			break;
			}
	
			while(iterator1.hasNext()&&iterator2.hasNext())
			{
				String str2=iterator1.next();
				Map.Entry entry=(Entry) iterator2.next();
				String tmp2=(String) entry.getKey();
	//			System.out.println(tmp2);
			
			
			if(str2.equals(tmp2))
			{
				flag=true;
				continue;
			}
			else
			{
				flag=false;
				break;
			}
			}
			
			
			
			
			
			
		
			if(flag==true)
			{
				System.out.println("true");
			}
		//
			else if(flag==false)
			{
				System.out.println("false");
			}
		

		
		
		
		
}
	}


