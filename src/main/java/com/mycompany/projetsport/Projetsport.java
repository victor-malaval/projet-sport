/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetsport;

/**
 *
 * @author vivic
 */
import java.util.ArrayList;

public class Projetsport {
    public static void main(String[] args) {
        /*test affichage client*/
        ArrayList<client> listeClients = new ArrayList<>();
        listeClients.add(new client("mdp1", "client1@email.com", 1, "Dupont", "Jean", "123456789", "1 rue de Paris", "trimestriel"));
        listeClients.add(new client("mdp2", "client2@email.com", 2, "Martin", "Pierre", "987654321", "2 avenue de Lyon","annuel"));
        for (client client : listeClients) {
            System.out.println(client);
    
        }
        /*test creation comte client*/
        plateforme plateforme=new plateforme("sauvegarde.txt", 60);
        plateforme.creerCompteClient();
        System.out.println(plateforme);

    }
}
