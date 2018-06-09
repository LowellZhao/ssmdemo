<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div>
        <form action="${pageContext.request.contextPath}/user/register.do" method="post">
            name : <input type="text" name="name"><br>
            age  : <input type="text" name="age"><br>
            <input type="submit" value="add">
        </form>
    </div>
</body>
</html>
