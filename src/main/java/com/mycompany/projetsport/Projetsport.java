/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetsport;

/**
 *
 * @author vivic
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Projetsport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        plateforme plateforme=new plateforme("test");
        /*
        ArrayList<client> listeClients = new ArrayList<>();
        listeClients.add(new client("mdp1", "client1@email.com", 1, "Dupont", "Jean", "123456789", "1 rue de Paris", "trimestriel"));
        listeClients.add(new client("mdp2", "client2@email.com", 2, "Martin", "Pierre", "987654321", "2 avenue de Lyon","annuel"));
        for (client client : listeClients) {
            System.out.println(client);
    
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
        plateforme.creerCompteClient();
        client clientConnecte = null;
        while (clientConnecte == null) {
            clientConnecte = plateforme.seconnecterclient();
        }
        //test de connexion admin
        plateforme.creerCompteAdmin();
        admin adminConnecte = null;
        while (adminConnecte == null) {
            adminConnecte = plateforme.seconnecteradmin();
        }

        

    }
}
