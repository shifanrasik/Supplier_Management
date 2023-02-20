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
 * Servlet implementation class ProductStatusServlet
 */
@WebServlet("/ProductStatusServlet")
public class ProductStatusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductStatusServlet() {
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
			
			String pname = request.getParameter("pname");
			String dsupplier = null;
			String dstatus = null;
			
			  
	            // Initialize the database
	            Connection con = ConnectDatabase.initializeDatabase();
	            PreparedStatement ps6;
	            ResultSet rs = null;
	            
	            String sql = "select supplier, status from status where pname=?;";
	            Class.forName("com.mysql.cj.jdbc.Driver");
                
                ps6 = con.prepareStatement(sql);
                ps6.setString(1, pname);
                rs = ps6.executeQuery();
                
//              
                
                
                while (rs.next()) {
                	dsupplier = rs.getString(1);
                	dstatus = rs.getString(2);
                }
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Supplier List</title>");
                
        		out.println("<style>");
        		out.println("ol.progtrckr {\r\n"
        				+ "    margin: 0;\r\n"
        				+ "    padding: 0;\r\n"
        				+ "    list-style-type none;\r\n"
        				+ "}\r\n"
        				+ "\r\n"
        				+ "ol.progtrckr li {\r\n"
        				+ "    display: inline-block;\r\n"
        				+ "    text-align: center;\r\n"
        				+ "    line-height: 3.5em;\r\n"
        				+ "}\r\n"
        				+ "\r\n"
        				+ "ol.progtrckr[data-progtrckr-steps=\"2\"] li { width: 49%; }\r\n"
        				+ "ol.progtrckr[data-progtrckr-steps=\"3\"] li { width: 33%; }\r\n"
        				+ "ol.progtrckr[data-progtrckr-steps=\"4\"] li { width: 24%; }\r\n"
        				+ "ol.progtrckr[data-progtrckr-steps=\"5\"] li { width: 19%; }\r\n"
        				+ "ol.progtrckr[data-progtrckr-steps=\"6\"] li { width: 16%; }\r\n"
        				+ "ol.progtrckr[data-progtrckr-steps=\"7\"] li { width: 14%; }\r\n"
        				+ "ol.progtrckr[data-progtrckr-steps=\"8\"] li { width: 12%; }\r\n"
        				+ "ol.progtrckr[data-progtrckr-steps=\"9\"] li { width: 11%; }\r\n"
        				+ "\r\n"
        				+ "ol.progtrckr li.progtrckr-done {\r\n"
        				+ "    color: black;\r\n"
        				+ "    border-bottom: 4px solid yellowgreen;\r\n"
        				+ "}\r\n"
        				+ "ol.progtrckr li.progtrckr-todo {\r\n"
        				+ "    color: silver; \r\n"
        				+ "    border-bottom: 4px solid silver;\r\n"
        				+ "}\r\n"
        				+ "\r\n"
        				+ "ol.progtrckr li:after {\r\n"
        				+ "    content: \"\\00a0\\00a0\";\r\n"
        				+ "}\r\n"
        				+ "ol.progtrckr li:before {\r\n"
        				+ "    position: relative;\r\n"
        				+ "    bottom: -2.5em;\r\n"
        				+ "    float: left;\r\n"
        				+ "    left: 50%;\r\n"
        				+ "    line-height: 1em;\r\n"
        				+ "}\r\n"
        				+ "ol.progtrckr li.progtrckr-done:before {\r\n"
        				+ "    content: \"\\2713\";\r\n"
        				+ "    color: white;\r\n"
        				+ "    background-color: yellowgreen;\r\n"
        				+ "    height: 2.2em;\r\n"
        				+ "    width: 2.2em;\r\n"
        				+ "    line-height: 2.2em;\r\n"
        				+ "    border: none;\r\n"
        				+ "    border-radius: 2.2em;\r\n"
        				+ "}\r\n"
        				+ "ol.progtrckr li.progtrckr-todo:before {\r\n"
        				+ "    content: \"\\039F\";\r\n"
        				+ "    color: silver;\r\n"
        				+ "    background-color: white;\r\n"
        				+ "    font-size: 2.2em;\r\n"
        				+ "    bottom: -1.2em;\r\n"
        				+ "}\r\n"
        				+ "");
        		out.println("</style>");
        		out.println("</head>");
                out.println("<body>");
                if(dstatus.equals("order processing")){
                	
               out.println("<ol class=\"progtrckr\" data-progtrckr-steps=\"5\">\r\n"
               		+ "    <li class=\"progtrckr-done\">Order Processing</li>\r\n"
               		+ " <li class=\"progtrckr-todo\">Pre-Production</li>\r\n"
               		+ " <li class=\"progtrckr-todo\">In Production</li>\r\n"
               		+ " <li class=\"progtrckr-todo\">Shipped</li>\r\n"
               		+ " <li class=\"progtrckr-todo\">Delivered</li>\r\n"
               		+ "</ol>");
                }
                
              
               
                 if(dstatus.equals("pre-production")) {
                    out.println("<ol class=\"progtrckr\" data-progtrckr-steps=\"5\">\r\n"
                    		+ "    <li class=\"progtrckr-done\">Order Processing</li>\r\n"
                    		+ " <li class=\"progtrckr-done\">Pre-Production</li>\r\n"
                    		+ " <li class=\"progtrckr-todo\">In Production</li>\r\n"
                    		+ " <li class=\"progtrckr-todo\">Shipped</li>\r\n"
                    		+ " <li class=\"progtrckr-todo\">Delivered</li>\r\n"
                    		+ "</ol>");
                     }
                
                 if(dstatus.equals("in production")) {
                    out.println("<ol class=\"progtrckr\" data-progtrckr-steps=\"5\">\r\n"
                    		+ "    <li class=\"progtrckr-done\">Order Processing</li>\r\n"
                    		+ " <li class=\"progtrckr-done\">Pre-Production</li>\r\n"
                    		+ " <li class=\"progtrckr-done\">In Production</li>\r\n"
                    		+ " <li class=\"progtrckr-todo\">Shipped</li>\r\n"
                    		+ " <li class=\"progtrckr-todo\">Delivered</li>\r\n"
                    		+ "</ol>");
                     }
                
                 if(dstatus.equals("shipped")) {
                    out.println("<ol class=\"progtrckr\" data-progtrckr-steps=\"5\">\r\n"
                    		+ "    <li class=\"progtrckr-done\">Order Processing</li>\r\n"
                    		+ " <li class=\"progtrckr-done\">Pre-Production</li>\r\n"
                    		+ " <li class=\"progtrckr-done\">In Production</li>\r\n"
                    		+ " <li class=\"progtrckr-done\">Shipped</li>\r\n"
                    		+ " <li class=\"progtrckr-todo\">Delivered</li>\r\n"
                    		+ "</ol>");
                     }
                
                 if(dstatus.equals("delivered")) {
                    out.println("<ol class=\"progtrckr\" data-progtrckr-steps=\"5\">\r\n"
                    		+ "    <li class=\"progtrckr-done\">Order Processing</li>\r\n"
                    		+ " <li class=\"progtrckr-done\">Pre-Production</li>\r\n"
                    		+ " <li class=\"progtrckr-done\">In Production</li>\r\n"
                    		+ " <li class=\"progtrckr-done\">Shipped</li>\r\n"
                    		+ " <li class=\"progtrckr-done\">Delivered</li>\r\n"
                    		+ "</ol>");
                     }
                
               
        		out.println("</body>");
                out.println("</html>");
                
		}
	        catch (Exception e) { 
	            e.printStackTrace();
	        }
	}

}
