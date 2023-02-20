package Servlet;
import model.Supplier;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
  
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Driver;
/**
 * Servlet implementation class SupplierServlet
 */
@WebServlet("/SupplierServlet")
public class SupplierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SupplierServlet() {
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
	            
	            String sql = "insert into sup( name, address, email, pnumber, products) values(?,?,?,?,?)";
	            Class.forName("com.mysql.cj.jdbc.Driver");
                
                ps = con.prepareStatement(sql);
                ps.setString(1, name);
                ps.setString(2, address);
                ps.setString(3, email);
                ps.setString(4,pnumber);
                ps.setString(5,products);
                ps.executeUpdate();

	            
	            
	            // to display the successful result
	            PrintWriter out = response.getWriter();
	            out.println("<html><body><b>New Supplier Added Successfully</b></body></html>");
	        }
	        catch (Exception e) { 
	            e.printStackTrace();
	        }
	    }
	}
	
	


