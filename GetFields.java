package HiddenFormField;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetFields
 */
@WebServlet("/get")
public class GetFields extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetFields() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		String s1=request.getParameter("b1");
		String s2=request.getParameter("b2");
		String s3=request.getParameter("b3");
		pw.println("<html><body bgcolor=yellow text=blue>");
		pw.println("<h1>Selected Books:</h1>");
		if(!(s1.equals("null")))
		{
			pw.println(s1);
		}
		if(!(s2.equals("null")))
		{
		pw.println(s2);
		}
		if(!(s3.equals("null")))
		{
		pw.println(s3);
		}
		pw.println("</body></html>");
		}
	}


