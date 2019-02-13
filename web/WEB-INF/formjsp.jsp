<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post">
            <input type="text" name="string">
            <button type="submit">send</button>
            <div>
                <% if(request.getAttribute("string")!=null){ %>
                <a>You enter: <%= request.getAttribute("string")%> </a>
                <% } %>
            </div>
        </form>
    </body>
</html>
