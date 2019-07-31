<%@ page import="fr.wildcodeschool.githubtracker.model.Githuber" %>
<%--
  Created by IntelliJ IDEA.
  User: valentin
  Date: 12/07/19
  Time: 11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
    <head>
        <title>Githubers</title>
    </head>

    <body>
    <%@include file="header.jsp"%>

    <table class="table">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">ID</th>
            <th scope="col">Name</th>
            <th scope="col">Email</th>
            <th scope="col">Login</th>
            <th scope="col">Avatar Url</th>
        </tr>
        </thead>
        <tbody>
    <c:forEach items="${githubersList}" var="product">
        <tr>
            <th scope="row">- </th>
            <td><c:out value="${product.id}" /></td>
            <td><c:out value="${product.name}" /></td>
            <td><c:out value="${product.email}" /></td>
            <td><c:out value="${product.login}" /></td>
            <td><c:out value="${product.avatarUrl}" /></td>
        </tr>
    </c:forEach>
        </tbody>
    </table>
    </body>
</html>
