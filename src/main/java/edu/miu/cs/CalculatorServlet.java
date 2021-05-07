package edu.miu.cs;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet({"/hello", "/results"})
public class CalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<h1>Welcome here</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        if (req.getParameterMap().containsKey("i1") && req.getParameterMap().containsKey("i2") ) {
            if (req.getParameter("i1").length() > 0 && req.getParameter("i2").length() > 0) {
                int i1 = Integer.parseInt(req.getParameter("i1"));
                int i2 = Integer.parseInt(req.getParameter("i2"));
                out.println(i1 +" + "+ i2 +"="+ (i1+i2));
                out.println("<p>");
            }

        }

        if (req.getParameterMap().containsKey("i3") && req.getParameterMap().containsKey("i4")) {
            int i3 = Integer.parseInt(req.getParameter("i3"));
            int i4 = Integer.parseInt(req.getParameter("i4"));
            out.println(i3 +" * "+ i4 +"="+ i3*i4);
        }


        out.println("</p>");
        out.println("</body></html>");



    }
}
