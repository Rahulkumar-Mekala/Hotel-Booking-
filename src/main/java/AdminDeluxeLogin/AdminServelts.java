package AdminDeluxeLogin;

import java.io.IOException;

import DeluxeRoom.DeluxeRoomBean;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@SuppressWarnings("serial")
@WebServlet("/adminDeluxelogin")
public class AdminServelts extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest  request, HttpServletResponse response) throws ServletException, IOException{
		String EmailAddress = request.getParameter("username");
		String Password = request.getParameter("phonenumber");
	DeluxeRoomBean deluxeRoomBean= new AdminLoginDAO().Login(EmailAddress, Password);
		if (deluxeRoomBean ==null) {
			 request.setAttribute("msg", "Invalidate Login Process..<br>");
			 request.getRequestDispatcher("AdminDeluxeMsg.jsp").forward(request, response);
			 
			
		} else {
           HttpSession httpSession = request.getSession();
           httpSession.setAttribute("abean", deluxeRoomBean);
           request.getRequestDispatcher("AdminDeluxeLogin.jsp").forward(request, response);
		}
	}

}
