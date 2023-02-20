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
 * Servlet implementation class RateSupplierServlet
 */
@WebServlet("/RateSupplierServlet")
public class RateSupplierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RateSupplierServlet() {
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
			
			String sname = request.getParameter("sname");
			int dis = Integer.parseInt(request.getParameter("dis"));
			int dtime = Integer.parseInt(request.getParameter("dtime"));
			int n=0;

			int i=dis/dtime;
			if(i>0 && i<=20) n=1;
			if(i>20 && i<=40) n=2;
			if(i>40 && i<=60) n=3;
			if(i>60 && i<=80) n=4;
			if(i>80) n=5;
		
		 String srate=String.valueOf(n);
			  
	            // Initialize the database
	            Connection con = ConnectDatabase.initializeDatabase();
	            PreparedStatement ps1;
	            
	            String sql = "insert into rating( sname,srate) values(?,?)";
	            Class.forName("com.mysql.cj.jdbc.Driver");
                
                ps1 = con.prepareStatement(sql);
                ps1.setString(1, sname);
                ps1.setString(2, srate);
                ps1.executeUpdate();

	            
	            
	            // to display the successful result
	            PrintWriter out = response.getWriter();
	            if(n==1) {
	            out.println("<html>\r\n"
	            		+ "<head>\r\n"
	            		+ "<!-- Font Awesome Icon Library -->\r\n"
	            		+ "<!-- Referenced from w3school-->\r\n"
	            		+ "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n"
	            		+ "<style>\r\n"
	            		+ ".checked {\r\n"
	            		+ "  color: orange;\r\n"
	            		+ "}\r\n"
	            		+ "</style>\r\n"
	            		+ "</head>\r\n"
	            		+ "<body>\r\n"
	            		+ "<h2>Supplier Rating</h2>\r\n"	            		
	            		+ "<span class=\"fa fa-star checked\"></span>\r\n"
	            		+ "<span class=\"fa fa-star\"></span>\r\n"
	            		+ "<span class=\"fa fa-star\"></span>\r\n"
	            		+ "<span class=\"fa fa-star\"></span>\r\n"
	            		+ "<span class=\"fa fa-star\"></span>\r\n"
	            		+ "</body>\r\n"
	            		+ "</html>");
	            }
	            
	            if(n==2) {
		            out.println("<html>\r\n"
		            		+ "<head>\r\n"
		            		+ "<!-- Font Awesome Icon Library -->\r\n"
		            		+ "<!-- Referenced from w3school-->\r\n"
		            		+ "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n"
		            		+ "<style>\r\n"
		            		+ ".checked {\r\n"
		            		+ "  color: orange;\r\n"
		            		+ "}\r\n"
		            		+ "</style>\r\n"
		            		+ "</head>\r\n"
		            		+ "<body>\r\n"
		            		+ "<h2>Supplier Rating</h2>\r\n"	            		
		            		+ "<span class=\"fa fa-star checked\"></span>\r\n"
		            		+ "<span class=\"fa fa-star checked\"></span>\r\n"
		            		+ "<span class=\"fa fa-star\"></span>\r\n"
		            		+ "<span class=\"fa fa-star\"></span>\r\n"
		            		+ "<span class=\"fa fa-star\"></span>\r\n"
		            		+ "</body>\r\n"
		            		+ "</html>");
		            }
	            
	            if(n==3) {
		            out.println("<html>\r\n"
		            		+ "<head>\r\n"
		            		+ "<!-- Font Awesome Icon Library -->\r\n"
		            		+ "<!-- Referenced from w3school-->\r\n"
		            		+ "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n"
		            		+ "<style>\r\n"
		            		+ ".checked {\r\n"
		            		+ "  color: orange;\r\n"
		            		+ "}\r\n"
		            		+ "</style>\r\n"
		            		+ "</head>\r\n"
		            		+ "<body>\r\n"
		            		+ "<h2>Supplier Rating</h2>\r\n"	            		
		            		+ "<span class=\"fa fa-star checked\"></span>\r\n"
		            		+ "<span class=\"fa fa-star checked\"></span>\r\n"
		            		+ "<span class=\"fa fa-star checked\"></span>\r\n"
		            		+ "<span class=\"fa fa-star\"></span>\r\n"
		            		+ "<span class=\"fa fa-star\"></span>\r\n"
		            		+ "</body>\r\n"
		            		+ "</html>");
		            }
	            
	            if(n==4) {
		            out.println("<html>\r\n"
		            		+ "<head>\r\n"
		            		+ "<!-- Font Awesome Icon Library -->\r\n"
		            		+ "<!-- Referenced from w3school-->\r\n"
		            		+ "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n"
		            		+ "<style>\r\n"
		            		+ ".checked {\r\n"
		            		+ "  color: orange;\r\n"
		            		+ "}\r\n"
		            		+ "</style>\r\n"
		            		+ "</head>\r\n"
		            		+ "<body>\r\n"
		            		+ "<h2>Supplier Rating</h2>\r\n"	            		
		            		+ "<span class=\"fa fa-star checked\"></span>\r\n"
		            		+ "<span class=\"fa fa-star checked\"></span>\r\n"
		            		+ "<span class=\"fa fa-star checked\"></span>\r\n"
		            		+ "<span class=\"fa fa-star checked\"></span>\r\n"
		            		+ "<span class=\"fa fa-star\"></span>\r\n"
		            		+ "</body>\r\n"
		            		+ "</html>");
		            }
	            
	            if(n==5) {
		            out.println("<html>\r\n"
		            		+ "<head>\r\n"
		            		+ "<!-- Font Awesome Icon Library -->\r\n"
		            		+ "<!-- Referenced from w3school-->\r\n"
		            		+ "<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n"
		            		+ "<style>\r\n"
		            		+ ".checked {\r\n"
		            		+ "  color: orange;\r\n"
		            		+ "}\r\n"
		            		+ "</style>\r\n"
		            		+ "</head>\r\n"
		            		+ "<body>\r\n"
		            		+ "<h2>Supplier Rating</h2>\r\n"	            		
		            		+ "<span class=\"fa fa-star checked\"></span>\r\n"
		            		+ "<span class=\"fa fa-star checked\"></span>\r\n"
		            		+ "<span class=\"fa fa-star checked\"></span>\r\n"
		            		+ "<span class=\"fa fa-star checked\"></span>\r\n"
		            		+ "<span class=\"fa fa-star checked\"></span>\r\n"
		            		+ "</body>\r\n"
		            		+ "</html>");
		            }
	        }
	        catch (Exception e) { 
	            e.printStackTrace();
	        }
	}

}
