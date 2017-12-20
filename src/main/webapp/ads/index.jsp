<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--
  Created by IntelliJ IDEA.
  User: sschutzman
  Date: 12/20/17
  Time: 11:00 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="/partials/head.jsp">
    <jsp:param name="title" value="Welcome to my site!" />
</jsp:include>
<head>
    <title>Ads</title>
</head>
<body>
    <div>
        <c:forEach var="ad" items="${ads}">
        <h1>${ad.title}</h1>
        <p>${ad.description}</p>
    </c:forEach>
    </div>

</body>
</html>
