package com.mycompany.projetsport;



import java.time.LocalDateTime;
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
        // verification que 'admin existe
        for(admin a : tabadmin){
            if (a.getemail().equals(mail)&&a.getMDP().equals(mdp)){
                System.out.println("connexion reussie ! ");
                return a;// retourne l'admin connecté
            }
        }
        System.out.println("mot de passe ou email incorrect ");
        return null;// retour null si l'admin n'existe pas
    }
    public client seconnecterclient(){
        Scanner sc = new Scanner(System.in);
        System.out.println("veuillez entrez votre mail : ");
        String mail=sc.nextLine();
        
        System.out.println("veuillez entrez votre mot de passe : ");
        String mdp=sc.nextLine();
        // verification que le client existe
        for(client a  : tabclients){
            if (a.getemail().equals(mail)&&a.getMDP().equals(mdp)){
                System.out.println("connexion reussie ! ");
                return a; // retourne le client connecté
            }
        }
        // retour null si le client n'existe pas
        System.out.println("mot de passe ou email incorrect ");
        return null;
    }
    
    public void miseajourinfosclient(client c) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Mise a jour des informations client : ");

        System.out.print("Voulez vous modifier votre nom ? (true/false) : ");
        boolean changer = sc.nextBoolean();
        sc.nextLine(); // vider le buffer
        if (changer) {
            System.out.print("Nouveau nom : ");
            c.setnom(sc.nextLine());
        }

        System.out.print("Voulez vous modifier votre prenom ? (true/false) : ");
        changer = sc.nextBoolean();
        sc.nextLine();
        if (changer) {
            System.out.print("Nouveau prenom : ");
            c.setprenom(sc.nextLine());
        }

        System.out.print("Voulez vous modifier votre telephone ? (true/false) : ");
        changer = sc.nextBoolean();
        sc.nextLine();
        if (changer) {
            System.out.print("Nouveau telephone : ");
            c.settel(sc.nextLine());
        }

        System.out.print("Voulez vous modifier votre adresse ? (true/false) : ");
        changer = sc.nextBoolean();
        sc.nextLine();
        if (changer) {
            System.out.print("Nouvelle adresse : ");
            c.setadresse(sc.nextLine());
        }

        System.out.print("Voulez vous modifier votre type d abonnement ? (true/false) : ");
        changer = sc.nextBoolean();
        sc.nextLine();
        if (changer) {
            System.out.print("Nouveau type : ");
            c.settypeabonnement(sc.nextLine());
        }

        System.out.println("Mise a jour terminee.");
    }
    
    public void consulterinfosclient(client c) {
        System.out.println("Numero : " + c.getnumero()
                + ",  Email : " + c.getemail()
                + ",  MDP : " + c.getMDP()
                + ",  Nom : " + c.getnom()
                + ",  Prenom : " + c.geteprenom()
                + ",  Tel : " + c.gettel()
                + ",  Adresse : " + c.getadresse()
                + ",  Type  : " + c.gettypeabonnement()
                + ",  Actif : " + c.getabonnement());
    }
    public void consulterlistecoursfutur(){
    if (tabcoursfutur.size()==0) {
        System.out.println("Aucun cours futur pour le moment.");
        return;// sort de la methode si ausun cours futur
    }

    System.out.println("Liste des cours futurs : ");

    for (cours cours : tabcoursfutur) {
        System.out.println(cours);  // affichage des cours
    }
    }
    
    public void consultercoursinscrit(client c) {
        boolean trouve = false;

        System.out.println("Vos cours futurs : ");

        for (cours cours : tabcoursfutur) {              // parcourt uniquement les cours futurs
            if (cours.getlisteinscrits().contains(c)) {  // le client est inscrit
                System.out.println(cours);
                trouve = true;
            }
        }

        if (trouve==false) {
            System.out.println("Vous n'avez aucun cours futur inscrit.");
        }
    }
    public void consultercourspasse(client c){
        boolean trouve = false;

        System.out.println("Vos cours passes : ");

        for (cours cours : tabcourspasse) {             // parcourt uniquement les cours passés
            if (cours.getlisteinscrits().contains(c)) { // le client est inscrit
                System.out.println(cours);
                trouve = true;
            }
        }

        if (trouve==false) {
            System.out.println("Vous n'avez encore participe a aucun cours.");
        }
    }
    public void consulterActivitesfutur() {
        if (tabcoursfutur.size()!=0) {
            for (cours cours : tabcoursfutur) {
                System.out.println(cours.getactivite());
            }
        } else {
            System.out.println("Aucune activite disponible pour le moment.");
        }
    }
    public void inscrireCours(client c, int idCours) {
        boolean trouve = false;
        if (c.getabonnement()==false) {
            System.out.println("Votre abonnement n'est pas actif. Vous ne pouvez pas vous inscrire a un cours.");
            return;// sort de la methode si l'abonnement n'est pas actif
        }

        for (cours cours : tabcoursfutur) {
            if (cours.getcoursID() == idCours) {
                trouve = true;

                // Vérifie s’il reste de la place
                if (cours.getlisteinscrits().size() >= cours.getnbplace()) {
                    System.out.println("Desole, le cours est complet.");
                    return;// sort de la methode si le cours est complet
                }

                // Vérifie si le client est déjà inscrit
                if (cours.getlisteinscrits().contains(c)) {
                    System.out.println("Vous etes deja inscrit a ce cours.");
                    return;// sort de la methode si le client est deja inscrit
                }

                // Inscription
                cours.getlisteinscrits().add(c);
                System.out.println("Inscription au cours reussie !");
                return;
            }
        }

        if (trouve==false) {
            System.out.println("Cours introuvable.");
        }
    }
    public void desinscrireCours(client c, int idCours) {
        boolean trouve = false;

        for (cours cours : tabcoursfutur) {
            if (cours.getcoursID() == idCours) {
                trouve = true;

                // Vérifie si le client est inscrit
                if (cours.getlisteinscrits().contains(c)==false) {
                    System.out.println("Vous n'etes pas inscrit a ce cours.");
                    return;//sort de la methode si le client n'est pas inscrit
                }

                // Désinscription
                cours.getlisteinscrits().remove(c);
                System.out.println("Vous avez ete desinscrit du cours.");
                return;
            }
        }

        if (trouve==false) {
            System.out.println("Cours introuvable.");
        }
    }
    public List<cours> getTabcoursfutur() {
        return tabcoursfutur;
    }

    public List<cours> getTabcourspasse() {
        return tabcourspasse;
    }

    }


    
   
    
    