<%-- 
    Document   : contactContenair
    Created on : 23 mai 2017, 13:25:47
    Author     : stag
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> f
<%@taglib prefix="s" uri="/struts-tags" %>
<link rel="stylesheet" href="css/contact.css" >
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
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
</div>