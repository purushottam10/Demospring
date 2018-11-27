<%@ include file="../templates/taglib.jsp" %>


    <table class="table ">
        <tr>
            <th>id</th>
            <th>Name</th>
            <th>Age</th>
            <th>Delete</th>
            <th>Edit</th>
        </tr>
        <c:forEach items="${studentList}" var="student">
            <tr class="tr">
                <td class="id" id="id" ><c:out value="${student.roll_no}"/></td>
                <td  class="studentName" ><c:out value="${student.name}"/></td>
                <td  class="age"><c:out value="${student.age}"/></td>
                <td><a href="<c:url value="/deletestudent/${student.roll_no}"/>" > Delete</a></td>
                <td><a href="<c:url value="/editstudent/${student.roll_no}"/> " class="btn btn-info btn-sm"> <span class="glyphicon glyphicon-pencil"></span>edit</a> </td>
            </tr>
        </c:forEach>

    </table>
    <c:out value="${ message}"></c:out>
   <center> <a href="<c:url value="/index"/>">INDEX</a>
</center>
