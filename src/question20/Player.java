package question20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// Consider List of T20 Players.
//Player (playerid,Name,Country,team)
//e.g. (1,”MSDhoni”,”India”,”Chennai Super Kings”)
//Then find out which team has maximum Australian players.
public class Player {
int playerid;
String Name;
String Country;
String Team;


@Override
public String toString() {
	return "Player [playerid=" + playerid + ", Name=" + Name + ", Country=" + Country + ", Team=" + Team + "]";
}

	public Player(int playerid, String name, String country, String team) {
	super();
	this.playerid = playerid;
	Name = name;
	Country = country;
	Team = team;
	
	
	
	
	
}




	




	public static void main(String[] args) {
		ArrayList <Player>arraylist=new ArrayList<Player>();
		arraylist.add(new Player(101,"M.S.Dhoni","India","Chennai Super Kings"));
		arraylist.add(new Player(102,"Smith","Australia","Mumbai Indians"));
		arraylist.add(new Player(103,"suresh raina","India","Chennai Super Kings"));
		arraylist.add(new Player(104,"David Warner","Australia","kolkata knight riders"));
		arraylist.add(new Player(105,"Ben cutting ","Australia","Mumbai Indians"));
		arraylist.add(new Player(106,"Andrew tye","Australia","Chennai Super Kings"));
		arraylist.add(new Player(107,"rohit sharma","Australia","Mumbai Indians"));
		arraylist.add(new Player(108,"Shane Watson","Australia","kolkata knight riders"));
		
		
//System.out.println(arraylist);		
		Iterator itrarraylist=arraylist.iterator();
		
		String string1="";
		int fcntemp=0;
		while(itrarraylist.hasNext())
		{
			Player player1=(Player)itrarraylist.next();
			
			String tname=player1.Team;
			Iterator itr=arraylist.iterator();
			int cnt=0;
			while(itr.hasNext())
			{
				Player p1=(Player)itr.next();
			if (p1.Country.compareTo("Australia")==0 &&tname.compareTo(p1.Team)==0)
			{
				cnt++;
			}
							
				
			}
			if(cnt>fcntemp)
			{
				fcntemp=cnt;
				string1=player1.Team;
			}
			
		}		
		
		System.out.println(string1);
		
	}
}

