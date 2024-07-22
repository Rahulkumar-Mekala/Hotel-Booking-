package AdminroyalDelete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import AdminLogin.AdminBean;
import AdminLogin.DBconnection;
import RoyalRooms.royalBean;

public class AdminroyalDeleteDao {
	 public int k=0;
	 public int Delete(royalBean royalBean) {
		 try {
			 Connection connection = DBconnection.getcon();
			 PreparedStatement preparedStatement = connection.prepareStatement("delete from royalrooms  where PHONE= ?");
			 
			 preparedStatement.setLong(1, royalBean.getPhonenumber());
			  k = preparedStatement.executeUpdate();
			
		} catch (Exception e) {
		e.printStackTrace();
		}
		return k;
		 
		
	}

}
