<html>
<head>
    <title>Lab_3</title>
</head>
<body style="padding-left: 700px;">
<a href="/index">Home</a>
    <br>
<a href="/register">Reg</a>
    <br>
    <form action="/login" method="post">
        <input type="text" name="username" placeholder="Username" value="<%out.println(request.getParameter("username"));%>">
        <br>
        <input type="password" name="password" placeholder="Password" value="<%out.println(request.getParameter("password"));%>">
        <br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
