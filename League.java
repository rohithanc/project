package project;

import java.util.ArrayList;
import java.util.List;

public class League {

	private	List<Team> league = new ArrayList<>();
	
	public boolean AddTeam(Team team) {
		return this.league.add(team);
	}
	
	public boolean RemoveTeam(Team team) {
		return this.league.remove(team);
	}
}
