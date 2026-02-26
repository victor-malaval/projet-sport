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
    
    
    public plateforme (String valNomfichiersauvegarde){
        this.Nomfichiersauvegarde=valNomfichiersauvegarde;
        this.tabadmin=new ArrayList<>();
        this.tabclients=new ArrayList<>();
        this.tabcoursfutur=new ArrayList<>();
        this.tabcourspasse=new ArrayList<>();
    }
    
    
    @Override
     public String toString(){
    String resultat = "Liste des clients :\n";

    for (client c : tabclients) {
        resultat += c.toString() + "\n";
    }

    resultat += "\nListe des admins :\n";
    for (admin a : tabadmin) {
        resultat += a.toString() + "\n";
    }

    resultat += "\nListe des cours passes :\n";
    for (cours cp : tabcourspasse) {
        resultat += cp.toString() + "\n";
    }

    resultat += "\nListe des cours futurs :\n";
    for (cours cf : tabcoursfutur) {
        resultat += cf.toString() + "\n";
    }

    return resultat;
     }
     
    public void afficherClient() {
        if(tabclients.size()==0){
            System.out.println("Aucun client enregistre pour le moment");
        }
        
    System.out.println("Liste des clients :");
    for (client c : tabclients) {
        System.out.println("Numero : " + c.getnumero() +
                ",  Email : " + c.getemail() +
                ",  MDP : " + c.getMDP() +
                ",  Nom : " + c.getnom() +
                ",  Prenom : " + c.geteprenom() +
                ",  Tel : " + c.gettel() +
                ",  Adresse : " + c.getadresse() +
                ",  Type  : " + c.gettypeabonnement() +
                ",  Actif : " + c.getabonnement());
    
    }
    }
    public void afficherAdmin(){
        if(tabadmin.size()==0){
            System.out.println("Aucun admin enregistre pour le moment");
        }
        System.out.println("Liste des admins :");
        for(admin a :tabadmin ){
            System.out.println("Email : " + a.getemail() +",  MDP : " + a.getMDP());
        } 
    }
    

    
    public void creerCompteClient() {

    Scanner sc = new Scanner(System.in);
    String email="";
    
    // Vérification email déjà utilisé
    boolean emailExiste=true;
    while (emailExiste==true) {
        emailExiste=false;
        System.out.print("Entrez votre email : ");
        email = sc.nextLine();
        for (client c : tabclients) {
            if (c.getemail().equals(email)) {
                System.out.println("Email déjà utilise !");
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

    System.out.print("Entrez votre prenom : ");
    String prenom = sc.nextLine();

    System.out.print("Entrez votre numero de telephone : ");
    String tel = sc.nextLine();
    

    System.out.print("Entrez votre adresse : ");
    String adresse = sc.nextLine();

    // Génération automatique numéro client
    int numClient = tabclients.size()+1;

    // Création du client
    client nouveauClient = new client(mdp, email, numClient, nom, prenom, tel, adresse,typeabonnement);

    tabclients.add(nouveauClient);

    System.out.println("Compte cree avec succes !");
    System.out.println("Votre numero client est : " + numClient);
    }
    
    public void creerCompteAdmin() {
    Scanner sc = new Scanner(System.in);
    String email="";      
    
    // Vérification email déjà utilisé
    boolean emailExiste = true;
    while (emailExiste==true) {
        emailExiste = false;
        System.out.print("Entrez votre email : ");
        email = sc.nextLine();   
        for (admin a : tabadmin) {
            if (a.getemail().equals(email)) {
                System.out.println("Email déjà utilise !");
                emailExiste = true;
                break;
            }
        }
    }

    System.out.print("Entrez votre mot de passe : ");
    String mdp = sc.nextLine();

    // Creation de l'admin
    admin nouveauAdmin = new admin(mdp, email);
    tabadmin.add(nouveauAdmin);

    System.out.println("Compte cree avec succes !");
    }

            
       
    public admin seconnecteradmin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("veuillez entrez votre mail : ");
        String mail=sc.nextLine();
        
        System.out.println("veuillez entrez votre mot de passe : ");
        String mdp=sc.nextLine();
        for(admin a : tabadmin){
            if (a.getemail().equals(mail)&&a.getMDP().equals(mdp)){
                System.out.println("connexion reussie ! ");
                return a;
            }
        }
        System.out.println("mot de passe ou email incorrect ");
        return null;
    }
    public client seconnecterclient(){
        Scanner sc = new Scanner(System.in);
        System.out.println("veuillez entrez votre mail : ");
        String mail=sc.nextLine();
        
        System.out.println("veuillez entrez votre mot de passe : ");
        String mdp=sc.nextLine();
        for(client a  : tabclients){
            if (a.getemail().equals(mail)&&a.getMDP().equals(mdp)){
                System.out.println("connexion reussie ! ");
                return a;
            }
        }
        System.out.println("mot de passe ou email incorrect ");
        return null;
    }
    
    }
    