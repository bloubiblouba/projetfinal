package gestiondereservation;

import java.util.ArrayList;
import java.util.Date;

public class GestionDeReservation {

    private ArrayList<Personne> TabPers;
    private ArrayList<Client> TabClient;
    private ArrayList<Vol> TabVol;
    private ArrayList<Aeroport> TabAeroport;
    private Client admin, client1;
    private Aeroport aeroport1, aeroport2, aeroport3, aeroport4;
//Constructeur de main

    public GestionDeReservation() {
        //Tableau qui stocke les personnes
        TabPers = new ArrayList();
        TabClient = new ArrayList();
        TabVol = new ArrayList();
        TabAeroport = new ArrayList();

        admin = new Client("Tartampion", "Patapouf", "0666666666", "01", "Champs Elysées", "Paris", "75016", "admin", "admin");
        client1 = new Client("Jean-Jacques", "Patalucci", "0666666666", "01", "Champs Elysées", "Paris", "75016", "admin", "admin");
        aeroport1 = new Aeroport ("PAPETE123", "Papeete", "Rue de l'île", "06 65 48 75 95");
        aeroport2 = new Aeroport ("BERLIN456", "Berlin", "Rue de l'Allemagne", "87 95 68 54 47");
        aeroport3 = new Aeroport ("PORTAU789", "Port au Prince", "Rue de Faubert", "98 65 32 65 45");
        aeroport4 = new Aeroport ("SIDNEY852", "Sidney", "Rue du Kangourou", "98 65 46 31 32");
        
        TabClient.add(admin);
        TabClient.add(client1);
        TabAeroport.add(aeroport1);
        TabAeroport.add(aeroport2);
        TabAeroport.add(aeroport3);
        TabAeroport.add(aeroport4);
    }

    public Personne CreerPersonne(String n, String pm, String t, String nr, String nomr, String v, String c) {
        Personne p;
        p = new Personne(n, pm, t, nr, nomr, v, c);
        TabPers.add(p);
        return p;
    }
    
    public Aeroport CreerAeroport (String num_a, String nom_a, String ad, String tel){
        Aeroport a;
        a = new Aeroport (num_a, nom_a, ad, tel);
        TabAeroport.add(a);
        return a;
    }
    
    public Client CreerClient(String n, String pm, String t, String nr, String nomr, String v, String c, String log, String mdp) {
        Client cli;
        cli = new Client(n, pm, t, nr, nomr, v, c, log, mdp);
        TabClient.add(cli);
        System.out.println(TabClient.size());
        return cli;
    }

    public ArrayList<Personne> rechercherPersonne(String p) {

        ArrayList<Personne> listepers;
        listepers = new ArrayList();
        if (!TabPers.isEmpty()) {
            for (int i = 0; i < TabPers.size(); i++) {
                if (TabPers.get(i).getNom().equalsIgnoreCase(p) && TabPers.get(i).getPrenom().equalsIgnoreCase(p)) {
                    listepers.add(TabPers.get(i));
                }
            }
        }
        return listepers;
    }

    public int testPersonne(String n, String p) {
        int t = 0;

        if (!TabClient.isEmpty()) {
            for (int i = 0; i < TabClient.size(); i++) {
                if (TabClient.get(i).getNom().equalsIgnoreCase(n) && TabClient.get(i).getPrenom().equalsIgnoreCase(p)) {
                    t = 1;

                }
            }
        }
        return t;
    }
    
    public ArrayList<Aeroport> ListeAeroport ()
    {
        //Dans le projet, retourner un seul vol spécifique
        ArrayList<Aeroport> list;
        list = new ArrayList();
        if (!TabAeroport.isEmpty()){
            for (int i = 0; i<TabAeroport.size();i++)
            {
               
                    list.add(TabAeroport.get(i));
                }
                
            }
        return list;
    }
    public ArrayList<Vol> ListeVol ()
    {
        //Dans le projet, retourner un seul vol spécifique
        ArrayList<Vol> list;
        list = new ArrayList();
        if (!TabVol.isEmpty()){
            for (int i = 0; i<TabVol.size();i++)
            {
               
                    list.add(TabVol.get(i));
                }
                
            }
        return list;
    }
    
    
    public ArrayList<Client> listeClient(){
        ArrayList<Client> list;
        list = new ArrayList();
        if (!TabClient.isEmpty()){
            for (int i = 0; i<TabClient.size();i++)
            {
               
                    list.add(TabClient.get(i));
                }
                
            }
        return list;
        
    }
    
    public int testLogin(String l, String p) {
        int t = 0;

        if (!TabClient.isEmpty()) {
            for (int i = 0; i < TabClient.size(); i++) {
                if (TabClient.get(i).getLogin().equalsIgnoreCase(l) && TabClient.get(i).getMdp().equalsIgnoreCase(p)) {
                    t = 1;
                    
                }

            }
        }
        return t;
    }

    public String retourneNom(String login) {
        String nom = new String();
        if (!TabClient.isEmpty()) {
            for (int i = 0; i < TabClient.size(); i++) {
                if (TabClient.get(i).getLogin().equalsIgnoreCase(login)) {

                    nom = TabClient.get(i).getNom();
                    System.out.println(nom);

                }

            }
        }
        return nom;
    }    
     
    public Vol CreerVol(String nv, String dd, String da, String hd, String ha, String px1, String q1, String px2, String q2,Aeroport ori,Aeroport dest)
    {
         Vol a;
        a = new Vol (nv,dd,da,hd,ha,px1,q1,px2,q2,ori,dest);
        TabVol.add(a);
        return a;
        
    }
    
    public int testVol (String num){
                int t = 0;

        if (!TabVol.isEmpty()) {
            for (int i = 0; i < TabVol.size(); i++) {
                if (TabVol.get(i).getNumero_vol().equalsIgnoreCase(num)) {
                    t = 1;
                    
                }

            }
        }
        return t;
        
    }
    
    
    public ArrayList<Aeroport> getTab_aeroport() {
        return TabAeroport;
    }
    

    public static void main(String[] args) {
    }

}
