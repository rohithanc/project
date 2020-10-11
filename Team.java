package project;

import java.util.ArrayList;
import java.util.List;

public class Team extends League{

	String TeamName;
	int NumberOfPlayers;
	String Captain;
	public String getTeamName() {
		return TeamName;
	}
	public void setTeamName(String teamName) {
		TeamName = teamName;
	}
	public int getNumberOfPlayers() {
		return NumberOfPlayers;
	}
	public void setNumberOfPlayers(int numberOfPlayers) {
		NumberOfPlayers = numberOfPlayers;
	}
	public String getCaptain() {
		return Captain;
	}
	public void setCaptain(String captain) {
		Captain = captain;
	}
	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Team(String teamName, int numberOfPlayers, String captain) {
		super();
		TeamName = teamName;
		NumberOfPlayers = numberOfPlayers;
		Captain = captain; // how to assign one captain to a team
	}
	public void Position() {
		// TODO Auto-generated method stub
		
	}
	
	private	List<Players> team = new ArrayList<>();
	
	public boolean AddPlayer(Players player) {
		return this.team.add(player);
	}
	
	public boolean RemovePlayer(Players player) {
		return this.team.remove(player);
	}
	
	public boolean Goalkeeper() {
		return false;
		// TODO Auto-generated method stub
		
	}
}
