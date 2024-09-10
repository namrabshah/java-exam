package gls.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Edit11
 */
@WebServlet("/Edit11")
public class Edit11 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Edit11() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter();
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		out.println("Edit Book");
		String bid = request.getParameter("bid");
		String bname = request.getParameter("bname");
        String bprice = request.getParameter("bprice");
        out.println(bname);
        out.println("<form action='EditAction' method='POST'>");
        out.print("<table>");  
        out.print("<tr><td></td><td><input type='hidden' name='bid' value='"+bid+"'/></td></tr>");  
        out.print("<tr><td>Book Name:</td><td><input type='text' name='bname' value='"+bname+"'/></td></tr>");  
        out.print("<tr><td>Price:</td><td><input type='text' name='bprice' value='"+bprice+"'/></td></tr>"); 
        out.println("<tr><td></td><td><input type='submit'value='EditBook'></td>");
        out.println("</table></form>");
        
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
}

