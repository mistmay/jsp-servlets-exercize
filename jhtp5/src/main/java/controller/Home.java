package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Home() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"en\">");
		out.println("<head>");
		out.println(" <meta charset=\"UTF-8\">");
		out.println("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
		out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\" />");
		out.println("<title>Home</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<main>");
		out.println("<a href=\"Redirect?page=jsp-get\">Jsp Get</a>");
		out.println("<a href=\"Redirect?page=get\">Get Form</a>");
		out.println("<a href=\"Redirect?page=post\">Post Form</a>");
		out.println("<a href=\"Redirect?page=clock\">Clock Jsp</a>");
		out.println("<a href=\"Redirect?page=include\">Include Jsp</a>");
		out.println("<a href=\"Redirect?page=forward\">Forward</a>");
		out.println("<a href=\"Redirect?page=rotator\">Rotator</a>");
		out.println("</main>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
