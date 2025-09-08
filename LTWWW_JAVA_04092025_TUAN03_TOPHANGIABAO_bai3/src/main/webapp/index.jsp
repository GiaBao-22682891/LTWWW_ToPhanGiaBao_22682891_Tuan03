<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Multi-language Demo</title>
</head>
<body>

<%-- Get selected language from request --%>
<c:set var="languageCode" value="${param.radLanguageCode}" />

<c:if test="${not empty languageCode}">
  <fmt:setLocale value="${languageCode}" scope="session"/>
</c:if>

<fmt:setBundle basename="resource" scope="session"/>

<form action="index.jsp" method="POST">
  <p>
    <fmt:message key="languageMessage"/>
    <input type="radio" name="radLanguageCode" value="vi"
           <c:if test="${languageCode == 'vi'}">checked</c:if> />
    <fmt:message key="vn"/>

    <input type="radio" name="radLanguageCode" value="en" checked
           <c:if test="${languageCode == 'en'}">checked</c:if> />
    <fmt:message key="en"/>
  </p>

  <input type="submit" name="submit" value="<fmt:message key='chooseButton'/>"/>

  <table border="1" style="margin-top: 10px;">
    <tr>
      <td><fmt:message key="userName"/></td>
      <td><input type="text" name="txtUserName"/></td>
    </tr>
    <tr>
      <td><fmt:message key="pass"/></td>
      <td><input type="password" name="txtPassword"/></td>
    </tr>
    <tr>
      <td colspan="2">
        <input type="submit" name="submit" value="<fmt:message key='login'/>"/>
      </td>
    </tr>
  </table>
</form>

</body>
</html>
