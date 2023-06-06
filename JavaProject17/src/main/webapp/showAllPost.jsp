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

       <center>
          <h1>Welcome to Blog</h1>
          <table border=1>
             <tr>
             <td><b>SNO</b></td>
             <td><b>TITLE</b></td>
             <td><b>DESCRIPTION</td></b>
             <td><b>CONTENT</b></td>  
            </tr>
            
          <c:forEach items="${blog}" var="blogpost">
         
               <tr>
                  <td><c:out value="${blogpost.getSno() }"></c:out></td>
                  <td><c:out value="${blogpost.getTitle() }"></c:out></td>
                  <td><c:out value="${blogpost.getDescription() }"></c:out></td>
                  <td><c:out value="${blogpost.getContent() }"></c:out></td>
               </tr>
      
      
           </c:forEach>
          </table>
          </center>
		
</body>
</html>