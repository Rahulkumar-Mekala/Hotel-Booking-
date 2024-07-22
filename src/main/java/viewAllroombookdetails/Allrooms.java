package viewAllroombookdetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import DeluxeRoom.DBConnection;
import Register.Userbean;

public class Allrooms {
	 public ArrayList<Userbean>list= new ArrayList<Userbean>();
	 public ArrayList<Userbean> retrive() {
		 try {
			Connection connection = DBConnection.getcon();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from register");
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				Userbean userbean = new Userbean();
				userbean.setUsername(resultSet.getString(1));
				userbean.setPassword(resultSet.getString(2));
				userbean.setFristname(resultSet.getString(3));
				userbean.setLastname(resultSet.getString(4));
				userbean.setAddress(resultSet.getString(5));
				userbean.setEmail(resultSet.getString(6));
				userbean.setPhone(resultSet.getLong(7));
				 list.add(userbean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}

}
