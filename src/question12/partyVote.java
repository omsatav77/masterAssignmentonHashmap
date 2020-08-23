package question12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class partyVote {

	public static void main(String[] args) {

	HashMap<String,String>hashmap1=new HashMap<String,String>();
	hashmap1.put("565133020233", "ShivSena");
	hashmap1.put("565133020231", "NCP");
	hashmap1.put("565133020232", "BJP");
	hashmap1.put("565133020234", "ShivSena");
	
	hashmap1.put("565133020235", "ShivSena");
	hashmap1.put("565133020236", "BJP");
	hashmap1.put("565133020237", "ShivSena");
	hashmap1.put("565133020238", "ShivSena");
	HashMap<String,Integer>hashmap2=new HashMap<String,Integer>();
	Set set1=hashmap1.entrySet();
	Iterator iteratorr=set1.iterator();
	while(iteratorr.hasNext())
	{
		Map.Entry entry1 = (Entry) iteratorr.next();		
		int count1=0;
		String sval=(String)  entry1.getValue();
		Set sset=hashmap1.entrySet();
		Iterator iterator1=sset.iterator();
		while(iterator1.hasNext())
		{
			Map.Entry entry2 = (Entry) iterator1.next();		
			String string1=(String)  entry2.getValue();
		if(string1.compareTo(sval)==0)
		{
			count1++;
		}
		}
		hashmap2.put(sval, count1);
	}
	System.out.println(hashmap2);
	}

}
