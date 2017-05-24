

function modifier() {
    viderBouton("B2Cell");
    afficherB1("valider");

}


function  valider() {
    afficherB1("modifier");
    afficherB2("supprimer");

}

function supprimer() {
    viderBouton("modifier");
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
            var txt = "<button onclick=\"valider()\" "
                    + "value=\"B1\">Modifier<\/button>";
            break;

        case "valider":
            var txt = "<button onclick=\"modifier()\""
                    + " value=\"B1\">Valider<\/button>";
            break;
    }


    document.getElementById("B1Cell").innerHTML = txt;

}
function afficherB2(val) {
    switch (val) {
        case "supprimer":
            var txt = "<button onclick=\"confirmerSuppression()\" "
                    + "value=\"B2\">Modifier<\/button>";
            break;

        case "confirmer":
            var txt = "<button onclick=\"supprimer()\""
                    + " value=\"B2\">Valider<\/button>";
            break;
    }
    document.getElementById("B2Cell").innerHTML = txt;
}