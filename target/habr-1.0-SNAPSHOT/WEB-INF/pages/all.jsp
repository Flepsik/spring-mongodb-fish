<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Все контакты</title>
    <link href='<c:url value="/resources/css/bootstrap.min.css" />' rel="stylesheet">
    <link href='<c:url value="/resources/css/mystyle.css" />' rel="stylesheet">
</head>
<body>
<div class="container">

        <div class="col-xs-12 col-sm-9">

                <c:forEach var="comment" items="${comments}">
                <div class="col-6 col-sm-6 col-lg-4">
                    <h2>${comment.name} ${comment.surname}</h2>
                    <h3>
                        <p>${comment.sex} ${comment.phone}</p>
                    </h3>
                    <h4>
                        <p>${comment.comment}</p>
                    </h4>
                </div>
                </c:forEach>
                <div class="col-6 col-sm-6 col-lg-4">
                    <div style="text-align: center"  >
                        <p><p></p></p>
                        <p><a href="/add" class = "btn btn-large btn-primary">Добавить запись</a></p>
                    </div>
                </div>
            </div>
        </div>

    </div>

</div>

</body>
</html>
