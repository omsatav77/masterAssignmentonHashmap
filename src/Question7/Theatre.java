package Question7;

import java.util.ArrayList;
import java.util.Collections;

public class Theatre  {	

	int theatreId;
	 String theatreName;
	String location;
	Movie m;
	public Theatre(int theatreId, String theatreName, String location, Movie m) {
		super();
		this.theatreId = theatreId;
		this.theatreName = theatreName;
		this.location = location;
		this.m = m;
		
		
	}
@Override
	public String toString() {
		return "Theatre [theatreId=" + theatreId + ", theatreName=" + theatreName + ", location=" + location + ", m="
				+ m + "]";
	}
public static void main(String[] args) {
	
	ArrayList<Theatre> arraylist1=new ArrayList<Theatre>();
	arraylist1.add(new Theatre(1,"PVR","swaragate",new Movie(1001,"bahubali",4)));
	arraylist1.add(new Theatre(2,"inorbit","kharadi",new Movie(1002,"KGF",4)));
	arraylist1.add(new Theatre(3,"Big Cinema","Kalyani Nagar",new Movie(1003,"Commando 2",2)));
	arraylist1.add(new Theatre(4,"PVR","swaragate",new Movie(1004,"bahubali 2",5)));
	arraylist1.add(new Theatre(5,"PVR","swaragate",new Movie(1005,"KGF 2",3)));
	System.out.println(arraylist1);
	Collections.sort(arraylist1,new MRatingComparator());
	System.out.println(arraylist1);
	
	
}	
}
