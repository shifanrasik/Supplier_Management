<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Rate Supplier</title>
<link rel="stylesheet" href="css/DesignSuplier.css">
</head>
<body>

      
      <form action = "RateSupplierServlet" method="post">
  <div class="con">
    <h1>Rate Supplier</h1>
    
    <hr>

<label for="text"><b>Supplier Name:</b></label>
    <input type="text"  name="sname" id="sname" required>
    
<label for="number"><b>Distance(km)</b></label>
    <input type="number"  name="dis" id="dis" required>    
    
<label for="number"><b>Delivery Time(h)</b></label>
    <input type="number"  name="dtime" id="dtime" required>    
    <hr>


    <button type="submit" class="rbtn" >Rate</button>
  </div>
  
  
</form>
</body>
</html>