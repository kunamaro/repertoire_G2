<%@taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Repertoire!</title>
        <script src="page.js"></script>
        <link rel="stylesheet" href="css/index.css" >
        <link rel="stylesheet" href="css/title.css" >
        <link rel="stylesheet" href="css/contact.css" >
    </head>
    <body>
        <div class="bodyContenair">
            <div class="titleContenair">
                <jsp:include page="/WEB-INF/SubJSP/titleContenair.jsp" />
            </div>
            <div class="contactContenair">
                <c:forEach items="${listeContact}" var="contact" varStatus="status"  >

                    <div class="contact" >

                        <div class="mainCell"><!-- 
                            --><div class="subCell" id="infoCells"><!-- 
                                --><div class="infoCell" id="identityCell"> 
                                    <label>Personne&nbsp;:&nbsp;${contact.nom}&nbsp;${contact.prenom}</label>
                                </div><!-- 
                                --><div class="infoCell" id="telCell">
                                    telephone&nbsp;:&nbsp;${contact.telephone}
                                </div><!-- 
                                --><div class="infoCell" id="mailCell">
                                    email&nbsp;:&nbsp;${contact.email} 
                                </div><!-- 
                                --></div><!-- 
                            --><div class="subCell" id="buttonCells"><!-- 
                                --><div id="B1Cell" > 
                                    <button onclick="modifier()" value="B1">Modifier</button>
                                </div><!-- 
                                --><div id="B2Cell">
                                    <button onclick="supprimer()" value="B1">Supprimer</button>
                                </div><!-- 
                                --></div><!-- 
                            --></div>
                </c:forEach>
            </div>
        </div>
    </div>
</body>
</html>

