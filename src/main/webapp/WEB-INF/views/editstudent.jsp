<%@ include file="../templates/taglib.jsp" %>


<div class="container">
<center>
<form:form action="/editstudent" modelAttribute="student" method="post">
    <div class="form-group">
        <label for="roll_no">Roll No:

            <form:input path="roll_no"/></label>
    </div>
    <div class="form-group">
        <label for="name">Name :
            <form:input path="name"/>
        </label>
    </div>
    <div class="form-group">
        <label for="age"> Age

            <form:input path="age"/>
        </label>
    </div>
        <button type="submit" class="btn btn-default">Submit</button>

</form:form>
</center>
</div>