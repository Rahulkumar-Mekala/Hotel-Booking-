package AdminDeluxeLogin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import AdminLogin.DBconnection;
import DeluxeRoom.DeluxeRoomBean;

public class AdminLoginDAO {
	public   DeluxeRoomBean DeluxeRoomBean = null;
	public DeluxeRoomBean Login(String name,String phoonenumber) {
		try {
			Connection connection = DBconnection.getcon();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from AllRoomsAdminster where PERSONNAME= ?and phone=?");
			
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, phoonenumber);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				DeluxeRoomBean = new DeluxeRoomBean();
				DeluxeRoomBean.setRoomname(resultSet.getString(1));
				DeluxeRoomBean.setPrice( Double.parseDouble(resultSet.getString(2)));
				DeluxeRoomBean.setBookingpersonname(resultSet.getString(3));
				DeluxeRoomBean.setPhonenumber(Long.parseLong(resultSet.getString(4)));
			
		
			}
		} catch (Exception e) {
				// TODO: handle exception
			e.printStackTrace();
		}
		return DeluxeRoomBean;
	}

}
