package question15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class SocietMembar {

	int membarid;
	String Wing_Fno;
	String name;
	public SocietMembar(int membarid, String wing_Fno, String name) {
		super();
		this.membarid = membarid;
		Wing_Fno = wing_Fno;
		this.name = name;
	}
	public static void main(String[] args) {
ArrayList<SocietMembar>array_List=new ArrayList<SocietMembar>();
array_List.add(new SocietMembar(101,"A201","Mahesh Babu") );
array_List.add(new SocietMembar(102,"A201","Allu Arjun") );
array_List.add(new SocietMembar(103,"A301","Prabhas") );
array_List.add(new SocietMembar(104,"A401","NTR rama rao") );
array_List.add(new SocietMembar(105,"A301","Vijay Devarakonda") );
array_List.add(new SocietMembar(106,"A201","Ram Charan") );
		
HashMap<String,ArrayList>hashMap_1= new HashMap<String,ArrayList>();
Iterator iterator1=array_List.iterator();

	while(iterator1.hasNext())
	{
		SocietMembar society_member=(SocietMembar)iterator1.next();
		String Wing=society_member.Wing_Fno;
		Iterator iterator2=array_List.iterator();
		ArrayList<String> array_List2=new ArrayList<String>();

		while(iterator2.hasNext())
		{
			SocietMembar society_member2=(SocietMembar)iterator2.next();
			if(Wing.compareTo(society_member2.Wing_Fno)==0)
			{
				array_List2.add(society_member2.name);
			}
			
		}
		hashMap_1.put(Wing,array_List2);
	}

	System.out.println(hashMap_1);
	}

}
