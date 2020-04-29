   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
 <h1>These are the books you have issued </h1>  
<h1>Which book would you want to return</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Name</th><th>Return</th></tr>  
   <c:forEach var="book2" items="${list1}">   
   <tr>  
   <td>${book2.name}</td>  
  
  
   <td><a href="returnBook2?name=${book2.name}">return</a></td>  
  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
    
    
    
  