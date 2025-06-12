import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;

public class XSSVulnerableServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name"); // Unsanitized input

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Reflects user input directly into HTML — vulnerable to XSS
        out.println("<html><body>");
        out.println("<h2>Welcome, " + name + "!</h2>");
        out.println("</body></html>");
    }
}
