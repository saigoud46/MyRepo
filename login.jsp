<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.apply{
	text-align: center;
}
</style>
</head>
<body>
<h1>Login</h1>
<div class="apply">
<form action="LoginServlet" method="post">
<label>Email</label>
<input type="email" name="email" ><br><br>
<label>Password:</label>
<input type="password" name="password"><br><br>
<input type="submit" value="login">
</form>
</div>
</body>
</html>