<%@ include file="../templates/taglib.jsp" %>

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
