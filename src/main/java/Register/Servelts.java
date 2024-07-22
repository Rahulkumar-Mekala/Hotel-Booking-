package Register;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/register")
public class Servelts extends HttpServlet {
	@Override
	 public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException ,IOException{
		  Userbean bean = new Userbean();
		  bean.setUsername(request.getParameter("username"));
		  bean.setPassword(request.getParameter("Password"));
		  bean.setFristname(request.getParameter("ufname"));
		  bean.setLastname(request.getParameter("ulastname"));
		  bean.setAddress(request.getParameter("Address"));
		  bean.setEmail(request.getParameter("EmailAddress"));
		  bean.setPhone( Long.parseLong(request.getParameter("phone")));
		   int k = new UserBeanDAO().register(bean);
		   if (k>0) {
			   request.setAttribute("msg", " Register is Sucessfully completed...");
			   request.getRequestDispatcher("Register.jsp").forward(request, response);
			
		}
		   
		 
	 }

}
