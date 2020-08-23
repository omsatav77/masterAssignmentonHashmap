package longestPailandrome;

import java.util.Scanner;

public class pailandromeString {
			  public static void main(String[] args) {
				  Scanner scanner = new Scanner(System.in);
				  System.out.println("enter String");
			    String Str1 = scanner.next();
			    String finalstr="";
			    if(Str1.isEmpty()) {
			    	finalstr= "";
			    }
			    else {
			    int n = Str1.length();
			    int lng = 0, fst = 0, lst = 0;
			    boolean[][] pmatrx = new boolean[n][n];
			    
			    for(int j = 0; j < n; j++) 
			    {
			   	pmatrx[j][j] = true;
			   	for(int i = 0; i < j; i++) 
			   	{
		  		if(Str1.charAt(i) == Str1.charAt(j) && (j-i <= 2 || pmatrx[i+1][j-1])) 
		  		{
		  			pmatrx[i][j] = true;
				if(j-i+1 > lng) 
				{
					lng = j-i+1;
					fst = i;
				lst = j;
			    			}  
			    		}
			    	}
			    }
			    
			   finalstr= Str1.substring(fst, lst+1);
			  }
			  System.out.println(finalstr);
			  }
			  }	


