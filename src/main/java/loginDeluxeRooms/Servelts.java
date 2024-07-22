package loginDeluxeRooms;

import java.io.IOException;

import DeluxeRoom.DeluxeRoomBean;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/deluxlogin")
public class Servelts extends HttpServlet {
	@Override
	 public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		  String username = request.getParameter("username");
		  Long number =  Long.parseLong(request.getParameter("phone"));
		  
		      DeluxeRoomBean roomBean = new DeluxeloginDAo().roomBean(username, number);
		   if (roomBean==null) {
			   request.setAttribute("msg", " The Invalidate Username Or Phonenumber");
			   request.getRequestDispatcher("DeluxeRoommsg.jsp").forward(request, response);
			
		} else {
			ServletContext servletContext = request.getServletContext();
			servletContext.setAttribute("DelBean", roomBean);
			Cookie cookie = new Cookie("fname",roomBean.getBookingpersonname());
			response.addCookie(cookie);
			request.getRequestDispatcher("Deluxeroomlogin.jsp").forward(request, response);

		}
		 
	 }

}
