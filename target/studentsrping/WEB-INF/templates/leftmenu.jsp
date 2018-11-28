<%@ include file="../templates/taglib.jsp" %>

<style>
    .vertical-menu {
        width: 200px;
    }

    .vertical-menu a {
        background-color: #eee;
        color: black;
        display: block;
        padding: 12px;
        text-decoration: none;
    }

    .vertical-menu a:hover {
        background-color: #ccc;
    }

    .vertical-menu a.active {
        background-color: #4CAF50;
        color: white;
    }
</style>
<div class="vertical-menu">
    <a class="active" href="<c:url value="/index"/>">Home</a>
    <a href="<c:url value="/addstudent"/>">Add Student</a>
    <a href="<c:url value="/viewstudent"/> ">View Student</a>
</div>