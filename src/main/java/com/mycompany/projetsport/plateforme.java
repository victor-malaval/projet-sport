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
    
    // methodes affichages : 
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
    

    //methodes creation compte
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

            
    // methodes se connecter
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
    
    
    //methodes de mise a jour :
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
    
    
    // methodes pour consulter : 
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
    public void consultercourspasseclient(client c){
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
    
    public void consulterClients() {
        afficherClient();
    }
    
    public void consulterCoursPasse() {
        if (tabcourspasse.size() == 0) {
            System.out.println("Aucun cours passe pour le moment.");
            return;
        }

        System.out.println("Liste des cours passes : ");

        for (cours c : tabcourspasse) {
            System.out.println(c);   // utilise toString()
        }
    }
    
    // Inscription/desinscription : 
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
      public void desactiverAbonnement() {

        Scanner sc = new Scanner(System.in);

        if (tabclients.size() == 0) {
            System.out.println("Aucun client enregistre.");
            return;
        }

        System.out.print("Entrez le numero du client : ");
        int num = sc.nextInt();

        boolean trouve = false;

        for (client c : tabclients) {
            if (c.getnumero() == num) {
                trouve = true;

                if (c.getabonnement()) {
                    c.setabonnement(false);
                    System.out.println("Abonnement desactive avec succes.");
                } else {
                    System.out.println("L'abonnement est deja desactive.");
                }
            }
        }

        if (!trouve) {
            System.out.println("Client introuvable.");
        }
    }
    
    public void reactiverAbonnement() {

        Scanner sc = new Scanner(System.in);

        if (tabclients.size() == 0) {
            System.out.println("Aucun client enregistre.");
            return;
        }

        System.out.print("Entrez le numero du client : ");
        int num = sc.nextInt();

        boolean trouve = false;

        for (client c : tabclients) {
            if (c.getnumero() == num) {
                trouve = true;

                if (!c.getabonnement()) {
                    c.setabonnement(true);
                    System.out.println("Abonnement reactive avec succes.");
                } else {
                    System.out.println("L'abonnement est deja actif.");
                }
            }
        }

        if (!trouve) {
            System.out.println("Client introuvable.");
        }
    }
    public void rechercherClients() {

        Scanner sc = new Scanner(System.in);

        if (tabclients.size() == 0) {
            System.out.println("Aucun client enregistre.");
            return;
        }

        System.out.println("Recherche client :");
        System.out.println("1 - Par nom");
        System.out.println("2 - Par email");
        System.out.println("3 - Par numero client");
        System.out.println("4 - Par telephone");
        System.out.println("5 - Par adresse");
        System.out.println("6 - Par type abonnement");
        System.out.println("7 - Par etat abonnement (true/false)");
        System.out.println("8 - Prenom");


        int choix = sc.nextInt();
        sc.nextLine(); // vider le buffer

        boolean trouve = false;

        switch (choix) {

            case 1 -> {
                System.out.print("Entrez le nom : ");
                String nom = sc.nextLine();

                for (client c : tabclients) {
                    if (c.getnom().equalsIgnoreCase(nom)) {
                        System.out.println(c);
                        trouve = true;
                    }
                }
            }

            case 2 -> {
                System.out.print("Entrez l'email : ");
                String email = sc.nextLine();

                for (client c : tabclients) {
                    if (c.getemail().equalsIgnoreCase(email)) {
                        System.out.println(c);
                        trouve = true;
                    }
                }
            }

            case 3 -> {
                System.out.print("Entrez le numero client : ");
                int num = sc.nextInt();

                for (client c : tabclients) {
                    if (c.getnumero() == num) {
                        System.out.println(c);
                        trouve = true;
                    }
                }
            }
            case 4 -> {
            System.out.print("Entrez le telephone : ");
            String tel = sc.nextLine();

            for (client c : tabclients) {
                if (c.gettel().equalsIgnoreCase(tel)) {
                    System.out.println(c);
                    trouve = true;
                }
            }
        }

        case 5 -> {
            System.out.print("Entrez l'adresse : ");
            String adresse = sc.nextLine();

            for (client c : tabclients) {
                if (c.getadresse().equalsIgnoreCase(adresse)) {
                    System.out.println(c);
                    trouve = true;
                }
            }
        }

        case 6 -> {
            System.out.print("Entrez le type d'abonnement : ");
            String type = sc.nextLine();

            for (client c : tabclients) {
                if (c.gettypeabonnement().equalsIgnoreCase(type)) {
                    System.out.println(c);
                    trouve = true;
                }
            }
        }

        case 7 -> {
            System.out.print("Entrez l'etat abonnement (true/false) : ");
            boolean etat = sc.nextBoolean();

            for (client c : tabclients) {
                if (c.getabonnement() == etat) {
                    System.out.println(c);
                    trouve = true;
                }
            }
        }
        case 8 -> {
            System.out.println("Entrez le Prenom : ");
            String prenom=sc.nextLine();
            for (client c : tabclients) {
                if (c.geteprenom().equalsIgnoreCase(prenom)) {
                    System.out.println(c);
                    trouve = true;
                }
            }
            
        }

        default -> System.out.println("Choix invalide.");
        }

        if (trouve == false) {
            System.out.println("Aucun client trouve.");
        }
    }
    public void ajouterCours() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ajouter un cours : ");

        System.out.print("ID du cours : ");
        int id = sc.nextInt();
        sc.nextLine();

        // Vérification ID unique
        for (cours c : tabcoursfutur) {
            if (c.getcoursID() == id) {
                System.out.println("Un cours avec cet ID existe deja.");
                return;
            }
        }

        System.out.print("Type de cours (individuel/collectif): ");
        String type = sc.nextLine();

        System.out.print("Activite : ");
        String activite = sc.nextLine();

        System.out.print("Date (format: 2026-03-10T10:00) : ");
        String dateString = sc.nextLine();
        LocalDateTime date = LocalDateTime.parse(dateString);

        System.out.print("Nombre de places : ");
        int nbplace = sc.nextInt();
        sc.nextLine();

        System.out.print("Duree du cours : ");
        String duree = sc.nextLine();

        cours nouveau = new cours(id, type, activite, date, nbplace, duree);

        tabcoursfutur.add(nouveau);

        System.out.println("Cours ajoute avec succes !");
    }
    
    
    public void supprimerCoursFutur() {

    Scanner sc = new Scanner(System.in);

    if (tabcoursfutur.isEmpty()) {
        System.out.println("Aucun cours futur disponible.");
        return;
    }

    System.out.print("Entrez l'ID du cours a supprimer : ");
    int id = sc.nextInt();

    for (cours c : tabcoursfutur) {

        if (c.getcoursID() == id) {

            if (c.getlisteinscrits().size()!=0) {
                System.out.println("Impossible : des clients sont deja inscrits.");
                return;
            }

            tabcoursfutur.remove(c);
            System.out.println("Cours supprime avec succes.");
            return;
        }
    }

    System.out.println("Cours introuvable.");
    }
    
    public void modifierCoursFutur() {

    Scanner sc = new Scanner(System.in);

    if (tabcoursfutur.isEmpty()) {
        System.out.println("Aucun cours futur disponible.");
        return;
    }

    System.out.print("Entrez l'ID du cours a modifier : ");
    int id = sc.nextInt();
    sc.nextLine();

    for (cours c : tabcoursfutur) {

        if (c.getcoursID() == id) {

            if (c.getlisteinscrits().size()!=0) {
                System.out.println("Impossible : des clients sont deja inscrits.");
                return;
            }

            int choix;

            do {
                System.out.println("\nQue voulez-vous modifier ?");
                System.out.println("1 - Type");
                System.out.println("2 - Activite");
                System.out.println("3 - Date");
                System.out.println("4 - Nombre de places");
                System.out.println("5 - Duree");
                System.out.println("0 - Terminer");

                choix = sc.nextInt();
                sc.nextLine();

                switch (choix) {

                    case 1 -> {
                        System.out.print("Nouveau type : ");
                        c.setTypecours(sc.nextLine());
                    }

                    case 2 -> {
                        System.out.print("Nouvelle activite : ");
                        c.setActivite(sc.nextLine());
                    }

                    case 3 -> {
                        System.out.print("Nouvelle date (format 2026-03-10T10:00) : ");
                        c.setDate(LocalDateTime.parse(sc.nextLine()));
                    }

                    case 4 -> {
                        System.out.print("Nouveau nombre de places : ");
                        c.setNbplace(sc.nextInt());
                        sc.nextLine();
                    }

                    case 5 -> {
                        System.out.print("Nouvelle duree : ");
                        c.setDureecours(sc.nextLine());
                    }

                    case 0 -> System.out.println("Modification terminee.");

                    default -> System.out.println("Choix invalide.");
                }

            } while (choix != 0);

            System.out.println("Cours modifie avec succes.");
            return;
        }
    }

    System.out.println("Cours introuvable.");
}

    
    // getters : 
    public List<cours> getTabcoursfutur() {
        return tabcoursfutur;
    }

    public List<cours> getTabcourspasse() {
        return tabcourspasse;
    }

    public List<client> gettabclients() {
        return tabclients;
    }
    
}


    
   
    
    