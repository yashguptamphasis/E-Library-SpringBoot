   <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
 <h1>These are the books we got</h1>  
<h1>Which book would you want</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Name</th></tr>  
   <c:forEach var="book" items="${list}">   
   <tr>  
   <td>${book.name}</td>  
  
  
   
  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="empform">Add New Employee</a>  