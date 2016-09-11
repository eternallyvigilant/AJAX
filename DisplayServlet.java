

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayServlet
 */
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		DAO d2=new DAO();
		d2.instantiate();
		System.out.println(request.getParameter("comment"));
		Employee r=d2.displayEmployee(Integer.parseInt(request.getParameter("comment")));
		System.out.println(r.getFirstname());
		out.println("<table class='table table-responsive table-bordered table-condensed'>");
		out.println("<thead><tr><th>Emp Id</th><th>Firstname</th><th>Email</th></tr></thead>");
		out.println("<tr><td>"+r.getEmpid()+"</td><td>"+r.getFirstname()+"</td><td>"+r.getEmail()+"</td></tr>");
		out.print("</table>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		
	}

}
