<%@page import="com.rms.entity.Item"%>
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
 <script>
            $(document).ready(function() {
                $("#search").on("keyup", function() {
                    var value = $(this).val().toLowerCase();
                    $("#food tr").filter(function() {
                        $(this).toggle($(this).text()
                        .toLowerCase().indexOf(value) > -1)
                    });
                });
            });
        </script> 
<title>View Items</title>
</head>
<body>
<input id="search" type="text"  class="form-control"  style="width:200px; margin-left:890px;"  placeholder="Search">
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
  <tbody id="food">
    <%List<Item> item =(List<Item>)request.getAttribute("item");
        for( Item i:item){%>
        <%-- Arranging data in tabular form
        --%>
            <tr >
                <td scope="row"><%=i.getId()%></td>
                <td><%=i.getName()%></td>
                <td><%=i.getType()%></td>
                <td><%=i.getCategory()%></td>
                <td><%=i.getDescription()%></td>
                <td><%=i.getPrice()%></td>     
      
            </tr>
            <%}%>
   </tbody>
</table>
 
</body>
</html>