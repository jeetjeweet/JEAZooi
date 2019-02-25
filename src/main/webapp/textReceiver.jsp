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
