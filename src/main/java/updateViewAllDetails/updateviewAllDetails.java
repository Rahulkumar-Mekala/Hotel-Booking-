package updateViewAllDetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import AdminLogin.AdminBean;
import AdminLogin.DBconnection;
import jakarta.servlet.RequestDispatcher;

public class updateviewAllDetails {
 public ArrayList<AdminBean>adminBeans = new ArrayList<AdminBean>();
  public ArrayList<AdminBean>retrieve(){
	  
	  try {
		  Connection connection = DBconnection.getcon();
		  PreparedStatement preparedStatement = connection.prepareStatement("select * from register");
		  ResultSet resultSet = preparedStatement.executeQuery();
		   while (resultSet.next()) {
			   AdminBean bean = new AdminBean();
			  bean.setUsername(resultSet.getString(1));
			  bean.setPassword(resultSet.getString(2));
			  bean.setFirstname(resultSet.getString(3));
			  bean.setLastname(resultSet.getString(4));
			  bean.setAddress(resultSet.getString(5));
			  bean.setEmail(resultSet.getString(6));
			  bean.setPhonenumber(resultSet.getLong(7));
			  adminBeans.add(bean);
			
		}
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	return adminBeans;
  }
}
