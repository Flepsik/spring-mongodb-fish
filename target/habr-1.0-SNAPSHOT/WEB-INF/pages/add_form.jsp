<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Добавить контакт</title>
    <!-- Bootstrap core CSS -->
    <link href='<c:url value="/resources/css/bootstrap.min.css" />' rel="stylesheet">
    <link href='<c:url value="/resources/css/mystyle.css" />' rel="stylesheet">
    <script type="text/javascript" src='<c:url value = "/resources/js/jquery-2.1.3.min.js"/>'></script>
    <script type="text/javascript" src='<c:url value = "/resources/js/jquery.inputmask.js"/>'></script>
    <script type="text/javascript">
        $(document).ready(function () {
            $("#phonemask").inputmask("+7(999)999-99-99");
        });</script>
</head>
<body>
<div class="parent">
    <form:form method="POST" action="/add" modelAttribute="comment" class="form-horizontal" role="form">
        <form:hidden path="id"/>
        <div class="form-group">
            <label class="col-sm-1 control-label">Name</label>

            <div class="col-sm-11">
                <form:input path="name" class="form-control" placeholder = "Name"/>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">Surname</label>

            <div class="col-sm-11">
                <form:input path="surname" class="form-control" placeholder = "Surname"/>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">Sex</label>
            <div class="col-sm-11">
                <form:radiobutton path="sex" value="Male"/>Male<p/> <form:radiobutton
                    path="sex" value="Female"/>Female
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">Phone</label>
            <div class="col-sm-11">
                <form:input path="phone" class="form-control" id = "phonemask" placeholder = "Phone"/>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-1 control-label">Comment</label>
            <div class="col-sm-11">
                <form:textarea cols="5" rows="3" path="comment" class="form-control" placeholder = "Comment"/>
            </div>
        </div>
        <button type="submit" class="btn btn-primary btn-lg active">Send</button>
    </form:form>
</div>
</body>
</html>
