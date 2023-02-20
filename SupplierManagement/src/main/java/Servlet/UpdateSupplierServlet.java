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
 * Servlet implementation class UpdateSupplierServlet
 */
@WebServlet("/UpdateSupplierServlet")
public class UpdateSupplierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateSupplierServlet() {
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
			String address = request.getParameter("address");
			String email = request.getParameter("email");
			String pnumber = request.getParameter("pnumber");
			String products = request.getParameter("products");

		
		
		 
			  
	            // Initialize the database
	            Connection con = ConnectDatabase.initializeDatabase();
	            PreparedStatement ps;
	            
	            String sql = "UPDATE sup SET address=?, email=?, pnumber=?, products=? WHERE name=?;";
	            Class.forName("com.mysql.cj.jdbc.Driver");
                
                ps = con.prepareStatement(sql);
                
                ps.setString(1, address);
                ps.setString(2, email);
                ps.setString(3,pnumber);
                ps.setString(4,products);
                ps.setString(5, name);
                ps.executeUpdate();

	            
	            
	            // to display the successful result
	            PrintWriter out = response.getWriter();
	            out.println("<html><body><b>Successfully Updated</b></body></html>");
	        }
	        catch (Exception e) { 
	            e.printStackTrace();
	        }
	}

}
