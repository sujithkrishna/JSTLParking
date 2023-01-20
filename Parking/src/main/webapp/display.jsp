<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<h1> Results</h1>
	
	<c:forEach var="item" items="${current }"> 
		carRegNo <c:out value="${item.carRegNo}"></c:out> </br>
	</c:forEach>
	
	
</body>
</html>