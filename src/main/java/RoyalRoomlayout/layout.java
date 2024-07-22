package RoyalRoomlayout;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/RoyalBookingDetailsLayout")
public class layout  extends HttpServlet{
	 public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		 Cookie[] cookies = request.getCookies();
		 if (cookies==null) {
			 request.setAttribute("RoyalRoommsg.jsp", "Seasion Expried...");
					
		} else {
         cookies[0].setMaxAge(0);
         response.addCookie(cookies[0]);
         request.setAttribute("msg", "UserLogout");
		}
		 request.getRequestDispatcher("RoyalRoommsg.jsp").forward(request, response);
			
	 }

}
