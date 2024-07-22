package updateEditServlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import AdminDelete.AdminDeleteDao;
import AdminLogin.AdminBean;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/adminupdate")
public class UpdateAdminServelt  extends HttpServlet{
	@Override
public  void doPost(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		HttpSession httpSession = request.getSession(false);
		if (httpSession==null) {
			request.setAttribute("msg", "Session Expired  <br>");
			request.getRequestDispatcher("AdminMsg.jsp").forward(request, response);
			
		} else {
			 ArrayList<AdminBean> arrayList= (ArrayList<AdminBean>)httpSession.getAttribute("alist");
			 String username = request.getParameter("username");
			 String password = request.getParameter("password");
			 String firstname = request.getParameter("firstname");
			 String lastname = request.getParameter("lastname");
			 String address = request.getParameter("Address");
			 String Email = request.getParameter("emailAddress");
			 Iterator<AdminBean> iterator = arrayList.iterator();
			 while (iterator.hasNext()) {
				 AdminBean adminBean = iterator.next();
				 if (Email.equals(adminBean.getEmail())) {
					 adminBean.setUsername(username);
					 adminBean.setPassword(password);
					 adminBean.setFirstname(firstname);
					 adminBean.setLastname(lastname);
					 adminBean.setAddress(address);
					 adminBean.setEmail(Email);
					 int k = new AdminUpdateDao().update(adminBean);
					 if (k>0) {
						 request.setAttribute("msg", "Update Scessfully completed..<br>");
						
						 request.getRequestDispatcher("AdminUpdate.jsp").forward(request, response);
					}
					break;
				}
				
			}

		}
	
 }
}
