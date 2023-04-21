package HiddenFormField;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SetField
 */
@WebServlet("/set")
public class SetField extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SetField() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s1=request.getParameter("book1");
		String s2=request.getParameter("book2");
		String s3=request.getParameter("book3");
		PrintWriter pw=response.getWriter();
		pw.println("<html><body bgcolor=cyan text=red>");
		pw.println("<h1>Your Books Are Added To Cart</h1>");
		pw.println("<form action=get>");
		pw.println("<input type=hidden name=b1 value="+s1+">");
		pw.println("<input type=hidden name=b2 value="+s2+">");
		pw.println("<input type=hidden name=b3 value="+s3+">");
		pw.println("<input type=submit value=Next>");
		pw.println("</form></body></html>");
	}

}
