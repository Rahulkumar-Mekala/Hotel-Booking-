package updateroyalEditServlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import DeluxeRoom.DeluxeRoomBean;
import Premiumrooms.preminumBean;
import RoyalRooms.royalBean;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/adminroyalupdate")
public class UpdateAdminServelt  extends HttpServlet{
	@Override
public  void doPost(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		HttpSession httpSession = request.getSession(false);
		if (httpSession==null) {
			request.setAttribute("msg", "Session Expired  <br>");
			request.getRequestDispatcher("AdminMsg.jsp").forward(request, response);
			
		} else {
			 ArrayList<royalBean> arrayList= (ArrayList<royalBean>)httpSession.getAttribute("alist");
			 String username = request.getParameter("username");
			 Iterator<royalBean> iterator = arrayList.iterator();
			 while (iterator.hasNext()) {
				 royalBean royalBean = iterator.next();
				 if (username.equals(royalBean.getBookingpersonname())) {
					 royalBean.setBookingpersonname(username);
	
					 int k = new AdminDekuxeUpdateDao().update(royalBean);
					 if (k>0) {
						 request.setAttribute("msg", "Update Scessfully completed..<br>");
						
						 request.getRequestDispatcher("AdminroyalUpdate.jsp").forward(request, response);
					}
					break;
				}
				
			}

		}
	
 }
}
