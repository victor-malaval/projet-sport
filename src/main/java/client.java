/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vivic
 */
public class client extends utilisateur {
    public int numero;
    public String nom;
    public String prenom;
    public int tel;
    public String adresse;
    public boolean abonnement;

    public client(String valMDP, String valemail, int valnumero, String valnom, String valprenom, int valtel, String valadresse){
        super(valMDP, valemail);
        this.numero = valnumero;
        this.nom = valnom;
        this.prenom = valprenom;
        this.tel = valtel;
        this.adresse = valadresse;
        
    }
    public void Afficher(){
        System.out.println(this.MDP+this.email+this.numero+this.nom+this.prenom+this.tel+this.adresse); 
    }
}
