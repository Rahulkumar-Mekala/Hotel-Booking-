package AdminpreminumLogoutServelts;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/AdminpreminumLogout")
public class AdminpreminumLogoutServelts extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
		 
		HttpSession httpSession = request.getSession(false);
		if (httpSession==null) {
			request.setAttribute("msg","Session Expires..<br>");
			
		} else {
        httpSession.removeAttribute("abean");
        httpSession.invalidate();
        request.setAttribute("msg", "LoggedOut Successfully ...<br>");
		}
		request.getRequestDispatcher("AdminpreminumMsg.jsp").forward(request, response);
	}

}
