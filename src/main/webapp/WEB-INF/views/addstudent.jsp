<%@ include file="../templates/taglib.jsp" %>


<div class="container">
    <center>
        <form:form action="/addstudent" modelAttribute="student" method="post">

            <div class="form-group">
                <label for="name">Name :
                    <form:input path="name"/>
                </label>
            </div>
            <div class="form-group">
                <label for="age"> Age :

                    <form:input path="age"/>
                </label>
            </div>
            <button type="submit" class="btn btn-default">Submit</button>

        </form:form>
        <br>
        <a href="<c:url value="/index"/>">Cancel</a>
    </center>
</div>