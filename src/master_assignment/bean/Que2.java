package master_assignment.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Que2 {

	public static void main(String[] args) {

		ArrayList<Course> courseList = new ArrayList<Course>();
		HashMap<Integer, List<Transaction>> transactionMap = new HashMap<Integer, List<Transaction>>();
		Set set=transactionMap.entrySet();
		Iterator iterator1=set.iterator();
		ArrayList<Integer>finalsid=new ArrayList<Integer>();
		while(iterator1.hasNext())
		{
			int totalCFees=0;
			Map.Entry entry=(Entry) iterator1.next();
			int Dcid=(int) entry.getKey();
for(int i=0;i<courseList.size();i++)
			{
				Course courde1=(Course) courseList.get(i);
				if(Dcid==courde1.courseId)
				{
					totalCFees=courde1.courseFees;
					break;
				}
			}
			ArrayList<Transaction>arraylist1=(ArrayList<Transaction>) entry.getValue();
			for(int j=0;j<arraylist1.size();j++)
			{
				Transaction tranj3=(Transaction) arraylist1.get(j);
				int studId1=tranj3.studId;
			
				for(int k=j+1;k<arraylist1.size();k++)
				{
					if(studId1==arraylist1.get(k).studId)
					{
						arraylist1.get(k).paidfees=+arraylist1.get(j).paidfees;
						if(arraylist1.get(k).paidfees>=totalCFees)
						{
							finalsid.add(arraylist1.get(k).studId);
						}
						}
					else if (arraylist1.get(k).paidfees>=totalCFees) {
						finalsid.add(arraylist1.get(k).studId);
					}
				}
					
				}
		}
		System.out.println(finalsid);
	}

}
