package master_assignment.bean;

import java.util.ArrayList;

public class Que5 {

	public static void main(String[] args) {

		ArrayList<Course> courseList = new ArrayList<Course>();
		
		for(int i=0;i<courseList.size();i++)
		{
		
			Course course=courseList.get(i);
			System.out.println("course Name: "+course.course_name);
			
			
			System.out.println("course Duration: "+course.duration);
			System.out.println("course Subbjects: "+course.subject);
			System.out.println("course feess: "+course.courseFees);
			System.out.println("course id ="+course.courseId);
			
			
			
			
			
		}
		
	}

}
