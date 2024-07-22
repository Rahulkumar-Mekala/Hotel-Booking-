package AdminpreminumLogin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import AdminLogin.DBconnection;
import DeluxeRoom.DeluxeRoomBean;
import Premiumrooms.preminumBean;

public class AdminLoginDAO {
	public   preminumBean preminumBean = null;
	public preminumBean Login(String name,String phoonenumber) {
		try {
			Connection connection = DBconnection.getcon();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from AllRoomsAdminster where PERSONNAME= ?and phone=?");
			
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, phoonenumber);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
			 preminumBean = new preminumBean();
			 preminumBean.setRoomname(resultSet.getString(1));
			 preminumBean.setPrice( Double.parseDouble(resultSet.getString(2)));
			 preminumBean.setBookingpersonname(resultSet.getString(3));
			 preminumBean.setPhonenumber(Long.parseLong(resultSet.getString(4)));
			
		
			}
		} catch (Exception e) {
				// TODO: handle exception
			e.printStackTrace();
		}
		return preminumBean;
	}

}
