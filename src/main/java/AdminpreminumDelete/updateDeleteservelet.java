package AdminpreminumDelete;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import AdminLogin.AdminBean;
import Premiumrooms.preminumBean;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@SuppressWarnings("serial")
@WebServlet("/preminumupdatedelete")
public class updateDeleteservelet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		HttpSession httpSession = request.getSession(false);
		 if (httpSession ==null) {
			 request.setAttribute("msg", "Session Expired..<br>");
			 request.getRequestDispatcher("AdminMsg.jsp").forward(request, response);
			
		} else {
			String name = request.getParameter("name");
		ArrayList<preminumBean> arrayList = (ArrayList<preminumBean>)httpSession.getAttribute("alist");
		   Iterator<preminumBean>it= arrayList.iterator();
		   while (it.hasNext()) {
			   preminumBean bean = (preminumBean)it.next();
			   if (name.equals(bean.getBookingpersonname())) {
				   request.setAttribute("ubean", bean);
				   request.getRequestDispatcher("updatepreminumDeleteDetails.jsp").forward(request, response);
				break;
			}
				
			}
			
		}
			
		}
	}
	


