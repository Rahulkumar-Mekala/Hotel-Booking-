package loginpremiumRooms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DeluxeRoom.DeluxeRoomBean;
import Premiumrooms.preminumBean;

public class PreminumDao {
	public preminumBean bean= null;
	public preminumBean roomBean(String username,long number) {
		try {
			Connection connection = DBConnection.getcon();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from preminumrooms where ROOMBOOKINGPERSIONNAME= ? and phone =?");
			preparedStatement.setString(1, username);
			preparedStatement.setLong(2, number);
			ResultSet executeQuery = preparedStatement.executeQuery();
			if (executeQuery.next()) {
				bean = new preminumBean();
				bean.setRoomname(executeQuery.getString(1));
				bean.setPrice(executeQuery.getDouble(2));
				bean.setBookingpersonname(executeQuery.getString(3));
				bean.setPhonenumber(executeQuery.getLong(4));
				bean.setCheckin(executeQuery.getDate(5));
				bean.setCheckout(executeQuery.getDate(6));
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bean;
	}

}
