<%@page import="com.rms.entity.ItemTime"%>
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
<table class="table">
  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Time Of Day</th>
      
    </tr>
  </thead>
  <tbody>
    <%List<ItemTime> item =(List<ItemTime>)request.getAttribute("item");
        for( ItemTime i:item){%>
            <tr >
                <td><%=i.getId()%></td>
                <td><%=i.getTimeOfDay()%></td>
            </tr>
            <%}%>
   </tbody>
</table>
 
</body>
</html>