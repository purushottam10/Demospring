<%--
  Created by IntelliJ IDEA.
  User: dz-gg-05
  Date: 22/11/18
  Time: 10:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--method="post"--%>
<center >
    <form:form   action="/addstudent" modelAttribute="student" method="post"   >
      <table>  <tr>
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
         <tr>
             <td>
                 <input type="submit" value="Submit">
             </td>

         </tr>

      </table>
    </form:form>
</center>
</body>
</html>
