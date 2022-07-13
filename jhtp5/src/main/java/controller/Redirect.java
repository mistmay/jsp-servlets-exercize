package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Redirect")
public class Redirect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Redirect() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String location = request.getParameter("page");
		if (location != null) {
			if (location.equals("get")) {
				response.sendRedirect("WelcomeServlet2");
			} else if (location.equals("post")) {
				response.sendRedirect("WelcomeServlet3");
			} else if (location.equals("clock")) {
				response.sendRedirect("Clock.jsp");
			} else if (location.equals("jsp-get")) {
				response.sendRedirect("Welcome.jsp");
			} else if (location.equals("include")) {
				response.sendRedirect("Include.jsp");
			} else if (location.equals("forward")) {
				response.sendRedirect("Forward1.jsp");
			} else if (location.equals("rotator")) {
				response.sendRedirect("Adrotator.jsp");
			}
		} else {
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<!DOCTYPE html>");
			out.println("<html lang=\"en\">");
			out.println("<head>");
			out.println(" <meta charset=\"UTF-8\">");
			out.println("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
			out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\" />");
			out.println("<title>Invalid Page</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<main>");
			out.println("<h1>Invalid Page Request</h1>");
			out.println("<a href=\"Home\">Return to Home</a>");
			out.println("</main>");
			out.println("</body>");
			out.println("</html>");
			out.close();
		}
	}

}
