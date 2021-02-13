<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <title>Welcome page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="css/index.css"/>
    </head>
    <body>
        <h2>Welcome page</h2>
        <div><c:out value="${hs.getMessage()}" /></div>
    </body>
</html>
