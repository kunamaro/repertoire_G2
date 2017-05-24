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
            <c:set value="1" var="cpt" />
            <div class="contactContenair">
                <c:forEach items="${listContact}" var="contact" varStatus="status"  >
                    <c:set var="num"  scope="request" value="${contact.id_contact}" />
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
                            --><div class="subCell" id="buttonCells<c:out value="${num}" />"><!-- 
                                --><div id="B1Cell_<c:out value="${num}" />" > 
                                    <button onclick="modifier(<c:out value="${num}" />)"  id="B1_<c:out value="${num}" />">Modifier</button>
                                </div><!-- 
                                --><div id="B2Cell_<c:out value="${num}" />">
                                    <button onclick="supprimer(<c:out value="${num}" />)" id="B2_<c:out value="${num}" />">Supprimer</button>
                                </div><!-- 
                                --></div><!-- 
                            --></div>
                    </div>

                </c:forEach>
                <div class="contact" >
                    <div id="ajoutContenair">
                        <s:form action="ajouterContact">
                            <div class="mainCell"><!-- 
                                --><div class="subCell" id="addInfoCells"><!-- 
                                    --><div class="infoCell" id="addIdentityCell"> 
                                        <s:label>nom</s:label>
                                        <s:textfield  name="nom" type="string" />
                                        <s:label>prenom</s:label>
                                        <s:textfield  name="prenom" type="string" />
                                    </div><!-- 
                                    --><div class="infoCell" id="addTelCell">
                                        <s:label>tel </s:label>
                                        <s:textfield  name="telephone" type="string" />
                                    </div><!-- 
                                    --><div class="infoCell" id="addMailCell">
                                        <s:label>mail </s:label>
                                        <s:textfield  name="email" type="string" />
                                    </div><!-- 
                                    --></div><!-- 
                                --><div class="subCell" id="addButtonCells"><!-- 
                                    --><div id="B_ADD" > 
                                        <s:submit value="Ajouter">Ajouter</s:submit>
                                        </div><!-- 
                                        --></div><!-- 
                                    --></div>
                            </s:form>
                    </div>
                </div>
            </div>
        </div>

        <s:form action="supprimerContact">
            
            <s:set value="id_personne" var="id_personne" />

            <s:submit value="Confirmer" />
        </s:form>
    </body>
</html>

