import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import static sun.net.www.protocol.http.HttpURLConnection.userAgent;

@WebServlet(name = "BrowserDetector", urlPatterns = "/browser")
public class BrowserDetector extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        String userAgent = request.getHeader("User-Agent");
        String browser = "Unknow browser";
        if (userAgent.contains("Chrome")) {
            browser = "Google Chrome";
        }
        writer.print("<html>");
        writer.println("<h3>Your User-Agent Is: " + userAgent + "</h3>");
        writer.println("<h3>Your Browser Is: " + browser + "</h3>");

        writer.print("User-Agent" + request.getHeader("User-Agent"));
        writer.print("</html>");
    }
}
