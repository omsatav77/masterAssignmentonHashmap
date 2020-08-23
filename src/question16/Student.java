package question16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Student implements Comparable<Student>  {

	int sid;
	int TotalMarks;
	
	public Student(int sid, int totalMarks) {
		super();
		this.sid = sid;
		TotalMarks = totalMarks;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", TotalMarks=" + TotalMarks + "]";
	}

	public static void main(String[] args) {

		//  an ArrayList<Test>and test has {tid,sid,int marks[]} .Create a
		// Set<Student> Student{sid,totalmarks} from the list and sort the set in
		// descending order of totalmarks
		
	ArrayList<Test>array_list=new ArrayList<Test>();
	array_list.add(new Test(11,101,new int[] {20,30,50}));
	array_list.add(new Test(22,102,new int[] {40,30,50}));
	array_list.add(new Test(33,103,new int[] {50,50,50}));
	array_list.add(new Test(44,104,new int[] {60,30,60}));
	array_list.add(new Test(55,105,new int[] {20,60,50}));

	Set<Student> sset=new HashSet();
Iterator iterator_1=array_list.iterator();
while(iterator_1.hasNext())
{
	Test test=(Test)iterator_1.next();
	
	int ssid=test.sid;
	int [] arr=test.marks;
	int total=0;
	for(int i=0;i<arr.length;i++)
	{
		total=total+arr[i];
	}
	sset.add(new Student(ssid,total));
	
}

	
System.out.println(sset);	
ArrayList<Student>arraylistf =new ArrayList<Student>(sset);

Collections.sort(arraylistf);
System.out.println(arraylistf);
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.TotalMarks-o.TotalMarks;
	}



}
