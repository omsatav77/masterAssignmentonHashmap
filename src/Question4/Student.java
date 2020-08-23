package Question4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Student {
	// A hashmap contains information about students and his marks. Student object
	// is key and marks is value. Write a method to create 2 hashset which will have
	// passed students of java course and passed students of angular course. Passing
	// marks for java is 50 and passing marks for angular is 60. Student class is as
	// follows. Student { intsid , String name, String course }
	
	int sid;
	String name;
	String course; 
	
	public Student(int sid, String name, String course) {
		super();
		this.sid = sid;
		this.name = name;
		this.course = course;
	}

	public static void main(String[] args) {

		HashMap<Student,Integer>hashmap1=new HashMap<Student,Integer>();
		hashmap1.put(new Student(101,"sachin","java"),40);
		hashmap1.put(new Student(102,"shikhar","angular"),70);
		hashmap1.put(new Student(103,"mahendra","java"),60);
		hashmap1.put(new Student(104,"rohit","angular"),70);
		hashmap1.put(new Student(105,"hardik","java"),40);
		hashmap1.put(new Student(106,"ishant","angular"),50);
		System.out.println(hashmap1);
		HashSet<Student>hsetpassjava=new HashSet();
		HashSet<Student>hsetpassangular=new HashSet();
		
		Set set1=hashmap1.entrySet();
		Iterator iterator1=set1.iterator();
		while(iterator1.hasNext())
		{
			Map.Entry entry=(Entry)iterator1.next();
			Student stud1=(Student)entry.getKey();
			int number=(int)entry.getValue();
			if((stud1.course.compareTo("java")==0)&&number>=50)
			{
				hsetpassjava.add(stud1);
			}
			else if((stud1.course.compareTo("angular")==0)&&number>=60)
			{
				hsetpassangular.add(stud1);
			}
			
		}
		System.out.println(hsetpassjava);
		System.out.println(hsetpassangular);
		
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", course=" + course + "]";
	}

}
