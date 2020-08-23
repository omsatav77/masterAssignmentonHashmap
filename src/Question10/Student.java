package Question10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Student {

	int sid;
String sname;

	@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + "]";
}
	public Student(int sid, String sname) {
	super();
	this.sid = sid;
	this.sname = sname;
}
	public static void main(String[] args) {
		HashMap<Student,ArrayList<Course>>hmap=new HashMap<Student,ArrayList<Course>>(); 
		hmap.put(new Student(101,"Yudhistir"),new ArrayList<Course>(Arrays.asList(new Course(1,"java"),new Course(2,"python")) ));
		hmap.put(new Student(102,"Arjun"),new ArrayList<Course>(Arrays.asList(new Course(1,"python"),new Course(3,"Angular")) ));
		hmap.put(new Student(103,"Bhim"),new ArrayList<Course>(Arrays.asList(new Course(1,"java"),new Course(4,"SQL")) ));
		hmap.put(new Student(104,"Nakul"),new ArrayList<Course>(Arrays.asList(new Course(4,"SQL"),new Course(2,"python")) ));
		
		System.out.println(hmap);
		Set <Integer>hset=new  LinkedHashSet<Integer>();
		
		Set ss=hmap.entrySet();
	Iterator itr1=ss.iterator();
	while(itr1.hasNext())
	{
		Map.Entry ee=(Entry) itr1.next();
		ArrayList<Course>al=(ArrayList<Course>) ee.getValue();
		Iterator itral=al.iterator();
		while(itral.hasNext())
		{
			Course c=(Course) itral.next();
			hset.add(c.cid);
		}
		
	}
		System.out.println(hset);
		HashMap<Integer,ArrayList<Student>>hmapIstud= new HashMap<Integer,ArrayList<Student>>();
		ArrayList<Student>finalal=new ArrayList<Student>();
		
			Iterator hsetitr=hset.iterator();
			while(hsetitr.hasNext())
			{
				int tno=(int) hsetitr.next();
				Set ss2=hmap.entrySet();
				Iterator itrhmap2=ss2.iterator();
	
				while(itrhmap2.hasNext())
				{
					Map.Entry mm=(Entry) itrhmap2.next();
					Student stud1=(Student)mm.getKey();
					ArrayList<Course>al=(ArrayList<Course>) mm.getValue();
					Iterator itral=al.iterator();
						while(itral.hasNext())
					{
						Course c=(Course) itral.next();
						int ccid=c.cid;
					if(ccid==tno) {
						finalal.add(stud1);
					                   }	
					}
						System.out.println(finalal);

			}
				hmapIstud.put(tno,finalal);
				finalal.clear();
			
		}
			System.out.println(hmapIstud);
		
	}

}
