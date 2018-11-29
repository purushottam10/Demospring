
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ include file="../templates/taglib.jsp" %>

<!DOCTYPE html>
<html>
<head>

    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title><tiles:getAsString name="title"/></title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
        * {box-sizing: border-box;}

        body {
            margin: 0;
            font-family: Arial, Helvetica, sans-serif;
        }

        .header {
            overflow: hidden;
            background-color: #f1f1f1;
            padding: 20px 10px;
        }

        .header a {
            float: left;
            color: black;
            text-align: center;
            padding: 12px;
            text-decoration: none;
            font-size: 18px;
            line-height: 25px;
            border-radius: 4px;
        }

        .header a.logo {
            font-size: 25px;
            font-weight: bold;
        }

        .header a:hover {
            background-color: #ddd;
            color: black;
        }

        .header a.active {
            background-color: dodgerblue;
            color: white;
        }

        .header-right {
            float: right;
        }

        @media screen and (max-width: 500px) {
            .header a {
                float: none;
                display: block;
                text-align: left;
            }
            .header-right {
                float: none;
            }
        }
    </style>
</head>
<body>

<div class="header">
    <a href="#" class="logo"><img src="/resources/logo.png" alt="CompanyLogo"
                                  style="height: 60px;width:100px;padding-top:0%;"></a>
    <div class="header-right">
        <a class="active" href="<c:url value="/index"/>">Home</a>
        <a href="<c:url value="/addstudent"/>">Add Student</a>
        <a href="<c:url value="/viewstudent"/> ">View Student</a>
    </div>
</div>
<div>

<center>Welcome to student Record </center>

<tilesx:useAttribute name="current"/>
<div class="w3-container">
    <div style=" float:left;padding:10px;width:15%;height: 100%">
    <tiles:insertAttribute name="leftmenu" /></div>
    <div style=" float:left;padding:10px;width:80%;" >
    <tiles:insertAttribute name="body"/>
    </div>
    <br>
    <br>
    <center>
        <titles:insertAttribute name="footer"/>
    </center>
</div>
</div>
</body>
</html>
