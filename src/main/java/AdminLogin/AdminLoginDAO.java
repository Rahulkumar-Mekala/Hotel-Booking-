package AdminLogin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminLoginDAO {
	public AdminBean adminBean = null;
	public AdminBean Login(String email,String Password) {
		try {
			Connection connection = DBconnection.getcon();
			PreparedStatement preparedStatement = connection.prepareStatement("select * from adminlogin where email=? and password =?");
			
			preparedStatement.setString(1, email);
			preparedStatement.setString(2, Password);
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				adminBean = new AdminBean();
				adminBean.setUsername(resultSet.getString(1));
				adminBean.setPassword(resultSet.getString(2));
				adminBean.setFirstname(resultSet.getString(3));
				adminBean.setLastname(resultSet.getString(4));
				adminBean.setAddress(resultSet.getString(5));
				adminBean.setEmail(resultSet.getString(6));
				adminBean.setPhonenumber (resultSet.getLong(7));
			}
		} catch (Exception e) {
				// TODO: handle exception
			e.printStackTrace();
		}
		return adminBean;
	}

}
