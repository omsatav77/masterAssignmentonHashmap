package Question9;

import java.util.ArrayList;

public class Employee {

	String name;
	int eid;
	int mgrid;
	public Employee(String name, int eid, int mgrid) {
		super();
		this.name = name;
		this.eid = eid;
		this.mgrid = mgrid;
	}
	public static void main(String[] args) {
ArrayList<Employee>arraylist=new ArrayList<Employee>();
arraylist.add(new Employee("DilJeet",101,105));
arraylist.add(new Employee("Jassi",105,104));
arraylist.add(new Employee("Parmish",102,103));
arraylist.add(new Employee("J-star",103,102));
arraylist.add(new Employee("Mankrit",104,101));

	
	for(int i=0;i<arraylist.size();i++)
	{
		Employee employee1=arraylist.get(i);
		int empID=employee1.eid;
		int mngrId=employee1.mgrid;
		 for(int j=0;j<arraylist.size();j++)
		 {
			 Employee employee2=arraylist.get(j);
			 if(mngrId==employee2.eid)
			 {
				 System.out.println(employee1.name+" "+employee2.name);
			 }
		 }
	}
	
	
	
	
	}

}
