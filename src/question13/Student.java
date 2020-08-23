package question13;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Student {
	int sid;
	String name;

	public Student(int sid, String name) {
		super();
		this.sid = sid;
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + "]";
	}


	public static void main(String[] args) {

		LinkedHashSet<Student> LinkHashmap1=new LinkedHashSet<Student>();
		LinkedHashSet<Student> LinkHashmap2=new LinkedHashSet<Student>();
		LinkHashmap1.add(new Student(101,"Bajarang puniya"));
		LinkHashmap1.add(new Student(102,"Sushil Kumar"));
		LinkHashmap1.add(new Student(103,"Amit Dhankad"));
		LinkHashmap1.add(new Student(104,"Rahul Aware"));
		LinkHashmap1.add(new Student(105,"Yogeshwar Datt"));

		
		LinkHashmap2.add(new Student(101,"Bajarang puniya"));
		LinkHashmap2.add(new Student(102,"Sushil Kumar"));
		LinkHashmap2.add(new Student(103,"Amit Dhankad"));
		LinkHashmap2.add(new Student(104,"Rahul Aware"));
		LinkHashmap2.add(new Student(105,"Yogeshwar Datt"));
		System.out.println(LinkHashmap1);
		System.out.println(LinkHashmap2);
		Scanner scanner1=new Scanner(System.in);
		System.out.println("enter Sid");
		int number=scanner1.nextInt();
		
		Iterator iterator1=LinkHashmap1.iterator();
		Iterator iterator2=LinkHashmap2.iterator();
		int pos1=0,pos2=0;
		while(iterator1.hasNext()||iterator2.hasNext())
		{ 
			if(iterator1.hasNext())
			{
			Student stud1=(Student) iterator1.next();
			pos1++;
			if(stud1.sid==number)
			{
				System.out.println("position in="+pos1);
			}
			}
			if(iterator2.hasNext())
			{
				pos2++;
			Student stud2=(Student) iterator2.next();
			
			if(stud2.sid==number)
			{
				System.out.println("position in="+pos2);
			}
			}
		
		}
	}

}
