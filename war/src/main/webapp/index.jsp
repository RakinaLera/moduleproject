<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>
        Time
    </title>
</head>
    <body>
        <%
            String browserType = request.getHeader("User-Agent");
            String ipClient = request.getRemoteAddr();
        %>

        <h1>
            Текущее время: <%=request.getAttribute("time")%>
            <br>Браузер: <%=browserType%>
            <br>IP клиента: <%=ipClient%>
        </h1>
    </body>
</html>
