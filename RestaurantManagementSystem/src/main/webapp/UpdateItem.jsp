<%@page import="com.rms.entity.Item"%>
<%@page import="com.rms.service.ItemServiceImpl"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" session="true"%>
<!DOCTYPE html>
<html>
<head>
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
<title>View Items</title>
</head>
<body>
<%

String s=request.getParameter("FoodId");
Long id=Long.parseLong(s);
ItemServiceImpl itemServiceImpl = new ItemServiceImpl();
List<Item> item = itemServiceImpl.viewFoodItemById(id);
HttpSession session1=request.getSession(true);
session1.setAttribute("id",id);


%>
 <%for( Item i:item){%>
<form action="http://localhost:8080/RestaurantManagementSystem/UpdateItemController" method="post">
  <div class="form-group">
    <label for="foodname">Food Name</label>
    <input type="text" class="form-control" name="name"  value="<%=i.getName()%>">
  </div>
  <div class="form-group">
    <label for="foodtype">Food Type</label>
    <select class="form-control" name="type">
      <option value="<%=i.getType()%>"selected hidden><%=i.getType()%></option>
      <option >Veg</option>
      <option>Non-Veg</option>
    </select>
  </div>
  <div class="form-group">
    <label for="foodcategory">Food Category</label>
    <select class="form-control" name="category">
     <option  value="<%=i.getCategory()%>"selected hidden><%=i.getCategory()%></option>
      <option>Starters</option>
      <option>Main Course</option>
      <option>Desserts</option>
      <option>Exotic</option>
    </select>
  </div>
  <div class="form-group">
    <label for="foodprice">Food Price</label>
    <input type="text" class="form-control" name="price" value="<%=i.getPrice()%>">
  </div>
  <div class="form-group">
    <label for="fooddescription">Food Description</label>
  	<textarea class="form-control" name="description" rows="2"><%=i.getDescription()%></textarea>
  </div>
  <button type="submit" class="btn btn-primary">Update</button>
</form>
 <%}%>
</body>
</html>