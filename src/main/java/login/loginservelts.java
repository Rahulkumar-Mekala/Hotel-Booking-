package login;
import java.io.IOException;

import Register.Userbean;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/login")
public class loginservelts  extends HttpServlet{
	@Override
public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException, ServletException{
		String email = request.getParameter("email");
		String password= request.getParameter("password");
		Userbean userbean = new LoginDao().Login(email, password);
		  if (userbean== null) {
			  request.setAttribute("Msg", "Invalidate Password");
			  request.getRequestDispatcher("msg.jsp").forward(request, response);;
			
		} else {
			ServletContext servletContext = request.getServletContext();
			servletContext.setAttribute("ubean", userbean);
			Cookie cookie = new Cookie("name",userbean.getUsername());
	response.addCookie(cookie);
	request.getRequestDispatcher("login.jsp").forward(request, response);

		}
          		}
	
}
	

