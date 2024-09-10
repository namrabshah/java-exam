package gls.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Book11
 */
@WebServlet("/Book11")
public class Book11 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Book11() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		
		PrintWriter out=response.getWriter();
	String bid=request.getParameter("bid");
//		String bname=request.getParameter("bname");
//		String bprice=request.getParameter("bprice");
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://128.66.203.247:3306/imsc7it76","imsc7it76","sumo@123");
			PreparedStatement pst=con.prepareStatement("select *from book1 where bid=?");
		pst.setString(1, bid);
			ResultSet rs=pst.executeQuery();
			
			while(rs.next())
			{

				String bid1=rs.getString(1);
				String bname1=rs.getString(2);
				String bprice11=rs.getString(3);

				out.println("<html>");
				out.println("<body>");
				out.println("<h1>"+"book id:"+bid1+"</h1>");
				out.println("<h1>"+"book name:"+bname1+"</h1>");
				out.println("<h1>"+"book price:"+bprice11+"</h1>");
		
				out.println("</body>");
				out.println("</html>");
			}
			
			
			
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
