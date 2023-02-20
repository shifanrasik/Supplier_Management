<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Track Product</title>
<link rel="stylesheet" href="css/DesignSuplier.css">
</head>
<body>
<form action="ProductStatusServlet" method="post">
  <div class="con">
    <h1>Track Product</h1>
    
    <hr>

<label for="text"><b>Product Name</b></label>
    <input type="text" placeholder="Enter product name" name="pname" id="pname" required>
    
    
    <hr>


    <button type="submit" class="rbtn">Track</button>
  </div>
  
  
</form>
</body>
</html>