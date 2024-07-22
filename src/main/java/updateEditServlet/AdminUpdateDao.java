package updateEditServlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import AdminLogin.AdminBean;
import AdminLogin.DBconnection;

public class AdminUpdateDao {
	 public int k=0;
	 public int update(AdminBean adminBean) {
		 try {
			 Connection connection = DBconnection.getcon();
			 PreparedStatement preparedStatement = connection.prepareStatement("update adminlogin set USERNAME=?,PASSWORD= ?,FIRSTNAME=?,LASTNAME=?,ADDRESS=?,EMAIL=? where PHONENUMBER= ?");
			 preparedStatement.setString(1, adminBean.getUsername());
			 preparedStatement.setString(2, adminBean.getPassword());
			 preparedStatement.setString(3, adminBean.getFirstname());
			 preparedStatement.setString(4, adminBean.getLastname());
			 preparedStatement.setString(5, adminBean.getAddress());
			 preparedStatement.setString(6, adminBean.getEmail());
			 preparedStatement.setLong(7, adminBean.getPhonenumber());
			  k = preparedStatement.executeUpdate();
			
		} catch (Exception e) {
		e.printStackTrace();
		}
		return k;
		 
		
	}

}
