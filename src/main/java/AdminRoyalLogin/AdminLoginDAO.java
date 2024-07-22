package AdminRoyalLogin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import AdminLogin.DBconnection;
import DeluxeRoom.DeluxeRoomBean;
import RoyalRooms.royalBean;

public class AdminLoginDAO {
	public   royalBean royalBean = null;
	public royalBean Login(String name,String phoonenumber) {
		try {
			Connection connection = DBconnection.getcon();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from AllRoomsAdminster where PERSONNAME= ?and phone=?");
			
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, phoonenumber);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				royalBean = new royalBean();
				royalBean.setRoomname(resultSet.getString(1));
				royalBean.setPrice( Double.parseDouble(resultSet.getString(2)));
				royalBean.setBookingpersonname(resultSet.getString(3));
				royalBean.setPhonenumber(Long.parseLong(resultSet.getString(4)));
			
		
			}
		} catch (Exception e) {
				// TODO: handle exception
			e.printStackTrace();
		}
		return royalBean;
	}

}
