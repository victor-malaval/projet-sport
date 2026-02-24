package com.mycompany.projetsport;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vivic
 */
public class utilisateur {
    /**Class utilisateur (mère)
Attributs :
Mot de passe
Adresse mail (ID)
Class admin(fille)
Hérite Attributs :
Class clients(fille)
Attributs : numero client
Type abonnement semestriel trimestriel mensuel annuel
Etat abonnement actif passif
Information nom prenom n°tel adresse postale
Liste cours passés
Liste cours futurs**/
    public String MDP;
    public String email;
    
    public utilisateur(String valMDP, String valemail){
        this.MDP = valMDP;
        this.email = valemail;
    }
}