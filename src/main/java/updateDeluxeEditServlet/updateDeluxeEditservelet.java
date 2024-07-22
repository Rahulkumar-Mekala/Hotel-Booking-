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
@SuppressWarnings("serial")
@WebServlet("/updatedeluxeedit")
public class updateDeluxeEditservelet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		HttpSession httpSession = request.getSession(false);
		 if (httpSession==null) {
			 request.setAttribute("msg", "Session Expired..<br>");
			 request.getRequestDispatcher("AdminDeluxeMsg.jsp").forward(request, response);
			
		} else {
			  String personname = request.getParameter("name");
		ArrayList<DeluxeRoomBean> arrayList = (ArrayList<DeluxeRoomBean>)httpSession.getAttribute("alist");
		   Iterator<DeluxeRoomBean>it= arrayList.iterator();
		   while (it.hasNext()) {
			   DeluxeRoomBean bean = (DeluxeRoomBean)it.next();
			   if (personname.equals(bean.getBookingpersonname())) {
				   request.setAttribute("ubean", bean);
				   request.getRequestDispatcher("updateDeluxeEditDetails.jsp").forward(request, response);
				break;
			}
				
			}
			
		}
			
		}
	}
	


