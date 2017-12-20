<%--
  Created by IntelliJ IDEA.
  User: sschutzman
  Date: 12/19/17
  Time: 10:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="Title" value="Login" />
    </jsp:include>
</head>

<body>
<% if (request.getMethod().equalsIgnoreCase("post")) {
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if(username.equals("admin") && password.equals("password")){
            response.sendRedirect("profile.jsp");
        }
    }
 %>
    <form action="/login.jsp" method="POST">
        <label for="username">Username</label>
        <input id="username" name="username" type="username" placeholder="Enter your Username">
        <br>

        <label for="password">Password</label>
        <input id="password" name="password" type="password" placeholder="Enter your password">
        <br>
        <button>Submit</button>


    </form>
</body>
</html>
