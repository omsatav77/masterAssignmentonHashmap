package Question7;

import java.util.Collections;
import java.util.Comparator;

public class MRatingComparator implements Comparator<Theatre> {

	@Override
	public int compare(Theatre theatre1y, Theatre theatre2) {

		int number= theatre1y.m.rating-theatre2.m.rating;
		if(number==0)
		{
return theatre2.theatreName.compareTo(theatre1y.theatreName);
		}
		
		return theatre1y.m.rating-theatre2.m.rating;
	}

}
