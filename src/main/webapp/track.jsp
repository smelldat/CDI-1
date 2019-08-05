
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <head>
        <title>Githubers</title>
    </head>

    <body>
    <%@include file="header.jsp"%>

    <form method="post" action="track">
        <div class="form-row">
            <div class="form-group col-md-6">
                <label for="login">Login</label>
                <input type="text" class="form-control" id="login" name="login" placeholder="Enter your GitHub login">
            </div>
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
    </body>
</html>

