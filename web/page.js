

function modifier(numcell) {
    viderBouton("B2Cell_" + numcell);
    afficherB1(1, numcell);
}

function supprimer(val) {
    viderBouton("B1Cell_" + val);
    afficherB2(1, val);
}

function  valider(val) {
    afficherB1(2, val);
    afficherB2(2, val);
}



function confirmerSuppression(val) {
    afficherB1(2, val);
    afficherB2(2, val);
}

function viderBouton(nomcell) {
    document.getElementById(nomcell).innerHTML = "";
}

function afficherB1(val, numcell) {
    switch (val) {
        case 1:
            txt = "<button onclick=\"valider(" + numcell + ")\" "
                    + "id=\"B1\">Modifier<\/button>";
            break;
        case 2:
            txt = "<button onclick=\"modifier(" + numcell + ")\" "
                    + " id=\"B1\">Valider<\/button>";
            break;
    }


    document.getElementById("B1Cell_" + numcell).innerHTML = txt;
}
function afficherB2(val, numcell) {
    switch (val) {
        case 1:
            txt = "<s:form action=\"supprimerContact\">"
                    + "<s:set var=\"id_contact\" value=\"${"
                    + numcell
                    + "}\" />"
                    + "<s:submit value=\"Confirmer\" />"
                    + "</s:form>";
            break;

        case 2:

            txt = "<button onclick=\"supprimer(" + numcell + ")\""
                    + " id=\"B2\">supprimer </button>";

            break;
    }
    document.getElementById("B2Cell_" + numcell).innerHTML = txt;
}