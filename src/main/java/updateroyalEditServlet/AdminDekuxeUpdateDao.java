package updateroyalEditServlet;

import java.sql.Connection;
import java.sql.PreparedStatement;

import AdminLogin.DBconnection;
import DeluxeRoom.DeluxeRoomBean;
import Premiumrooms.preminumBean;
import RoyalRooms.royalBean;

public class AdminDekuxeUpdateDao {
	 public int k=0;
	 public int update(royalBean royalBean) {
		 try {
			 Connection connection = DBconnection.getcon();
			 PreparedStatement preparedStatement = connection.prepareStatement("select * from royalrooms where ROOMBOOKINGPERSIONNAME= ? and PHONE = ?");
			 preparedStatement.setString(1, royalBean.getBookingpersonname());
			 preparedStatement.setLong(2, royalBean.getPhonenumber());
			  k = preparedStatement.executeUpdate();
			
		} catch (Exception e) {
		e.printStackTrace();
		}
		return k;
		 
		
	}

}
