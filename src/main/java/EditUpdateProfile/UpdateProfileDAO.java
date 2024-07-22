package EditUpdateProfile;


import java.sql.Connection;
import java.sql.PreparedStatement;

import Register.Userbean;


public class UpdateProfileDAO {
	 public int k=0;
	 public int Update(Userbean bean) {
		 try {
			Connection connection = DBConnection.getcon();
			PreparedStatement preparedStatement = connection.prepareStatement("update register set ADDRESS= ? ,phonenumber =? where MID=? and PASWWORD= ?");
			preparedStatement.setString(1, bean.getAddress());

			preparedStatement.setLong(2, bean.getPhone());
			preparedStatement.setString(3, bean.getEmail());
			preparedStatement.setString(4, bean.getPassword());
			 k = preparedStatement.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return k;
		
	}
	 
	 

}
