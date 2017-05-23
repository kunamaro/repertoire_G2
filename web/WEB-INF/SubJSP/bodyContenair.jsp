<%-- 
    Document   : contactContenair
    Created on : 23 mai 2017, 11:46:07
    Author     : Lionel
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> f
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<c:set var="Liste" var="%{fonctionTest()}" />
<h1>TEST : 
    <s:form action="testRemplissageContact" >
        <s:submit value="TEST" />
    </s:form>
<%--<c:set var="Liste" value="%{fonctionTest()" scope="request" />--%>
<c:forEach items="Liste" var="item" varStatus="status" >


    <jsp:include page="/WEB-INF/SubJSP/contactContenair.jsp" >
        <jsp:param name="monBean" value="${item.nom}" /> 
    </jsp:include>
    <c:set var="cpt"  scope="request" value="${cpt +1}" />
</c:forEach>