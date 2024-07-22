package updateDeluxeEditServlet;

import java.sql.Connection;
import java.sql.PreparedStatement;

import AdminLogin.DBconnection;
import DeluxeRoom.DeluxeRoomBean;

public class AdminDekuxeUpdateDao {
	 public int k=0;
	 public int update(DeluxeRoom.DeluxeRoomBean deluxeRoomBean) {
		 try {
			 Connection connection = DBconnection.getcon();
			 PreparedStatement preparedStatement = connection.prepareStatement("update deluxeroom set PERSONNAME= ? where PHONE= ?");
			 preparedStatement.setString(1, deluxeRoomBean.getBookingpersonname());
			 preparedStatement.setLong(2, deluxeRoomBean.getPhonenumber());
			  k = preparedStatement.executeUpdate();
			
		} catch (Exception e) {
		e.printStackTrace();
		}
		return k;
		 
		
	}

}
