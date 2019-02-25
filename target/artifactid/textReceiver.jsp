  Created by IntelliJ IDEA.
  User: jethr
  Date: 11-2-2019
  Time: 09:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <body>
    <%
        if(!request.getParameter("Tbox").isEmpty()){
            out.println(request.getParameter("Tbox"));
        }
        else {
            out.println("veld was leeg!");
            out.println("waddupski");
        }
    %>
 <form action="${pageContext.request.contextPath}/test" method="post">
     ID: <input type="text" name="Name"/>
     <input type="submit" value="Enter"/>
 </form>
    </body>
</html>
