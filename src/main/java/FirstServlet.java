import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.*;

public class FirstServlet extends HttpServlet {
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String name = req.getParameter("name");
        String pass = req.getParameter("pass");
        if (pass.equals("admin123")) {
            out.println("<body style='background-image:linear-gradient(blue,green)'>");
            out.println("<h1 style='text-align:center'>");
            out.println("Country Information Center");
            out.println("</h1>");
            out.println("<br><br><hr><hr>");
            out.println("Hello This Is Tomcat Server With Java Server Pages Is Responsible For The OutComes");
            out.println("<br><hr>");
            out.println("Welcome:" + name);
            out.println("<hr><hr>");
            out.println("Click This Link Then You Can See OutComes Page");
            out.println("<a href='country.jsp' style='color:red'>Country Info</a>");
            out.println("</body>");
        } else {
            out.println("<body style='background-image:linear-gradient(red,yellow);color:white'>");
            out.println("<h1 style='text-align:center'>");
            out.println("Country Information Center");
            out.println("</h1>");
            out.println("<h4><marquee style='background-color:black'>Warning Message Read Carefully</marquee></h4>");
            RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
            rd.include(req, res);
            out.println("<br><br>");
            out.println("<hr><hr>");
            out.println("<h3>Password is not Correct Check Once &");
            out.println("<br><hr>");
            out.println("Try Again Later");
            out.println("<br><hr>");
            out.println("There Is A Limit Of Password Provided to Server");
            out.println("<br><hr>");
            out.println("If You Continuously Three Time Provide Wrong Password Account Block For One Day");
            out.println("</h3><hr><hr>");
            out.println("</body>");

        }
    }
}