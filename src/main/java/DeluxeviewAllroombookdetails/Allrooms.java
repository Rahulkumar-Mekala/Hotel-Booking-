package DeluxeviewAllroombookdetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import DeluxeRoom.DBConnection;
import DeluxeRoom.DeluxeRoomBean;
import Register.Userbean;

public class Allrooms {
	 public ArrayList<DeluxeRoomBean>list= new ArrayList<DeluxeRoomBean>();
	 public ArrayList<DeluxeRoomBean> retrive() {
		 try {
			Connection connection = DBConnection.getcon();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from Deluxeroom");
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				DeluxeRoomBean bean = new DeluxeRoomBean();
				bean.setRoomname(resultSet.getString(1));
				bean.setPrice(Double.parseDouble(resultSet. getString(2)));
				bean.setBookingpersonname(resultSet.getString(3));
				bean.setPhonenumber(Long.parseLong(resultSet.getString(4)));
				
				list.add(bean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
		
	}

}
