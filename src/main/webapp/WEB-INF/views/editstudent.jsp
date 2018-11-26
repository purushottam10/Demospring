<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: dz-gg-05
  Date: 22/11/18
  Time: 1:00 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <table><form:form action="/editstudent" modelAttribute="student" method="post">
        <tr>
            <td> Roll No</td>
            <td>
                <form:input path="roll_no"/>
            </td>
        </tr>
        <tr>
            <td> Name</td>
            <td>
                <form:input path="name"/>
            </td>
        </tr>
        <tr>
            <td> Age</td>
            <td>
                <form:input path="age"/>
            </td>
        </tr>

        <tr><center>
            <td>
                <input type="submit" value="Submit"></td></center>
        </tr>

    </form:form></table>

</center>
</body>
</html>
