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
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
			
			String uname = request.getParameter("uname");
			String password = request.getParameter("password");
			String duname=null;
			String dpassword=null;
			  
	            // Initialize the database
	            Connection con = ConnectDatabase.initializeDatabase();
	            PreparedStatement ps;
	            ResultSet rs = null;
	            
	            String sql = "select password from login where uname=?;";
	            Class.forName("com.mysql.cj.jdbc.Driver");
                
                ps = con.prepareStatement(sql);
                ps.setString(1, uname);
                rs = ps.executeQuery();
                
//              
                
                
                while (rs.next()) {
                dpassword = rs.getString(1);
                }
                if (password.equals(dpassword)) {
                	
               	HttpSession session = request.getSession();
               	session.setAttribute("uname", uname);
               	response.sendRedirect("HomeSupplier.jsp");
               	
                	
        
//                     	
                	                                      
                } else {
                	out.println("<!DOCTYPE html>\r\n"
                			+ "<html>\r\n"
                			+ "<head>\r\n"
                			+ "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n"
                			+ "<style>\r\n"
                			+ ".alert {\r\n"
                			+ "  padding: 20px;\r\n"
                			+ "  background-color: #f44336;\r\n"
                			+ "  color: white;\r\n"
                			+ "}\r\n"
                			+ "\r\n"
                			+ ".closebtn {\r\n"
                			+ "  margin-left: 15px;\r\n"
                			+ "  color: white;\r\n"
                			+ "  font-weight: bold;\r\n"
                			+ "  float: right;\r\n"
                			+ "  font-size: 22px;\r\n"
                			+ "  line-height: 20px;\r\n"
                			+ "  cursor: pointer;\r\n"
                			+ "  transition: 0.3s;\r\n"
                			+ "}\r\n"
                			+ "\r\n"
                			+ ".closebtn:hover {\r\n"
                			+ "  color: black;\r\n"
                			+ "}\r\n"
                			+ "</style>\r\n"
                			+ "</head>\r\n"
                			+ "<body>\r\n"
                			+ "\r\n"
                			+ "\r\n"
                			+ "\r\n"
                			+ "<div class=\"alert\">\r\n"
                			+ "  <span class=\"closebtn\" onclick=\"this.parentElement.style.display='none';\">&times;</span> \r\n"
                			+ "  Invalid user name or password.\r\n"
                			+ "</div>\r\n"
                			+ "\r\n"
                			+"<p><a href=\"Login.jsp\">Log In</a></p>"
                			
                			+ "</body>\r\n"
                			+ "</html>");
                
	            // to display the successful result
	            
	        }
		}
	        catch (Exception e) { 
	            e.printStackTrace();
	        }
		
		
	

}
	
	}

