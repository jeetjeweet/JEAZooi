<%@ page import="org.apache.http.client.methods.HttpPost" %>
<%@ page import="org.apache.http.client.HttpClient" %>
<%@ page import="org.apache.http.impl.client.HttpClientBuilder" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.apache.http.NameValuePair" %>
<%@ page import="java.util.List" %>
<%@ page import="org.apache.http.message.BasicNameValuePair" %>
<%@ page import="org.apache.http.client.entity.UrlEncodedFormEntity" %>
<%@ page import="org.apache.http.HttpResponse" %>
<%@ page import="org.apache.http.util.EntityUtils" %>
<%@ page import="java.io.IOException" %><%--
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

    </body>
</html>
