package updateDeluxeEditServlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import DeluxeRoom.DeluxeRoomBean;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/adminDeluxeupdate")
public class UpdateAdminServelt  extends HttpServlet{
	@Override
public  void doPost(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		HttpSession httpSession = request.getSession(false);
		if (httpSession==null) {
			request.setAttribute("msg", "Session Expired  <br>");
			request.getRequestDispatcher("AdminMsg.jsp").forward(request, response);
			
		} else {
			 ArrayList<DeluxeRoomBean> arrayList= (ArrayList<DeluxeRoomBean>)httpSession.getAttribute("alist");
			 String username = request.getParameter("username");
			 Iterator<DeluxeRoomBean> iterator = arrayList.iterator();
			 while (iterator.hasNext()) {
				 DeluxeRoomBean deluxeRoomBean = iterator.next();
				 if (username.equals(deluxeRoomBean.getBookingpersonname())) {
					 deluxeRoomBean.setBookingpersonname(username);
	
					 int k = new AdminDekuxeUpdateDao().update(deluxeRoomBean);
					 if (k>0) {
						 request.setAttribute("msg", "Update Scessfully completed..<br>");
						
						 request.getRequestDispatcher("AdminDeluxeUpdate.jsp").forward(request, response);
					}
					break;
				}
				
			}

		}
	
 }
}
