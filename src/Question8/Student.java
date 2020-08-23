package Question8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Student {

	int sid;
	String sname;
	ArrayList <String>Hobby;
	
	public Student(int sid, String sname, ArrayList<String> hobby) {
		super();
		this.sid = sid;
		this.sname = sname;
		Hobby = hobby;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", Hobby=" + Hobby + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student studArray[]=new Student[4];
    studArray[0]= new Student(101,"Karn", new ArrayList<String>(Arrays.asList("reading","chess")));
    studArray[1]= new Student(102,"Duryodhan", new ArrayList<String>(Arrays.asList("wrestling","chess")));
    studArray[2]= new Student(103,"Yudhishtir", new ArrayList<String>(Arrays.asList("cricket","reading")));
    studArray[3]= new Student(104,"Shakuni", new ArrayList<String>(Arrays.asList("reading","wrestling")));
	HashSet<String>hashset1=new HashSet<String>();
	for(int i=0;i<studArray.length;i++)
	{
		Student stud1=studArray[i];
		ArrayList<String>hobbi=stud1.Hobby;

		for(int j=0;j<hobbi.size();j++)
		{
			hashset1.add(hobbi.get(j));
		}
		
	}
	HashMap<String,ArrayList<Student>>hashmap=new HashMap<String,ArrayList<Student>>();
	
	Iterator itr=hashset1.iterator();
	while(itr.hasNext())
	{
		
		String hsethobby =(String) itr.next();
		ArrayList<Student>hobby1=new ArrayList<Student>();
		hobby1.clear();
		for(int i=0;i<studArray.length;i++)
		{
			Student stud1=studArray[i];
			ArrayList<String>hobbi=stud1.Hobby;
			for(int j=0;j<hobbi.size();j++)
			{
				
				if(hsethobby.equals(hobbi.get(j)))
						{
					hobby1.add(stud1);
					break;
						}
			}
			
		}
		hashmap.put(hsethobby,hobby1);
		//
	}
	System.out.println(hashmap);
	
	
	}

}
