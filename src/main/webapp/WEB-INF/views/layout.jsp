<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en" class="no-js">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<tiles:insertAttribute name="common_css" />
<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>
<body>
	<div class="layout_header">
		<tiles:insertAttribute name="header" />
	</div>
	<div class="layout_body">
		<tiles:insertAttribute name="body" />
	</div>
	<div class="layout_footer">
		<tiles:insertAttribute name="footer" />
	</div>

</body>
</html>