package DeluxeRoom;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeluxeRoomDao {
	 public int k=0;
	 public int DeluxeRegister(DeluxeRoomBean bean) {
		 
		try {
			Connection connection = DBConnection.getcon();
			PreparedStatement preparedStatement = connection.prepareStatement("insert into deluxeroom values(?,?,?,?,?,?)");
			preparedStatement.setString(1, bean.getRoomname());
			preparedStatement.setDouble(2, bean.getPrice());
			preparedStatement.setString(3, bean.getBookingpersonname());
			preparedStatement.setLong(4, bean.getPhonenumber());
			preparedStatement.setObject(5, bean.getCheckin());
			preparedStatement.setObject(6, bean.getCheckout());
			 k = preparedStatement.executeUpdate();
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return k; 
		
	}

}
