package preminumViewprofile;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@SuppressWarnings("serial")
@WebServlet("/preminumview")
public class profileservelts extends HttpServlet {
		public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
			Cookie[] cookies = request.getCookies();
			 if (cookies==null) {
				  request.setAttribute("Roommsg"," session Expried");
				  request.getRequestDispatcher("msg").forward(request, response);
				
			} else {
				String value = cookies[0].getValue();
				 request.setAttribute("fname", value);
				 request.getRequestDispatcher("profilebookingdetails.jsp").forward(request, response);

			}
			
		}

	}


