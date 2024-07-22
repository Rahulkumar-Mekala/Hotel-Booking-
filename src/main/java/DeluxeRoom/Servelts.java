package DeluxeRoom;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
@WebServlet("/DeluxeRoom")
public class Servelts extends HttpServlet {
	@Override
	 public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		 DeluxeRoomBean bean = new DeluxeRoomBean();
		 bean.setRoomname(request.getParameter("roomtype"));
		 bean.setPrice(Double.parseDouble(request.getParameter("price")));
		 bean.setBookingpersonname(request.getParameter("person"));
		 bean.setPhonenumber(Long.parseLong(request.getParameter("phonenumber")));
		 bean.setCheckin(Date.valueOf(request.getParameter("Checkin")));
		 bean.setCheckout(Date.valueOf(request.getParameter("checkout")));
		    int k = new DeluxeRoomDao().DeluxeRegister(bean);
		     if (k>0) {
		    	 request.setAttribute("msg"," Royal Room Booking Scessfully ");
		    	 request.getRequestDispatcher("RoyalRegister.jsp").forward(request, response);;
				
			}
		     else {
		    	 request.setAttribute("msg", " Deluxe Room Booking Not Scessfully ");
		    	 request.getRequestDispatcher("DeluxeRegister.jsp").forward(request, response);;
					
		     }
		 
	 }

}
