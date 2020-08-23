package Question6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Student {

	int rollno;
	String name;
	int marks;
	
	public Student(int rollno, String name, int marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	public static void main(String[] args) {

		HashSet<Student>hashset1=new HashSet<Student>();
		hashset1.add(new Student(101,"munna",85));
		hashset1.add(new Student(102,"Jassa",75));
		hashset1.add(new Student(103,"Laddu",85));
		hashset1.add(new Student(104,"maousam",65));
		hashset1.add(new Student(105,"sumit",85));
		HashMap<Integer,ArrayList<Integer>>hashmap1=new HashMap<Integer,ArrayList<Integer>>();
		
		
		Iterator iterator1=hashset1.iterator();
		while(iterator1.hasNext())
		{
			Student stud1=(Student) iterator1.next();
	
			Iterator iterator2=hashset1.iterator();
			ArrayList<Integer>arraylist1=new ArrayList<Integer>();
			while(iterator2.hasNext())
			{
				
				Student stud2=(Student) iterator2.next();
				if(stud1.marks==stud2.marks)
				{
				arraylist1.add(stud2.rollno);	
				}
			}
			hashmap1.put(stud1.marks,arraylist1);
			
		}
		
System.out.println(hashmap1);
	}
	

}
