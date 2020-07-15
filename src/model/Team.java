package model;
public class Team{
	private String name;
	private String coach;
	private String city;
	
	public Team(String name, String coach, String city) {
		super();
		this.name = name;
		this.coach = coach;
		this.city = city ;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	
	}
	
}

