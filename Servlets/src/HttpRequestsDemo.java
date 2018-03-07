import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HttpRequestsDemo extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException
	{
		// Set the response message's MIME type
		response.setContentType("text/html;charset=UTF-8");
		// Allocate a output writer to write the response message into the network socket

		PrintWriter out = response.getWriter();
		// Write the response message, in an HTML page
		try
		{
			out.println("<!DOCTYPE html>");
			out.println("<html><head>");
			out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
			out.println("<title>Hello, World</title></head>");
			out.println("<body>");
			out.println("<h1>Hello, world!</h1>");
			// says Hello
			// Echo client's request information
			out.println("<p>Request URI: " + request.getRequestURI() + "</p>");
			out.println("<p>Protocol: " + request.getProtocol() + "</p>");
			out.println("<p>PathInfo: " + request.getPathInfo() + "</p>");
			out.println("<p>Remote Address: " + request.getRemoteAddr() + "</p>");
			// Generate a random number upon each request
			out.println("<p>A Random Number: <strong>" + Math.random() + "</strong></p>");
			// out.println("<p> Header:<strong>"+request.getHeader() + "</strong></p>");
			out.println("<p> Servlet path:<strong>"+request.getServletPath() + "</strong></p>");
			out.println("<p> QuerySting:<strong>"+request.getQueryString() + "</strong></p>");
			out.println("<p> get path translated:<strong>"+request.getPathTranslated() +
			"</strong></p>");
			out.println("<p> remote user:<strong>"+request.getRemoteUser() + "</strong></p>");
			out.println("</body>");
			out.println("</html>");
		}
		finally { out.close(); /*Always close the output writer*/ }
	}
}