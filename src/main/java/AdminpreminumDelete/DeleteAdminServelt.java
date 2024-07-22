package AdminpreminumDelete;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import AdminDelete.AdminDeleteDao;
import AdminDeluxeDelete.AdmindeluxeDeleteDao;
import AdminLogin.AdminBean;
import DeluxeRoom.DeluxeRoomBean;
import Premiumrooms.preminumBean;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@SuppressWarnings("serial")
@WebServlet("/adminepreminumdelete")
public class DeleteAdminServelt  extends HttpServlet{
	@Override
public  void doPost(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		HttpSession httpSession = request.getSession(false);
		if (httpSession==null) {
			request.setAttribute("msg", "Session Expired  <br>");
			request.getRequestDispatcher("AdminpreminumMsg.jsp").forward(request, response);
			
		} else {
			 ArrayList<preminumBean> arrayList= (ArrayList<preminumBean>)httpSession.getAttribute("alist");
			
			 Long number =Long.parseLong(request.getParameter("phonenumber"));
			 Iterator<preminumBean> iterator = arrayList.iterator();
			 while (iterator.hasNext()) {
				 preminumBean adminBean = iterator.next();
				 if (number.equals(adminBean.getPhonenumber())) {
					 
					 adminBean.setPhonenumber(number);
					 int k = new AdminpreminumDeleteDao().Delete(adminBean);
					 if (k>0) {
						 request.setAttribute("msg", "Update Scessfully completed..<br>");
						
						 request.getRequestDispatcher("AdminpreminumDelete.jsp").forward(request, response);
					}
					break;
				}
				
			}

		}
	
 }
}