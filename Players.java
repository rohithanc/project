package project;

public class Players extends Team {
	
	String name;
	int Age;
	String Position;
	Boolean Outfield;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}
	public Boolean getOutfield() {
		return Outfield;
	}
	public void setOutfield(Boolean outfield) {
		Outfield = outfield;
	}
	public Players(String name, int age, String position, Boolean outfield) {
		super();
		this.name = name;
		Age = age;
		Position = position;
		Outfield = outfield;
	}
	
	@Override
	public boolean Goalkeeper() {
		boolean Outfield = true;
		Position = "Goalkeeper"; 
		if(Position = "Goalkeeper"){
			Outfield = false;
		}else {
			Outfield = true;
		}
	}

	
}
