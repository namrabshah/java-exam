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
 * Servlet implementation class EditAction
 */
@WebServlet("/EditAction")
public class EditAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditAction() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		String bid= req.getParameter("bid");
		String bname= req.getParameter("bname"); 
		String bprice= req.getParameter("bprice");
    	try
		{
   Class.forName("com.mysql.cj.jdbc.Driver");
   //Connection con= DriverManager.getConnection("jdbc:mysql://128.66.203.247:3306/exam1","exam1","sumo@123");
   String updateSQL = "UPDATE book SET bname=?,bprice=? WHERE bid=?";
   Connection con=DriverManager.getConnection("jdbc:mysql://128.66.203.247:3306/imsc7it76","imsc7it76","sumo@123");
   PreparedStatement pst=  con.prepareStatement(updateSQL);
   pst.setString(1,bid);
   pst.setString(2,bname);
   pst.setString(3,bprice);

   pst.executeUpdate();
   out.println("Book Updated");

   System.out.print("Book Updated");
		}
    	catch(Exception e)
    	{
    		System.out.print(e);
    	}
	
	
	
	
	}

}
