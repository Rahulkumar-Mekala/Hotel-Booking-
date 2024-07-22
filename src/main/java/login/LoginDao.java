package login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Register.DBconnection;
import Register.Userbean;

public class LoginDao {
	 public Userbean registerpage= null;
	 public Userbean Login(String email,String password) {
		 try {
			Connection connection = DBconnection.connection;
			PreparedStatement preparedStatement = connection.prepareStatement("select * from register where mid=? and paswword=?");
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, password);
			ResultSet executeQuery = preparedStatement.executeQuery();
			if (executeQuery.next()) {
				this.registerpage = new Userbean();
				this.registerpage.setUsername(executeQuery.getString(1));
				this.registerpage.setPassword(executeQuery.getString(2));
				this.registerpage.setFristname(executeQuery.getString(3));
				this.registerpage.setLastname(executeQuery.getString(4));
				this.registerpage.setAddress(executeQuery.getString(5));
				this.registerpage.setEmail(executeQuery.getString(6));
				this.registerpage.setPhone(executeQuery.getLong(7));
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return registerpage;
		 
	 }

}
