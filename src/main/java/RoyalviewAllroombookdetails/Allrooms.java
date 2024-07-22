package RoyalviewAllroombookdetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import DeluxeRoom.DBConnection;
import DeluxeRoom.DeluxeRoomBean;
import Register.Userbean;
import RoyalRooms.royalBean;

public class Allrooms {
	 public ArrayList<royalBean>list= new ArrayList<royalBean>();
	 public ArrayList<royalBean> retrive() {
		 try {
			Connection connection = DBConnection.getcon();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from royalrooms");
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				royalBean bean = new royalBean();
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
