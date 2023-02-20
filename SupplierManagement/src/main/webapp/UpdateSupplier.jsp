<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Update Supplier</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/DesignSuplier.css">
</head>
<body>

<form action="UpdateSupplierServlet" method="post">
  <div class="con">
    <h1>Update Supplier</h1>
    
    <hr>

<label for="email"><b>Name</b></label>
    <input type="text" placeholder="Enter Name" name="name" id="name" required>
    
    <label ><b>Address</b></label>
    <input type="text" placeholder="Enter Address" name="address" id="address" required>
    
    <label for="email"><b>Email</b></label><br><br>
    <input type="email" pattern="[^ @]*@[^ @]*" placeholder="Enter Email" name="email" id="email" required>
    <br><br>
    <label ><b>Phone number</b></label><br><br>
    <input type="tel"  pattern="[0][0-9]{9}"  placeholder="Enter Phone number" name="pnumber" id="pnumber" required>
   <br><br>
    <label ><b>Products</b></label>
    <textarea type="text"  name="products" id="products" required>
    </textarea>
    <hr>


    <button type="submit" class="rbtn">Update</button>
  </div>
  
  
</form>

</body>
</html>

</body>
</html>