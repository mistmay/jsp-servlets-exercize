package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Welcome3")
public class Welcome3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Welcome3() {
        super();
    }
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstname");
		if (firstName == null) {
			firstName = "No name";
		}
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html lang=\"en\">");
		out.println("<head>");
		out.println(" <meta charset=\"UTF-8\">");
		out.println("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
		out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no\" />");
		out.println("<title>Name Post</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<main>");
		out.println("<h1>" + firstName + "</h1>");
		out.println("</main>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
