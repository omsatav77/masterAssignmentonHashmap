package question16;

import java.util.Comparator;

public class SortComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s2.TotalMarks-s1.TotalMarks;
	}

}
