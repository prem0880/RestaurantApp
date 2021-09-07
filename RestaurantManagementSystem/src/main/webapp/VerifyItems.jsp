<%@page import="com.rms.entity.Item"%>
<%@page import="com.rms.service.ItemServiceImpl"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>View Items</title>
</head>
<body>
<%


ItemServiceImpl itemServiceImpl = new ItemServiceImpl();
List<Item> item = itemServiceImpl.viewFoodItem();



%>
<table class="table">
  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Name</th>
      <th scope="col">Type</th>
      <th scope="col">Category</th>
      <th scope="col">Description</th>
      <th scope="col">Price</th>
    </tr>
  </thead>
  <tbody>
    
        <%for( Item i:item){%>
        
            <tr>
                <td scope="row"><%=i.getId()%></td>
                <td><%=i.getName()%></td>
                <td><%=i.getType()%></td>
                <td><%=i.getCategory()%></td>
                <td><%=i.getDescription()%></td>
                <td><%=i.getPrice()%></td>     
                <td><a href="UpdateItem.jsp?FoodId=<%=i.getId()%>" class="btn btn-info" >update</a></td>
                <td><a href="DeleteItemController?FoodId=<%=i.getId()%>" class="btn btn-danger" >delete</a></td> 
            </tr>
            <%}%>
   </tbody>
</table>
</body>
</html>