<%-- 
    Document   : contactContenair
    Created on : 23 mai 2017, 11:46:07
    Author     : Lionel
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> f
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="bean.Contact" %>
<!DOCTYPE html>

<c:forEach items="listeContact" var="item" varStatus="status"  >
    10
    <jsp:include page="/WEB-INF/SubJSP/contactContenair.jsp" >
        <jsp:param name="contact" value="${item}" /> 
    </jsp:include>
</c:forEach>