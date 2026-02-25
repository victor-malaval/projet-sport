package com.mycompany.projetsport;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vivic
 */
public class client extends utilisateur {
    private int numero;
    private String nom;
    private String prenom;
    private String tel;
    private String adresse;
    private String typeabonnement;
    private boolean abonnement;

    public client(String valMDP, String valemail, int valnumero, String valnom, String valprenom, String valtel, String valadresse, String valtypeabonnement) {
        super(valMDP, valemail);
        this.numero = valnumero;
        this.nom = valnom;
        this.prenom = valprenom;
        this.tel = valtel;
        this.adresse = valadresse;
        this.typeabonnement=valtypeabonnement;
        this.abonnement=true;
    }

    @Override
public String toString() {
    return "Numero client : " + numero +" ,Mot de passe : " + getMDP() +", Email : " + getemail() +", Nom : " + nom +", Prenom : " + prenom +", Tel : " + tel +", Adresse : " + adresse;
}
}
