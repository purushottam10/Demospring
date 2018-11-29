<%@ include file="../templates/taglib.jsp" %>


<div class="container">
<center>
<form:form action="/editstudent" modelAttribute="student" method="post">


    <div class="form-group">
        <label for="rollNo">RollNo :
            <form:input path="rollNo" readonly="true"/>
        </label>
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