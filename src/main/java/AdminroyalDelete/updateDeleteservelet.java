package AdminroyalDelete;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import AdminLogin.AdminBean;
import RoyalRooms.royalBean;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@SuppressWarnings("serial")
@WebServlet("/updateroyaldelete")
public class updateDeleteservelet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		HttpSession httpSession = request.getSession(false);
		 if (httpSession ==null) {
			 request.setAttribute("msg", "Session Expired..<br>");
			 request.getRequestDispatcher("AdminroyalMsg.jsp").forward(request, response);
			
		} else {
			String email = request.getParameter("name");
		ArrayList<royalBean> arrayList = (ArrayList<royalBean>)httpSession.getAttribute("alist");
		   Iterator<royalBean>it= arrayList.iterator();
		   while (it.hasNext()) {
			   royalBean bean = (royalBean)it.next();
			   if (email.equals(bean.getBookingpersonname())) {
				   request.setAttribute("ubean", bean);
				   request.getRequestDispatcher("updateroyalDeleteDetails.jsp").forward(request, response);
				break;
			}
				
			}
			
		}
			
		}
	}
	


