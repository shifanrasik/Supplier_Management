<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

      <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
.checked {
  color: orange;
}
#supplier {
  font-family: Arial, Helvetica, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

#supplier td, #supplier th {
  border: 1px solid #ddd;
  padding: 8px;
}

#supplier tr:nth-child(even){background-color: #f2f2f2;}

#supplier tr:hover {background-color: #ddd;}

#supplier th {
  padding-top: 12px;
  padding-bottom: 12px;
  text-align: left;
  background-color: #04AA6D;
  color: white;
}
</style>

<title>Supplier List</title>
</head>
<body>
<%
try
{
       
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();                      
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supplierdb","root","Mshifan123@");
        String sql = "select s.name, s.address, s.email, s.pnumber, s.products, r.srate from sup s, rating r where s.name=r.sname;";
        PreparedStatement stmt = con.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        if(rs.next()==false)
        {
            out.println("No Records in the table");
        }
        else
        {%>
       
        <table border="1" id="supplier">
        <tr>
        <th>Name</th>
        <th>Address</th>
        <th>Email</th>
        <th>Phone Number</th>
        <th>Products</th>
        <th>Rating</th>
        </tr>
        <%
            do
            {%>
           
            <tr>
            <td><%= rs.getString(1)%></td>
            <td><%= rs.getString(2)%></td>
            <td><%= rs.getString(3)%></td>
            <td><%= rs.getString(4)%></td>
            <td><%= rs.getString(5)%></td>
            <%int i= Integer.parseInt(rs.getString(6));%>
            
            <%if(i==1){ %>
            <td>            
            <span class="fa fa-star checked"></span>
            <span class="fa fa-star"></span>
            <span class="fa fa-star"></span>
            <span class="fa fa-star"></span>
            <span class="fa fa-star"></span>            
            </td>
            <%} %>
            
            <%if(i==2){ %>
            <td>            
            <span class="fa fa-star checked"></span>
            <span class="fa fa-star checked"></span>
            <span class="fa fa-star"></span>
            <span class="fa fa-star"></span>
            <span class="fa fa-star"></span>            
            </td>
            <%} %>
            
            <%if(i==3){ %>
            <td>            
            <span class="fa fa-star checked"></span>
            <span class="fa fa-star checked"></span>
            <span class="fa fa-star checked"></span>
            <span class="fa fa-star"></span>
            <span class="fa fa-star"></span>            
            </td>
            <%} %>
            
            <%if(i==4){ %>
            <td>            
            <span class="fa fa-star checked"></span>
            <span class="fa fa-star checked"></span>
            <span class="fa fa-star checked"></span>
            <span class="fa fa-star checked"></span>
            <span class="fa fa-star"></span>            
            </td>
            <%} %>
            
            <%if(i==5){ %>
            <td>            
            <span class="fa fa-star checked"></span>
            <span class="fa fa-star checked"></span>
            <span class="fa fa-star checked"></span>
            <span class="fa fa-star checked"></span>
            <span class="fa fa-star checked"></span>            
            </td>
            <%} %>
            
            </tr>
           
            <%}while(rs.next());
        }
       
}
catch (Exception e) { 
    e.printStackTrace();
}
%>
</table>
</body>
</html>