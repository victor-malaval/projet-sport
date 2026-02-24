package com.mycompany.projetsport;


import com.mycompany.projetsport.cours;
import com.mycompany.projetsport.client;
import com.mycompany.projetsport.admin;
import java.util.List;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vivic
 */
public class plateforme {
    private  List<client> tabclients;
    private List<admin> tabadmin;
    private List<cours> tabcourspasse;
    private List<cours> tabcoursfutur;
    private String Nomfichiersauvegarde;
    private int dureecours;
    
    public plateforme (List<client> valtabclients,List<admin> valtabadmin,List<cours> valtabcourspasse,List<cours> valtabcoursfutur, String valNomfichiersauvegarde,int valdureecours){
        this.Nomfichiersauvegarde=valNomfichiersauvegarde;
        this.dureecours=valdureecours;
        this.tabadmin=valtabadmin;
        this.tabclients=valtabclients;
        this.tabcoursfutur=valtabcoursfutur;
        this.tabcourspasse=valtabcourspasse;
    }
     public String toString(){
        return "liste des clients : " + tabclients + "liste des admins : " + tabadmin + "liste des cours passés : " + tabcourspasse +"liste des cours futurs : "+ tabcoursfutur
                +"duree du cours : "+ dureecours;
    }
     public void seconnecter(){}
     public void creerCompteClient() {

    Scanner sc = new Scanner(System.in);


    System.out.print("Entrez votre email : ");
    String email = sc.nextLine();

    // Vérification email déjà utilisé
    for (client c : tabclients) {
        if (c.email.equalsIgnoreCase(email)) {
            System.out.println("Erreur : cet email est déjà utilisé !");
            return;
        }
    }

    System.out.print("Entrez votre mot de passe : ");
    String mdp = sc.nextLine();

    System.out.print("Entrez votre nom : ");
    String nom = sc.nextLine();

    System.out.print("Entrez votre prénom : ");
    String prenom = sc.nextLine();

    System.out.print("Entrez votre numéro de téléphone : ");
    int tel = sc.nextInt();
    sc.nextLine(); // vider le buffer

    System.out.print("Entrez votre adresse : ");
    String adresse = sc.nextLine();

    // Génération automatique numéro client
    int numClient = 1;
    if (!tabclients.isEmpty()) {
        numClient = tabclients.get(tabclients.size() - 1).numero + 1;
    }

    // Création du client
    client nouveauClient = new client(mdp, email, numClient, nom, prenom, tel, adresse);
    nouveauClient.abonnement = true;

    tabclients.add(nouveauClient);

    System.out.println("Compte créé avec succès !");
    System.out.println("Votre numéro client est : " + numClient);
}
             
     

    
           
    
    
    
    
    }
    