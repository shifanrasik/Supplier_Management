<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Get Supplier Details</title>
<link rel="stylesheet" href="css/DesignSuplier.css">
</head>
<body>
<form action="GetSupplierServlet" method="post">
  <div class="con">
    <h1>Get Supplier Details</h1>
    
    <hr>

<label for="text"><b>User name</b></label>
    <input type="text" placeholder="Enter user name" name="name" id="name" required>
    
    <hr>


    <button type="submit" class="rbtn">Get</button>
  </div>
  
  
</form>
</body>
</html>