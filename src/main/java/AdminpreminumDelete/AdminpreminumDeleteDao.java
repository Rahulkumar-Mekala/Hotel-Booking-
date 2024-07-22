package AdminpreminumDelete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import AdminLogin.AdminBean;
import AdminLogin.DBconnection;
import Premiumrooms.preminumBean;

public class AdminpreminumDeleteDao {
	 public int k=0;
	 public int Delete(preminumBean preminumBean) {
		 try {
			 Connection connection = DBconnection.getcon();
			 PreparedStatement preparedStatement = connection.prepareStatement("delete from preminumrooms where PHONE= ?");
			 
			 preparedStatement.setLong(1, preminumBean.getPhonenumber());
			  k = preparedStatement.executeUpdate();
			
		} catch (Exception e) {
		e.printStackTrace();
		}
		return k;
		 
		
	}

}
