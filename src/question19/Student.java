package question19;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Student {
int studid;
String name;
String Qualification;
int YearOfPassing;
boolean placed;
	
	
	
	@Override
public String toString() {
	return "Student [studid=" + studid + ", name=" + name + ", Qualification=" + Qualification + ", YearOfPassing="
			+ YearOfPassing + ", placed=" + placed + "]";
}



	public Student(int studid, String name, String qualification, int yearOfPassing, boolean placed) {
	super();
	this.studid = studid;
	this.name = name;
	Qualification = qualification;
	YearOfPassing = yearOfPassing;
	this.placed = placed;
}



	public static void main(String[] args) {

		HashSet <Student> hashSet1=new HashSet <Student>();
		hashSet1.add(new Student(1,"omkar","BCA",2019,true));
		hashSet1.add(new Student(2,"steive","MCA",2020,false));
		hashSet1.add(new Student(3,"Yash","BE",2018,true));
		hashSet1.add(new Student(4,"Ambar","Mtech",2019,false));
		hashSet1.add(new Student(5,"John","MBA",2019,true));
		
		ArrayList<Student>placedstudlist=new ArrayList<Student>();
		ArrayList<Student>unplacedstudlist=new ArrayList<Student>();
		
		Iterator iterator1=hashSet1.iterator();
		while(iterator1.hasNext())
		{
			Student stud1=(Student)iterator1.next();
			if(stud1.placed)
			{
				placedstudlist.add(stud1);
			}
			else
			{
				unplacedstudlist.add(stud1);
			}
			
		}
		
	
	System.out.println("placed Student");
	System.out.println(placedstudlist);
	
	System.out.println("unplaced Student");
	System.out.println(unplacedstudlist);
	
	}

}
