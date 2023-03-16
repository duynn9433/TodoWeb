<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link href="webjars/bootstrap/5.2.3/css/bootstrap.min.css" rel="stylesheet">

    <title>
        Todo list
    </title>
</head>
<body>
<div class="container">
    <h1>Your todos</h1>
    <table class="table">
        <thead>
            <tr>
                <th>Id</th>
                <th>Des</th>
                <th>Date</th>
                <th>Is done?</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach items="${todos}" var = "todo">
            <tr>
                <td></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<script src="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
<script src="webjars/jquery/3.6.3/jquery.min.js"></script>
</body>
</html>