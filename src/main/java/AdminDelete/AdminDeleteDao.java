package AdminDelete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import AdminLogin.AdminBean;
import AdminLogin.DBconnection;

public class AdminDeleteDao {
	 public int k=0;
	 public int Delete(AdminBean adminBean) {
		 try {
			 Connection connection = DBconnection.getcon();
			 PreparedStatement preparedStatement = connection.prepareStatement("delete from register  where PHONENUMBER= ?");
			 
			 preparedStatement.setLong(1, adminBean.getPhonenumber());
			  k = preparedStatement.executeUpdate();
			
		} catch (Exception e) {
		e.printStackTrace();
		}
		return k;
		 
		
	}
	  
		// TODO Auto-generated method stub
		
}
