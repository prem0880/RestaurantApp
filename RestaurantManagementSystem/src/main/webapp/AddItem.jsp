<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.List" %>
    <%@page import="com.rms.dao.ItemTimeDaoImpl" %>
    <%@page import ="com.rms.entity.ItemTime" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Add Food</title>
<style>
form {
 width: 550px;
 height: 450px;
 margin: auto;
 position: relative;
}
</style>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<script>
    if ( window.history.replaceState ) {
        window.history.replaceState( null, null, window.location.href );
    }
</script>
</head>
<body>
<form action="http://localhost:8080/RestaurantManagementSystem/AddItemController" method="post">
  <div class="form-group">
    <label for="foodname">Food Name</label>
    <input type="text" class="form-control" name="name"  placeholder="Enter Food Name" required>
  </div>
  <div class="form-group">
    <label for="foodtype">Food Type</label>
    <select class="form-control" name="type" required>
      <option>Veg</option>
      <option>Non-Veg</option>
    </select>
  </div>
  <div class="form-group">
    <label for="foodcategory">Food Category</label>
    <select class="form-control" name="category" required>
      <option>Starters</option>
      <option>Main Course</option>
      <option>Desserts</option>
      <option>Exotic</option>
    </select>
  </div>
  <div class="form-group">
    <label for="foodprice">Food Price</label>
    <input type="number" class="form-control" name="price" placeholder="Enter Food Price" required>
  </div>
  <div class="form-group">
    <label for="fooddescription">Food Description</label>
  	<textarea class="form-control" name="description" rows="2" required></textarea>
  </div>
  <div class="form-group">
   <label for="foodtimings">Food Timings : </label>
  	<%
  		ItemTimeDaoImpl itd=new ItemTimeDaoImpl();
    	List<ItemTime> lit=itd.viewFoodItemTime();
    		for(ItemTime it:lit){
  	%>
 <span> 	<input type="checkbox" id="<%=it.getId() %>" name="itemTime" value="<%=it.getId()%>">
	<label for="<%=it.getId() %>"><%=it.getTimeOfDay() %> </label>
	<% 
    		}
	%>
	</span>
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>