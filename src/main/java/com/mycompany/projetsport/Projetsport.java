/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetsport;

/**
 *
 * @author vivic
 */
import java.time.LocalDateTime;


public class Projetsport {
    public static void main(String[] args) {
        plateforme plateforme=new plateforme("test");
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
          
         //test des cours clients (consulteractivite, consultercoursfutur, inscrire cours, desinscrire cours, consulter cours inscrit et consultercourspassé)
        client c1 = new client("mdp", "mail@test.com", 1,
                "Dupont", "Jean", "0600000000",
                "1 rue Paris", "annuel");


        // Création cours futurs
        cours cours1 = new cours(1, "Collectif", "Yoga",
                LocalDateTime.now().plusDays(2),
                5, "1h");

        cours cours2 = new cours(2, "Collectif", "Boxe",
                LocalDateTime.now().plusDays(5),
                2, "1h");

        // Création cours passé
        cours cours3 = new cours(3, "Collectif", "Pilates",
                LocalDateTime.now().minusDays(5),
                5, "1h");

        // Ajouter aux listes de la plateforme
        plateforme.getTabcoursfutur().add(cours1);
        plateforme.getTabcoursfutur().add(cours2);
        plateforme.getTabcourspasse().add(cours3);

        
        // Voir tous les cours futurs
        plateforme.consulterlistecoursfutur();

        //  Voir les activités futures
        plateforme.consulterActivitesfutur();

        //  Inscrire au cours ID 1
        plateforme.inscrireCours(c1, 1);

        //  Consulter les cours où le client est inscrit
        plateforme.consultercoursinscrit(c1);

        //  Désinscrire du cours ID 1
        plateforme.desinscrireCours(c1, 1);

        //  Vérifier qu’il n’est plus inscrit
        plateforme.consultercoursinscrit(c1);

        //  Consulter cours passés (aucune inscription normalement)
        plateforme.consultercourspasse(c1);
        // fin test cours client


    }
}
