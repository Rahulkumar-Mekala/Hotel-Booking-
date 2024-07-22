package loginpremiumRooms;

import java.io.IOException;

import DeluxeRoom.DeluxeRoomBean;
import Premiumrooms.PreminumDao;
import Premiumrooms.preminumBean;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import loginRoyalRooms.royalloginDAo;

@SuppressWarnings("serial")
@WebServlet("/preminumlogin")
public class Servelts extends HttpServlet {
	@Override
	 public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		  String username = request.getParameter("username");
		  Long number =  Long.parseLong(request.getParameter("phone"));
		  
		     preminumBean roomBean = new loginpremiumRooms.PreminumDao().roomBean(username, number);
		   if (roomBean==null) {
			   request.setAttribute("msg", " The Invalidate Username Or Phonenumber");
			   request.getRequestDispatcher("PreminumRoommsg.jsp").forward(request, response);
			
		} else {
			ServletContext servletContext = request.getServletContext();
			servletContext.setAttribute("preBean", roomBean);
			Cookie cookie = new Cookie("fname",roomBean.getBookingpersonname());
			response.addCookie(cookie);
			request.getRequestDispatcher("preminumroomlogin.jsp").forward(request, response);

		}
		 
	 }

}
