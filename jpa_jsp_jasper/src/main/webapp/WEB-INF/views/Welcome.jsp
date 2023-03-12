<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>WELCOME PAGE</title>
</head>
<script type="text/javascript" src="${pageContext.request.contextPath}/component/js/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/component/js/jquery-ui.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/component/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/component/js/placeholders.jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/component/js/placeholders.jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/component/js/bootstrap.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/component/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/component/js/bootstrap-datepicker.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/component/js/dataTables.bootstrap.js"></script>
<link href="${pageContext.request.contextPath}/component/css/bootstrap.css" rel="stylesheet">


<body>
	<h1>WELCOME TO WEB APPLICATION DEMO</h1>
	 <nav id="sidebar-wrapper">
      <ul class="sidebar-nav">
        <li class="sidebar-brand">
          <a class="js-scroll-trigger" href="${pageContext.request.contextPath}/userform">Create new user</a>
        </li>
        <li class="sidebar-nav-item">
          <a class="js-scroll-trigger" href="${pageContext.request.contextPath}/userlist">Show all users</a>
        </li>
      </ul>
    </nav>
</body>
</html>