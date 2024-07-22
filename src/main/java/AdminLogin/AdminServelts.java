package AdminLogin;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@SuppressWarnings("serial")
@WebServlet("/adminlogin")
public class AdminServelts extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest  request, HttpServletResponse response) throws ServletException, IOException{
		String EmailAddress = request.getParameter("email");
		String Password = request.getParameter("password");
		AdminBean adminBean = new AdminLoginDAO().Login(EmailAddress, Password);
		if (adminBean ==null) {
			 request.setAttribute("msg", "Invalidate Login Process..<br>");
			 request.getRequestDispatcher("AdminMsg.jsp").forward(request, response);
			 
			
		} else {
           HttpSession httpSession = request.getSession();
           httpSession.setAttribute("abean", adminBean);
           request.getRequestDispatcher("AdminLogin.jsp").forward(request, response);
		}
	}

}
