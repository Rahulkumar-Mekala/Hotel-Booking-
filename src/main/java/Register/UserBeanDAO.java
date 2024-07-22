package Register;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserBeanDAO {
	public  int k=0;
	 public int register(Userbean userBean) {
		 try {
			Connection connection = DBconnection.getcon();
			PreparedStatement preparedStatement = connection.prepareStatement("insert into register values(?,?,?,?,?,?,?)");
			preparedStatement.setString(1, userBean.getUsername());
			preparedStatement.setString(2, userBean.getPassword());
			preparedStatement.setString(3, userBean.getFristname());
			preparedStatement.setString(4, userBean.getLastname());
			preparedStatement.setString(5, userBean.getAddress());
			preparedStatement.setString(6, userBean.getEmail());
			preparedStatement.setLong( 7,userBean.getPhone());
			
			k = preparedStatement.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return k;
		
	}

}
