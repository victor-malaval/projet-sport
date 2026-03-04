/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetsport;

/**
 *
 * @author vivic
 */
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;


public class Projetsport {
    public static void main(String[] args) {
        
//        // test toString Client
//        ArrayList<client> listeClients = new ArrayList<>();
//        listeClients.add(new client("mdp1", "client1@email.com", 1, "Dupont", "Jean", "123456789", "1 rue de Paris", "trimestriel"));
//        listeClients.add(new client("mdp2", "client2@email.com", 2, "Martin", "Pierre", "987654321", "2 avenue de Lyon","annuel"));
//        for (client client : listeClients) {
//            System.out.println(client);
    
//        /*test creation comte client*/
//        plateforme.creerCompteClient();
//        /*test affichage client*/
//        plateforme.afficherClient();
//        /*test creation comte admin*/
//        plateforme.creerCompteAdmin();
//        /*test affichage admint*/
//        plateforme.afficherAdmin();
//        
        //test de connexion client 
//        plateforme.creerCompteClient();
//        client clientConnecte = null;
//        while (clientConnecte == null) {
//            clientConnecte = plateforme.seconnecterclient();
//        }
          // fin test connexion client
          
          
//        //test de connexion admin
//        plateforme.creerCompteAdmin();
//        admin adminConnecte = null;
//        while (adminConnecte == null) {
//            adminConnecte = plateforme.seconnecteradmin();
//        }
          // fin test connexion admin 
          
          
          //test de mise a jour infos clients et mdp puis consulter les infos clients
//        plateforme.creerCompteClient();
//
//        client clientConnecte = null;
//        while (clientConnecte == null) {
//            clientConnecte = plateforme.seconnecterclient();
//        }
//        plateforme.miseajourinfosclient(clientConnecte);
//        clientConnecte.miseajourmdp();
//        plateforme.consulterinfosclient(clientConnecte);
//        
//        //test de mise a jour mdp admin
//        plateforme.creerCompteAdmin();
//        admin adminConnecte = null;
//        while (adminConnecte == null) {
//            adminConnecte = plateforme.seconnecteradmin();
//        }
//        adminConnecte.miseajourmdp();
//        System.out.println(adminConnecte);
          // fin test misemise a jour infos clients et mdp puis consulter les infos clients
          
//         //test des cours clients (consulteractivite, consultercoursfutur, inscrire cours, desinscrire cours, consulter cours inscrit et consultercourspassé)
//        client c1 = new client("mdp", "mail@test.com", 1,
//                "Dupont", "Jean", "0600000000",
//                "1 rue Paris", "annuel");


//        // Création cours futurs
//        cours cours1 = new cours(1, "Collectif", "Yoga",
//                LocalDateTime.now().plusDays(2),
//                5, "1h");
//
//        cours cours2 = new cours(2, "Collectif", "Boxe",
//                LocalDateTime.now().plusDays(5),
//                2, "1h");
//
//        // Création cours passé
//        cours cours3 = new cours(3, "Collectif", "Pilates",
//                LocalDateTime.now().minusDays(5),
//                5, "1h");
//
//        // Ajouter aux listes de la plateforme
//        plateforme.getTabcoursfutur().add(cours1);
//        plateforme.getTabcoursfutur().add(cours2);
//        plateforme.getTabcourspasse().add(cours3);
//
//        
//        // Voir tous les cours futurs
//        plateforme.consulterlistecoursfutur();
//
//        //  Voir les activités futures
//        plateforme.consulterActivitesfutur();
//
//        //  Inscrire au cours ID 1
//        plateforme.inscrireCours(c1, 1);
//
//        //  Consulter les cours où le client est inscrit
//        plateforme.consultercoursinscrit(c1);
//
//        //  Désinscrire du cours ID 1
//        plateforme.desinscrireCours(c1, 1);
//
//        //  Vérifier qu’il n’est plus inscrit
//        plateforme.consultercoursinscrit(c1);
//
//        //  Consulter cours passés (aucune inscription normalement)
//        plateforme.consultercourspasse(c1);
//        // fin test cours client

//          // test rechercher client 
//         client c1 = new client("mdp", "mail@test.com", 1,
//                "Dupont", "Jean", "0600000000",
//                "1 rue Paris", "annuel");
//         c1.setabonnement(false);
//        client c2 = new client("mdp2", "marie@mail.com", 2,
//                "Martin", "Marie", "0700000000",
//                "Lyon", "trimestriel");
//
//        c2.setabonnement(false);
//
//        client c3 = new client("mdp3", "paul@mail.com", 3,
//                "Dupont", "Paul", "0800000000",
//                "Marseille", "annuel");
//
//        c3.setabonnement(true);
//        // Ajouter les clients à la plateforme
//        plateforme.gettabclients().add(c1);
//        plateforme.gettabclients().add(c2);
//        plateforme.gettabclients().add(c3);
//
//        // Lancer la recherche
//        plateforme.rechercherClients();


//        // test activation/desactivation d'un compte client par l'admin
//        client c2 = new client("mdp2", "marie@mail.com", 2,
//                "Martin", "Marie", "0700000000",
//                "Lyon", "trimestriel");
//
//        c2.setabonnement(true);
//        plateforme.gettabclients().add(c2);
//        plateforme.consulterClients();     // voir etat actuel
//
//        plateforme.desactiverAbonnement();
//
//        plateforme.consulterClients();     // verifier changement
//
//        plateforme.reactiverAbonnement();
//
//        plateforme.consulterClients();


         // test d'ajout de cours
//        plateforme.ajouterCours();
//        plateforme.consulterlistecoursfutur();


//         // test de modif cours et supprimer cours
//        cours c1 = new cours(1, "Collectif", "Yoga",
//                LocalDateTime.of(2026, 3, 10, 10, 0),
//                10, "1h");
//
//        cours c2 = new cours(2, "Individuel", "Boxe",
//                LocalDateTime.of(2026, 3, 15, 14, 0),
//                5, "1h");
//        // Ajout des cours dans la plateforme
//        plateforme.getTabcoursfutur().add(c1);
//        plateforme.getTabcoursfutur().add(c2);
//        
//        client cl1 = new client("mdp2", "marie@mail.com", 2,
//                "Martin", "Marie", "0700000000",
//                "Lyon", "trimestriel");
//
//        // On active l’abonnement
//         cl1.setabonnement(true);
//
//         //  On inscrit le client au cours
//        plateforme.inscrireCours(cl1, 1);
//
//
//        // Affichage avant modification
//        plateforme.consulterlistecoursfutur();
//
//        // Test modification
//        plateforme.modifierCoursFutur();
//        plateforme.consulterlistecoursfutur();
//
//        // Test suppression
//        plateforme.supprimerCoursFutur();
//        plateforme.consulterlistecoursfutur();



//          // test des methodes consultercoursparActivte et consultercourspasse pour un admin
//          // Création des cours futurs 
//        cours futur1 = new cours(1, "Collectif", "Yoga",
//                LocalDateTime.of(2026, 3, 10, 10, 0),
//                10, "1h");
//
//        cours futur2 = new cours(2, "Individuel", "Boxe",
//                LocalDateTime.of(2026, 3, 15, 14, 0),
//                5, "1h");
//
//        // Création des cours passés 
//        cours passe1 = new cours(3, "Collectif", "Yoga",
//                LocalDateTime.of(2025, 12, 10, 10, 0),
//                10, "1h");
//
//        cours passe2 = new cours(4, "Individuel", "Pilates",
//                LocalDateTime.of(2025, 11, 20, 16, 0),
//                5, "1h");
//
//        // Ajout des cours à la plateforme
//        plateforme.getTabcoursfutur().add(futur1);
//        plateforme.getTabcoursfutur().add(futur2);
//
//        plateforme.getTabcourspasse().add(passe1);
//        plateforme.getTabcourspasse().add(passe2);
//
//        // Test consulterCoursParActivite
//        plateforme.consulterCoursParActivite();
//
//        //  Test consulterCoursPasse (affiche tous les cours passés)
//        plateforme.consulterCoursPasse();
//         // Test consulterCoursFutur (affiche tous les cours futur)
//        plateforme.consulterlistecoursfutur();


        // test de la methode coursLesPlusPopulaires
        
//        //  Création des cours
//        cours c1 = new cours(1, "Collectif", "Yoga",
//                LocalDateTime.of(2026, 3, 10, 10, 0),
//                10, "1h");
//
//        cours c2 = new cours(2, "Collectif", "Boxe",
//                LocalDateTime.of(2026, 3, 12, 14, 0),
//                10, "1h");
//
//        cours c3 = new cours(3, "Collectif", "Pilates",
//                LocalDateTime.of(2026, 3, 15, 16, 0),
//                10, "1h");
//
//        // Ajout à la plateforme
//        plateforme.getTabcoursfutur().add(c1);
//        plateforme.getTabcoursfutur().add(c2);
//        plateforme.getTabcoursfutur().add(c3);
//
//        //  Création des clients 
//        client cl1 = new client("mdp1", "a@mail.com", 1,
//                "Dupont", "Alice", "0700000001",
//                "Paris", "mensuel");
//
//        client cl2 = new client("mdp2", "b@mail.com", 2,
//                "Martin", "Bob", "0700000002",
//                "Lyon", "mensuel");
//
//        client cl3 = new client("mdp3", "c@mail.com", 3,
//                "Bernard", "Clara", "0700000003",
//                "Marseille", "annuel");
//
//        // Activer abonnements
//        cl1.setabonnement(true);
//        cl2.setabonnement(true);
//        cl3.setabonnement(true);
//
//        // --- Inscriptions ---
//        // Yoga aura 2 inscrits
//        plateforme.inscrireCours(cl1, 1);
//        plateforme.inscrireCours(cl2, 1);
//
//        // Boxe aura 1 inscrit
//        plateforme.inscrireCours(cl3, 2);
//
//        // Test méthode
//        plateforme.coursLesPlusPopulaires();
        
//        
//        // test de la methode coursLesMoinsPopulaires 
//         // Création des cours
//        cours c1 = new cours(1, "Collectif", "Yoga",
//                LocalDateTime.of(2026, 3, 10, 10, 0),
//                10, "1h");
//
//        cours c2 = new cours(2, "Collectif", "Boxe",
//                LocalDateTime.of(2026, 3, 12, 14, 0),
//                5, "1h");
//
//        cours c3 = new cours(3, "Individuel", "tennis",
//                LocalDateTime.of(2026, 3, 15, 9, 0),
//                1, "1h");
//
//        //  Ajout à la plateforme
//        plateforme.getTabcoursfutur().add(c1);
//        plateforme.getTabcoursfutur().add(c2);
//        plateforme.getTabcoursfutur().add(c3);
//
//        // Création des clients 
//        client cl1 = new client("mdp1", "a@mail.com", 1,
//                "Dupont", "Alice", "0700000001",
//                "Paris", "mensuel");
//
//        client cl2 = new client("mdp2", "b@mail.com", 2,
//                "Martin", "Bob", "0700000002",
//                "Lyon", "mensuel");
//
//        cl1.setabonnement(true);
//        cl2.setabonnement(true);
//
//        //  Inscriptions
//        plateforme.inscrireCours(cl1, 1);  
//        plateforme.inscrireCours(cl2, 2);  
//        plateforme.inscrireCours(cl1, 2);
//        plateforme.inscrireCours(cl2, 3);
//  
//        plateforme.coursLesMoinsPopulaires();  // test methode
        
        
        // test de chargement + sauvegarde des données 
       
try {
            // Création de la plateforme
            plateforme plateforme = new plateforme("sauvegarde.txt");

            // Création de clients 
            client c1 = new client("mdp1", "alice@mail.com", 1,
                    "Dupont", "Alice", "0600000001", "Paris", "mensuel");
            c1.setabonnement(true);

            client c2 = new client("mdp2", "bob@mail.com", 2,
                    "Martin", "Bob", "0600000002", "Lyon", "mensuel");
            c2.setabonnement(true);

            plateforme.gettabclients().add(c1);
            plateforme.gettabclients().add(c2);

            // Création d’admins
            admin a1 = new admin("adminmdp", "admin@mail.com");
            plateforme.gettabadmin().add(a1);

            //  Création de cours 
            cours cr1 = new cours(1, "Collectif", "Yoga",
                    LocalDateTime.of(2026, 3, 10, 10, 0), 10, "1h");
            cours cr2 = new cours(2, "Individuel", "Boxe",
                    LocalDateTime.of(2026, 3, 15, 14, 0), 5, "1h");

            // Inscription d’un client pour tester
            cr1.getlisteinscrits().add(c1);

            plateforme.getTabcoursfutur().add(cr1);
            plateforme.getTabcoursfutur().add(cr2);

            //Affichage des données
            System.out.println("Clients : ");
            plateforme.afficherClient();
            System.out.println("Admins : ");
            plateforme.afficherAdmin();
            System.out.println("Cours futurs : ");
            plateforme.consulterlistecoursfutur();

            //Chemin du fichier
            File file = new File("sauvegarde.txt");
            System.out.println("\nFichier sauvegarde attendu ici : " + file.getAbsolutePath());

            // Sauvegarde
            plateforme.sauvegarder();
            System.out.println("\nDonnees sauvegardees avec succes !");

        } catch (IOException e) {
            System.out.println("Erreur lors du chargement ou de la sauvegarde : " + e.getMessage());
        }
    }
}
