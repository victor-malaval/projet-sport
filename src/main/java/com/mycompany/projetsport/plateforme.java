package com.mycompany.projetsport;



import java.util.ArrayList;
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
    
    public plateforme (String valNomfichiersauvegarde,int valdureecours){
        this.Nomfichiersauvegarde=valNomfichiersauvegarde;
        this.dureecours=valdureecours;
        this.tabadmin=new ArrayList<>();
        this.tabclients=new ArrayList<>();
        this.tabcoursfutur=new ArrayList<>();
        this.tabcourspasse=new ArrayList<>();
    }
    @Override
     public String toString(){
        return "liste des clients : " + tabclients + " liste des admins : " + tabadmin + " liste des cours passés : " + tabcourspasse +" liste des cours futurs : "+ tabcoursfutur
                +" duree du cours : "+ dureecours;
    }
     public void seconnecter(){}
     
     
     
     public void creerCompteClient() {

    Scanner sc = new Scanner(System.in);
    String email="valeur initial";
    
    // Vérification email déjà utilisé
    boolean emailExiste=true;
    while (emailExiste==true) {
        emailExiste=false;
        System.out.print("Entrez votre email : ");
        email = sc.nextLine();
        for (client c : tabclients) {
            if (c.getemail().equals(email)) {
            System.out.println("Email déjà utilisé !");
            emailExiste = true;
            break;
            }
        }
    }
        
    System.out.print("Entrez votre mot de passe : ");
    String mdp = sc.nextLine();
    
    System.out.print("Entrez votre type d'abonnement (trimestriel/semestriel/annuel) : ");
    String typeabonnement = sc.nextLine();

    System.out.print("Entrez votre nom : ");
    String nom = sc.nextLine();

    System.out.print("Entrez votre prénom : ");
    String prenom = sc.nextLine();

    System.out.print("Entrez votre numéro de téléphone : ");
    String tel = sc.nextLine();
    

    System.out.print("Entrez votre adresse : ");
    String adresse = sc.nextLine();

    // Génération automatique numéro client
    int numClient = tabclients.size()+1;

    // Création du client
    client nouveauClient = new client(mdp, email, numClient, nom, prenom, tel, adresse,typeabonnement);

    tabclients.add(nouveauClient);

    System.out.println("Compte créé avec succès !");
    System.out.println("Votre numéro client est : " + numClient);
}
    
    }
    