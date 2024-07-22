package loginRoyalRooms;

import java.io.IOException;

import DeluxeRoom.DeluxeRoomBean;
import RoyalRooms.royalBean;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/royallogin")
public class Servelts extends HttpServlet {
	@Override
	 public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		  String username = request.getParameter("username");
		  Long number =  Long.parseLong(request.getParameter("phone"));
		  
		      royalBean roomBean = new royalloginDAo().roomBean(username, number);
		   if (roomBean==null) {
			   request.setAttribute("msg", " The Invalidate Username Or Phonenumber");
			   request.getRequestDispatcher("RoyalRoommsg.jsp").forward(request, response);
			
		} else {
			ServletContext servletContext = request.getServletContext();
			servletContext.setAttribute("royalBean", roomBean);
			Cookie cookie = new Cookie("fname",roomBean.getBookingpersonname());
			response.addCookie(cookie);
			request.getRequestDispatcher("royalroomlogin.jsp").forward(request, response);

		}
		 
	 }

}
