package test;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PythagorasServlet
 */
@WebServlet("/PythagorasServlet")
public class PythagorasServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public PythagorasServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");

        String str1 = request.getParameter("a");
        double a = Double.parseDouble(str1);
        String str2 = request.getParameter("b");
        double b = Double.parseDouble(str2);

        request.setAttribute("a", a);
        request.setAttribute("b", b);

        double c = (a * a) + (b * b) ;
        double d = Math.sqrt(c);

        request.setAttribute("d", d);

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/calc_c.jsp");
        rd.forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }

}
