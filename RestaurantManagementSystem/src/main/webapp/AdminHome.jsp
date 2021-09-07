<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1" session="true"%>
<!DOCTYPE html>
<html>
<head>

<title>Admin</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  
</head>
<style>
body {
  background-color: #92a8d1;
}
</style>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand">Restaurant Management System</a>
    </div>
   <ul class="nav navbar-nav" >
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#"> Manage Food Items<span class="caret"></span></a>
        <ul class="dropdown-menu">
        <li><a href="http://localhost:8080/RestaurantManagementSystem/AddItem.jsp">Add Food Item</a></li> 
       	 <li><a href="http://localhost:8080/RestaurantManagementSystem/ViewItemController">View Food Items</a></li>
       	 <li><a href="http://localhost:8080/RestaurantManagementSystem/SearchItemByTime.jsp">View Food Items By Timings</a></li>
        <li><a href="http://localhost:8080/RestaurantManagementSystem/VerifyItems.jsp">Update or Delete Food Items</a></li>
        </ul></li>  
    </ul>
    <ul class="nav navbar-nav">
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Manage Food Item Timings<span class="caret"></span></a>
        <ul class="dropdown-menu">
        <li><a href="http://localhost:8080/RestaurantManagementSystem/AddItemTime.jsp">Add Food Item Time</a></li>
       	 <li><a href="http://localhost:8080/RestaurantManagementSystem/ViewItemTimeController">View Food Items Time</a></li>

        </ul></li>  
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href=""><span class="glyphicon glyphicon-user"></span> Log out</a></li>
    </ul>
  </div>
</nav> 
</body>
</html>