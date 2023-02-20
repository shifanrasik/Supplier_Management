package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RemoveSupplierServlet
 */
@WebServlet("/RemoveSupplierServlet")
public class RemoveSupplierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemoveSupplierServlet() {
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
		try {
			
			String name = request.getParameter("name");
			

		
		
		 
			  
	            // Initialize the database
	            Connection con = ConnectDatabase.initializeDatabase();
	            PreparedStatement ps2;
	            
	            String sql = "DELETE FROM sup WHERE name=?;";
	            Class.forName("com.mysql.cj.jdbc.Driver");
                
                ps2 = con.prepareStatement(sql);
                ps2.setString(1, name);
                ps2.executeUpdate();

	            
	            
	            // to display the successful result
	            PrintWriter out = response.getWriter();
	            out.println("<html><body><b>Successfully Removed Supplier "+name+"</b></body></html>");
	        }
	        catch (Exception e) { 
	            e.printStackTrace();
	        }
	}

}
