package AdminpreminumLogin;

import java.io.IOException;

import DeluxeRoom.DeluxeRoomBean;
import Premiumrooms.preminumBean;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@SuppressWarnings("serial")
@WebServlet("/adminpreminumlogin")
public class AdminServelts extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest  request, HttpServletResponse response) throws ServletException, IOException{
		String username = request.getParameter("username");
		String phonenumber = request.getParameter("phonenumber");
preminumBean preminumBean = new AdminLoginDAO().Login(username, phonenumber);
if (preminumBean ==null) {
	 request.setAttribute("msg", "Invalidate Login Process..<br>");
	 request.getRequestDispatcher("AdminpreminumMsg.jsp").forward(request, response);
	 
	
} else {
  HttpSession httpSession = request.getSession();
  httpSession.setAttribute("abean", preminumBean);
  request.getRequestDispatcher("AdminpreminumLogin.jsp").forward(request, response);
}
}

}
