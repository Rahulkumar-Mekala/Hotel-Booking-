package updatepreminumEditServlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import Premiumrooms.preminumBean;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@SuppressWarnings("serial")
@WebServlet("/preminumupdateedit")
public class updateDeluxeEditservelet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		HttpSession httpSession = request.getSession(false);
		 if (httpSession==null) {
			 request.setAttribute("msg", "Session Expired..<br>");
			 request.getRequestDispatcher("AdminpreminumMsg.jsp").forward(request, response);
			
		} else {
			  String personname = request.getParameter("name");
		ArrayList<preminumBean> arrayList = (ArrayList<preminumBean>)httpSession.getAttribute("alist");
		   Iterator<preminumBean>it= arrayList.iterator();
		   while (it.hasNext()) {
			   preminumBean bean = (preminumBean)it.next();
			   if (personname.equals(bean.getBookingpersonname())) {
				   request.setAttribute("ubean", bean);
				   request.getRequestDispatcher("updatepreminumEditDetails.jsp").forward(request, response);
				break;
			}
				
			}
			
		}
			
		}
	}
	


