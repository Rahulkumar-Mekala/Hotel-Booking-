package PreminumviewAllroombookdetails;

import java.io.IOException;
import java.util.ArrayList;

import DeluxeRoom.DeluxeRoomBean;
import Premiumrooms.preminumBean;
import Register.Userbean;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/AdminpreminumLogin")
public class viewDeluxeAllrooms extends HttpServlet {
	 public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		  HttpSession httpSession = request.getSession(false);
		  if (httpSession ==null) {
			  request.setAttribute("msg", "Session Expired...");
			  request.getRequestDispatcher("adminmsg.jsp").forward(request, response);
			
		} else {
                 ArrayList<preminumBean> list = new Allrooms().retrive();
                 httpSession.setAttribute("alist", list);
                 request.getRequestDispatcher("/ViewpreminumAllRoomsDetals.jsp").forward(request, response);
		}
		 
	 }
	

}
