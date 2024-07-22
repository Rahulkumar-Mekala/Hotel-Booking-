package updatepreminumEditServlet;

import java.sql.Connection;
import java.sql.PreparedStatement;

import AdminLogin.DBconnection;
import DeluxeRoom.DeluxeRoomBean;
import Premiumrooms.preminumBean;

public class AdminDekuxeUpdateDao {
	 public int k=0;
	 public int update(preminumBean preminumBean) {
		 try {
			 Connection connection = DBconnection.getcon();
			 PreparedStatement preparedStatement = connection.prepareStatement("select * from preminumrooms where ROOMBOOKINGPERSIONNAME= ? and PHONE = ?");
			 preparedStatement.setString(1, preminumBean.getBookingpersonname());
			 preparedStatement.setLong(2, preminumBean.getPhonenumber());
			  k = preparedStatement.executeUpdate();
			
		} catch (Exception e) {
		e.printStackTrace();
		}
		return k;
		 
		
	}

}
