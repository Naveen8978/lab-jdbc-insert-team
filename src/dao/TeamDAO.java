package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.City;
import model.Team;
import utility.ConnectionManager;

public class TeamDAO{
	public void createTeam(Team team) {
		Connection con = ConnectionManager.getConnection();
		String sql = "Insert into kabbadi(name,coach,cityid,cityname)Values(?,?,?,?);"
				PreparedStatement st = con.prepareStatement(sql);
    	        City city = (City) team.getCity();
	        	st.setString(1, team.getName());
	    		st.setString(2,team.getCoach());
	    		st.setLong(4,city.getCityId());
	        	st.setString(5, city.getCityName());
	        	st.executeUpdate();
	    		con.close();
	    		System.out.println("Team has been created");



	}
}