

function modifier(val) {
    viderBouton("B2Cell_");
    afficherB1("valider");

}


function  valider(val) {
    afficherB1("modifier");
    afficherB2("supprimer");

}

function supprimer() {
    viderBouton("B1Cell__");
    afficherB2("confirmer");

}

function confirmerSuppression() {
    afficherB1("modifier");
    afficherB2("supprimer");


}

function viderBouton(val) {
    document.getElementById(val).innerHTML =
            "";

}

function afficherB1(val) {
    switch (val) {
        case "modifier":
             txt = "<button onclick=\"valider()\" "
                    + "id=\"B1\">Modifier<\/button>";
            break;

        case "valider":
             txt = "<button onclick=\"modifier()\""
                    + " id=\"B1\">Valider<\/button>";
            break;
    }


    document.getElementById("B1Cell_").innerHTML = txt;

}
function afficherB2(val) {
    switch (val) {
        case "supprimer":
             txt = "<button onclick=\"confirmerSuppression()\" "
                    + "id=\"B2\">Suppression<\/button>";
            break;

        case "confirmer":
             txt = "<button onclick=\"supprimer()\""
                    + " id=\"B2\">supprimer<\/button>";
            break;
    }
    document.getElementById("B2Cell_").innerHTML = txt;
}