<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix='fn' %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix = 'c'%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor='lightblue'>
       <c:choose>
       
         <c:when test= "${status eq 'success'}">
           <h1 style='color:green;text-align: center'>
				SAVED IN DATABASE SUCCESSFULLY
			</h1>
         
         </c:when>
         <c:otherwise>
            <h1 style='color:green;text-align: center'>
				NOT SAVED IN DATABASE. Please try gain
			</h1>
        
         </c:otherwise>
       </c:choose>
		
</body>
</html>