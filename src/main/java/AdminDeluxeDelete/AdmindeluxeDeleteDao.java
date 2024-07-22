package AdminDeluxeDelete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import AdminLogin.AdminBean;
import AdminLogin.DBconnection;
import DeluxeRoom.DeluxeRoomBean;

public class AdmindeluxeDeleteDao {
	 public int k=0;
	 public int Delete(DeluxeRoomBean deluxeRoomBean) {
		 try {
			 Connection connection = DBconnection.getcon();
			 PreparedStatement preparedStatement = connection.prepareStatement("delete from deluxeroom  where PHONE= ?");
			 
			 preparedStatement.setLong(1, deluxeRoomBean.getPhonenumber());
			  k = preparedStatement.executeUpdate();
			
		} catch (Exception e) {
		e.printStackTrace();
		}
		return k;
		 
		
	}

}
