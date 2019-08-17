<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
       <form:form method="post" action="empSearch" modelAttribute="empForm">    
        <table >    
         <tr>    
          <td>Id :</td>    
          <td><form:input path="id" /></td>  
         </tr>   
         <tr>    
          <td colspan="2"><input type="submit" value="Search" /></td>    
         </tr>    
        </table>    
       </form:form>    
