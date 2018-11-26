<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<center>
    <span><c:out value="${message}"/></span>
    <table>
        <tr>
            <td>
                <a href="<c:url value="/index"/>">INDEX</a>
            </td>
        </tr>
        <tr>
            <td>
                <a href="<c:url value="/viewstudent"/> ">VIEW</a>
            </td>
        </tr>
        <tr>
            <td>
                <a href="<c:url value="/addstudent"/> ">ADD</a>
            </td>
        </tr>
    </table>
</center>
</body>
</html>
