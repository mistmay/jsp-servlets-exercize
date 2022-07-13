package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/WelcomeServlet2")
public class WelcomeServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public WelcomeServlet2() {
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
		out.println("<title>Test Get</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<main>");
		out.println("<form action=\"/jhtp5/Welcome2\" method=\"get\">");
		out.println("<input type=\"text\" name=\"firstname\" placeholder=\"Inserisci il tuo Nome\" required>");
		out.println("<button type=\"submit\">Send</button>");
		out.println("</form>");
		out.println("</main>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

}
