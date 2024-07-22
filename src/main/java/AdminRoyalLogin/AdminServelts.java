package AdminRoyalLogin;

import java.io.IOException;

import DeluxeRoom.DeluxeRoomBean;
import RoyalRooms.royalBean;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@SuppressWarnings("serial")
@WebServlet("/adminroallogin")
public class AdminServelts extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest  request, HttpServletResponse response) throws ServletException, IOException{
		String EmailAddress = request.getParameter("username");
		String Password = request.getParameter("phonenumber");
 royalBean royalBean = new AdminLoginDAO().Login(EmailAddress, Password);
		if (royalBean ==null) {
			 request.setAttribute("msg", "Invalidate Login Process..<br>");
			 request.getRequestDispatcher("AdminroyalMsg.jsp").forward(request, response);
			 
			
		} else {
           HttpSession httpSession = request.getSession();
           httpSession.setAttribute("abean", royalBean);
           request.getRequestDispatcher("AdminRoyalLogin.jsp").forward(request, response);
		}
	}

}
