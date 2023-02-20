package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetSupplierServlet
 */
@WebServlet("/GetSupplierServlet")
public class GetSupplierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetSupplierServlet() {
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
		PrintWriter out = response.getWriter();
		try {
			
			String name = request.getParameter("name");
			
			String dname=null;
			String daddress=null;
			String demail=null;
			String dpnumber=null;
			String dproducts=null;
			String drate=null;
			int i=0;
			
			  
	            // Initialize the database
	            Connection con = ConnectDatabase.initializeDatabase();
	            PreparedStatement ps;
	            ResultSet rs = null;
	            
	            String sql = "select s.name, s.address, s.email, s.pnumber, s.products, r.srate from sup s, rating r where s.name=? and s.name=r.sname;";
	            Class.forName("com.mysql.cj.jdbc.Driver");
                
                ps = con.prepareStatement(sql);
                ps.setString(1, name);
                rs = ps.executeQuery();
                
//              
                
                
                while (rs.next()) {
                	 dname=rs.getString(1);
        			 daddress=rs.getString(2);
        			 demail=rs.getString(3);
        			 dpnumber=rs.getString(4);
        			 dproducts=rs.getString(5);
        			 drate=rs.getString(6);
                
                }
                i=Integer.parseInt(drate);
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Supplier List</title>");
                
                out.println("<!-- Font Awesome Icon Library -->\r\n"
        		+ "<!-- Referenced from w3school-->\r\n"
        		+ "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n"
        		+ "<style>\r\n"
        		+ ".checked {\r\n"
        		+ "  color: orange;\r\n"
        		+ "}\r\n");
                out.println("#supplier {\r\n"
                		+ "  font-family: Arial, Helvetica, sans-serif;\r\n"
                		+ "  border-collapse: collapse;\r\n"
                		+ "  width: 100%;\r\n"
                		+ "}\r\n"
                		+ "\r\n"
                		+ "#supplier td, #supplier th {\r\n"
                		+ "  border: 1px solid #ddd;\r\n"
                		+ "  padding: 8px;\r\n"
                		+ "}\r\n"
                		+ "\r\n"
                		+ "#supplier tr:nth-child(even){background-color: #f2f2f2;}\r\n"
                		+ "\r\n"
                		+ "#supplier tr:hover {background-color: #ddd;}\r\n"
                		+ "\r\n"
                		+ "#supplier th {\r\n"
                		+ "  padding-top: 12px;\r\n"
                		+ "  padding-bottom: 12px;\r\n"
                		+ "  text-align: left;\r\n"
                		+ "  background-color: #04AA6D;\r\n"
                		+ "  color: white;\r\n"
                		+ "}");
        		out.println("</style>\r\n");
                
                out.println("</head>");
                out.println("<body>");
                out.println("<table id=\"supplier\">");
                out.println("<tr>");
        		out.println("<th>Name</th>");
        		out.println("<th>Address</th>");
        		out.println("<th>Email</th>");
        		out.println("<th>Phone Number</th>");
        		out.println("<th>Products</th>");
        		out.println("<th>Rating</th>");
        		out.println("</tr>");
                out.println("<tr>");
        		out.println("<td>"+dname+"</td>");
        		out.println("<td>"+daddress+"</td>");
        		out.println("<td>"+demail+"</td>");
        		out.println("<td>"+dpnumber+"</td>");
        		out.println("<td>"+dproducts+"</td>");
        		
        		out.println("<td>");
        		if(i==1) {
    	            out.println("<span class=\"fa fa-star checked\"></span>\r\n"
    	            		+ "<span class=\"fa fa-star\"></span>\r\n"
    	            		+ "<span class=\"fa fa-star\"></span>\r\n"
    	            		+ "<span class=\"fa fa-star\"></span>\r\n"
    	            		+ "<span class=\"fa fa-star\"></span>\r\n"
    	            		);
    	            }
        		if(i==2) {
    	            out.println("<span class=\"fa fa-star checked\"></span>\r\n"
    	            		+ "<span class=\"fa fa-star checked\"></span>\r\n"
    	            		+ "<span class=\"fa fa-star\"></span>\r\n"
    	            		+ "<span class=\"fa fa-star\"></span>\r\n"
    	            		+ "<span class=\"fa fa-star\"></span>\r\n"
    	            		);
    	            }
        		if(i==3) {
    	            out.println("<span class=\"fa fa-star checked\"></span>\r\n"
    	            		+ "<span class=\"fa fa-star checked\"></span>\r\n"
    	            		+ "<span class=\"fa fa-star checked\"></span>\r\n"
    	            		+ "<span class=\"fa fa-star\"></span>\r\n"
    	            		+ "<span class=\"fa fa-star\"></span>\r\n"
    	            		);
    	            }
        		if(i==4) {
    	            out.println("<span class=\"fa fa-star checked\"></span>\r\n"
    	            		+ "<span class=\"fa fa-star checked\"></span>\r\n"
    	            		+ "<span class=\"fa fa-star checked\"></span>\r\n"
    	            		+ "<span class=\"fa fa-star checked\"></span>\r\n"
    	            		+ "<span class=\"fa fa-star\"></span>\r\n"
    	            		);
    	            }
        		if(i==5) {
    	            out.println("<span class=\"fa fa-star checked\"></span>\r\n"
    	            		+ "<span class=\"fa fa-star checked\"></span>\r\n"
    	            		+ "<span class=\"fa fa-star checked\"></span>\r\n"
    	            		+ "<span class=\"fa fa-star checked\"></span>\r\n"
    	            		+ "<span class=\"fa fa-star checked\"></span>\r\n"
    	            		);
    	            }
        		out.println("</td>");
        		out.println("</tr>");                      		
                out.println("</table>");
                out.println("</body>");
                out.println("</html>");
                
	            // to display the successful result
	            
	        
		}
	        catch (Exception e) { 
	            e.printStackTrace();
	        }
	}

}
