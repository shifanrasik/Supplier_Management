<!DOCTYPE html>
<html>
<head>
<title>Home Admin</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
html,body,h1,h2,h3,h4,h5 {font-family: "Raleway", sans-serif}
a { text-decoration: none; }


</style>
</head>
<body class="w3-light-grey">

<!-- Top container -->
<div class="w3-bar w3-top w3-black w3-large" style="z-index:4">
  <button class="w3-bar-item w3-button w3-hide-large w3-hover-none w3-hover-text-light-grey" onclick="w3_open();"><i class="fa fa-bars"></i> <span>Welcome </span> <span><%=session.getAttribute("uname") %></span></button>
  <span class="w3-bar-item w3-right">
  <img src="image/fc.png" alt="" width="35" class="logo">
  </span>
</div>




<!-- Overlay effect when opening sidebar on small screens -->
<div class="w3-overlay w3-hide-large w3-animate-opacity" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>

<!-- !PAGE CONTENT! -->
<div class="w3-main" style="margin-left:300px;margin-top:43px;">

  <!-- Header -->
  <header class="w3-container" style="padding-top:22px">
    <h5><b>Supplier Management</b></h5>
  </header>

  <div class="w3-row-padding w3-margin-bottom">
    <div class="w3-quarter">
      <div class="w3-container w3-red w3-padding-16">
      <a href="AddNewSupplier.jsp">
        <div class="w3-left"><i class="fa fa-users fa-fw fa-4x"></i></div>
        
        <div class="w3-clear"></div>
        
        <h4 >Add New Supplier</h4> 
        </a>
      </div>
      
    </div>
    
    <div class="w3-quarter">
      <div class="w3-container w3-blue w3-padding-16">
      <a href="GetSupplier.jsp">
        <div class="w3-left"><i class="fa fa-eye fa-fw fa-4x"></i></div>
        
        <div class="w3-clear"></div>
        <h4>View Supplier</h4>
        </a>
      </div>
    </div>
    <div class="w3-quarter">
      <div class="w3-container w3-teal w3-padding-16">
      <a href="UpdateSupplier.jsp">
        <div class="w3-left"><i class="fa fa-pencil fa-4x" aria-hidden="true" ></i></div>
        
        <div class="w3-clear"></div>
        <h4>Update Supplier</h4>
        </a>
      </div>
    </div>
    <div class="w3-quarter">
      <div class="w3-container w3-orange w3-text-white w3-padding-16">
      <a href="RemoveSupplier.jsp">
        <div class="w3-left"><i class="fa fa-trash fa-4x" aria-hidden="true"></i></div>
       
        <div class="w3-clear"></div>
        <h4 >Remove Supplier</h4>
        </a>
      </div>
    </div>
  </div>   
    </div>
  


  <br>
  
<div class="w3-row-padding w3-margin-bottom">

    <div class="w3-quarter">
      <div class="w3-container w3-green w3-padding-16">
      <a href="RateSuppliers.jsp">
        <div class="w3-left"><i class="fa fa-star fa-4x" aria-hidden="true"></i></div>        
        <div class="w3-clear"></div>
        <h4>Rate Supplier</h4>
        </a>
      </div> 
    </div>
    
    <div class="w3-quarter">
      <div class="w3-container w3-deep-purple w3-padding-16">
      <a href="ProductStatus.jsp">
        <div class="w3-left"><i class="fa fa-truck fa-4x" aria-hidden="true"></i></div>       
        <div class="w3-clear"></div>
        <h4>Track Product</h4>
        </a>
      </div> 
    </div>
    
    
    <div class="w3-quarter">
      <div class="w3-container w3-grey w3-padding-16">
      <a href="SupplierList.jsp">
        <div class="w3-left"><i class="fa fa-list fa-4x" style="color:white;" aria-hidden="true"></i></div>       
        <div class="w3-clear"></div>
        <h4 style="color:white;">View All Supplier</h4>
        </a>
      </div> 
    </div>
    
    
    
    </div>
    
    

<script>
// Get the Sidebar
var mySidebar = document.getElementById("mySidebar");

// Get the DIV with overlay effect
var overlayBg = document.getElementById("myOverlay");

// Toggle between showing and hiding the sidebar, and add overlay effect
function w3_open() {
  if (mySidebar.style.display === 'block') {
    mySidebar.style.display = 'none';
    overlayBg.style.display = "none";
  } else {
    mySidebar.style.display = 'block';
    overlayBg.style.display = "block";
  }
}

// Close the sidebar with the close button
function w3_close() {
  mySidebar.style.display = "none";
  overlayBg.style.display = "none";
}
</script>

</body>
</html>
