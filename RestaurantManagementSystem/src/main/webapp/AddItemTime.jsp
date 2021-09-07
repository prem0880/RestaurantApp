<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Food Time</title>
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
<form action="http://localhost:8080/RestaurantManagementSystem/AddItemTimeController" method="post">
  <div class="form-group">
    <label for="itemtime">Food Item Time</label>
    <select class="form-control" name="itemTime" required>
      <option>Morning</option>
      <option>Afternoon</option>
      <option>Evening</option>
      <option>Night</option>
    </select>
  </div>
  <button type="submit" class="btn btn-primary">Add</button>
</form>
</body>
</html>