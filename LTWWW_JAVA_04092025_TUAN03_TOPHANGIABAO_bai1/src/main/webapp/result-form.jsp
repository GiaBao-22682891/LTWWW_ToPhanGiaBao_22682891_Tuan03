<%--
  Created by IntelliJ IDEA.
  User: Student
  Date: 9/4/2025
  Time: 7:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import ="com.example.ltwww_java_04092025_tuan03_tophangiabao.Model.Student"%>
<html>
<head>
    <title>Result submit</title>
</head>
<body>
    <%
        Student student = new Student();
        student = (Student) request.getAttribute("student");
        out.println(
                "First name: " + student.getFirstName()
                + "<br/> Last name: " + student.getLastName()
                + "<br/> Email: " + student.getGender()
                + "<br/> Course: " + student.getAppliedCourse()
        );
    %>
</body>
</html>
