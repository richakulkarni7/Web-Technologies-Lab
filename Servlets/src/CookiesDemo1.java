import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class CookiesDemo1 extends HttpServlet
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
	{
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		Cookie cookie = new Cookie("hyd","cbit");
		cookie.setMaxAge(60*60); //1 hour
		response.addCookie(cookie);
		pw.println("Cookies created");
	}
}