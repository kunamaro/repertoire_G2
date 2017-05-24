<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="css/index.css" >

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Repertoire!</title>
        <script src="page.js"></script>
    </head>
    <body>
        <div class="bodyContenair">
            <div class="titleContenair">
                <jsp:include page="/WEB-INF/SubJSP/titleContenair.jsp" />
            </div>
            <div class="contactContenair">
                <jsp:include page="/WEB-INF/SubJSP/bodyContenair.jsp" >
                    <jsp:param name="listeContact" value="${listeContact}"/>
                </jsp:include>
            </div>
        </div>
    </body>
</html>

