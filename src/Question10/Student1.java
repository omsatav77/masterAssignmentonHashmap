package Question10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Student1 {

	int sid;
String sname;

	@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + "]";
}
	public Student1(int sid, String sname) {
	super();
	this.sid = sid;
	this.sname = sname;
}
	public static void main(String[] args) {
		HashMap<Student,ArrayList<Course>>hashmap1=new HashMap<Student,ArrayList<Course>>(); 
		hashmap1.put(new Student(101,"Yudhistir"),new ArrayList<Course>(Arrays.asList(new Course(1,"java"),new Course(2,"python")) ));
		hashmap1.put(new Student(102,"Arjun"),new ArrayList<Course>(Arrays.asList(new Course(1,"python"),new Course(3,"Angular")) ));
		hashmap1.put(new Student(103,"Bhim"),new ArrayList<Course>(Arrays.asList(new Course(1,"java"),new Course(4,"SQL")) ));
		hashmap1.put(new Student(104,"Nakul"),new ArrayList<Course>(Arrays.asList(new Course(4,"SQL"),new Course(2,"python")) ));
		
		System.out.println(hashmap1);
		ArrayList<Student>finalArrayList=new ArrayList<Student>();
		Set <Integer>hashset1=new  LinkedHashSet<Integer>();
		HashMap<Integer,ArrayList<Student>>hmapIstud= new HashMap<Integer,ArrayList<Student>>();
		Set set2=hashmap1.entrySet();
		Iterator itr1=set2.iterator();
		while(itr1.hasNext())
		{
			Map.Entry entry=(Entry) itr1.next();
			ArrayList<Course>al=(ArrayList<Course>) entry.getValue();
			Iterator itral=al.iterator();
			while(itral.hasNext())
			{
				Course cust=(Course) itral.next();
				hashset1.add(cust.cid);
			}
			
		}
			System.out.println(hashset1);
			
			ArrayList<Integer>arrayList1=new ArrayList<>(hashset1);
			for(int i=0;i<hashset1.size();i++)
			{
				int cust_id=arrayList1.get(i);
				Set set1=hashmap1.entrySet();
				Iterator itrhmap2=set1.iterator();
				while (itrhmap2.hasNext()) {

					Map.Entry entry2=(Entry) itrhmap2.next();
					Student stud1=(Student)entry2.getKey();
					ArrayList<Course>al=(ArrayList<Course>) entry2.getValue();

		finalArrayList.clear();			
					for(int number=0;number<al.size();number++)
	{
		if(cust_id==al.get(number).cid)
		{
			finalArrayList.add(stud1);
		}
	}
	hmapIstud.put(cust_id, finalArrayList);
				}

			}
			System.out.println(hmapIstud);
	}
	

}
