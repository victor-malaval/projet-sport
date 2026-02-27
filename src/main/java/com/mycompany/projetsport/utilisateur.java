package com.mycompany.projetsport;

import java.util.Scanner;

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
    private String MDP;
    private String email;
    
    public utilisateur(String valMDP, String valemail){
        this.MDP = valMDP;
        this.email = valemail;
    }
    /* GETTHERS*/
    public String getMDP() {
        return MDP;
    }

    public String getemail() {
        return email;
    }
    public void miseajourmdp(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mise a jour du mot de passe client : ");
        String nouveaumdp=sc.nextLine();
        this.MDP=nouveaumdp;
    }
}