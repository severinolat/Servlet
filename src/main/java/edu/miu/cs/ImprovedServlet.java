package edu.miu.cs;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet({"/improvedservlet"})
public class ImprovedServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        try {
            out.println("<form method=\"POST\" action='improvedservlet'>");
            if (req.getParameterMap().containsKey("i1") && req.getParameterMap().containsKey("i2") ) {
                if (req.getParameter("i1").length() > 0 && req.getParameter("i2").length() > 0) {
                    int i1 = Integer.parseInt(req.getParameter("i1"));
                    int i2 = Integer.parseInt(req.getParameter("i2"));
                    int r1 = i1 + i2;
                    out.println(" <input name=\"i1\" value="+i1+"> + <input name=\"i2\" value="+i2+"> = <input name=\"sum\" value="+r1+" readonly>");
                    out.println();
                    out.println("<p>");
                } else {
                    out.println(" <input name=\"i1\" > + <input name=\"i2\" > = <input name=\"sum\"  readonly>");
                    out.println();
                    out.println("<p>");
                }

            }

            if (req.getParameterMap().containsKey("i3") && req.getParameterMap().containsKey("i4")) {
                if (req.getParameter("i3").length() > 0 && req.getParameter("i4").length() > 0) {
                    int i3 = Integer.parseInt(req.getParameter("i3"));
                    int i4 = Integer.parseInt(req.getParameter("i4"));
                    int r2 = i3 * i4;
                    out.println(" <input name=\"i3\" value="+i3+"> * <input name=\"i2\" value="+i4+"> = <input name=\"sum\" value="+r2+" readonly>");

                }
                else {
                    out.println(" <input name=\"i1\" > + <input name=\"i2\" > = <input name=\"sum\"  readonly>");
                    out.println();
                    out.println("<p>");
                }
            }

            out.println("<p>");
            out.println("<input type=\"submit\" value=\"Submit\">");
            out.println("</p>");

        }catch(Exception e){

        }
    }
}
