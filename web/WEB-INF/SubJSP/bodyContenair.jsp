<%-- 
    Document   : contactContenair
    Created on : 23 mai 2017, 11:46:07
    Author     : Lionel
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<h1>TEST :<s:property value="%{fonctionTest()}" /> 
    <s:form action="testRemplissageContact" >
        <s:submit value="TEST" />
    </s:form>
<c:set var="cpt" value="1" scope="request" />
<c:forEach begin="0" step="1" end="10"  >


    <jsp:include page="/WEB-INF/SubJSP/contactContenair.jsp" >
        <jsp:param name="monBean" value="${listeContact[cpt]}" /> 
    </jsp:include>
    <c:set var="cpt"  scope="request" value="${cpt +1}" />
</c:forEach>