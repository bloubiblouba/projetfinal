package gestiondereservation;

import java.util.ArrayList;
import java.util.Date;

public class GestionDeReservation {

    private ArrayList<Personne> TabPers;
    private ArrayList<Client> TabClient;
    private ArrayList<Vol> TabVol;
    private ArrayList<Aeroport> TabAeroport;
    private ArrayList<Reservation> TabResa;
    private Client admin, client1;
    private Vol vol1, vol2;
    private Aeroport aeroport1, aeroport2, aeroport3, aeroport4;
    private Reservation resa1;
//Constructeur de main

    public GestionDeReservation() {
        //Tableau qui stocke les personnes
        TabPers = new ArrayList();
        TabClient = new ArrayList();
        TabVol = new ArrayList();
        TabAeroport = new ArrayList();
        TabResa = new ArrayList();

        admin = new Client(1,"Agent Tartampion", "Patapouf", "0666666666", "01", "Champs Elysées", "Paris", "75016", "admin", "admin");
        client1 = new Client(2,"Michel", "Patalucci", "0666666666", "01", "Champs Elysées", "Paris", "75016", "client", "client");
        aeroport1 = new Aeroport("PAPETE123", "Papeete", "Rue de l'île", "06 65 48 75 95");
        aeroport2 = new Aeroport("BERLIN456", "Berlin", "Rue de l'Allemagne", "87 95 68 54 47");
        aeroport3 = new Aeroport("PORTAU789", "Port au Prince", "Rue de Faubert", "98 65 32 65 45");
        aeroport4 = new Aeroport("SIDNEY852", "Sidney", "Rue du Kangourou", "98 65 46 31 32");
        
        TabClient.add(admin);
        TabClient.add(client1);
        TabAeroport.add(aeroport1);
        TabAeroport.add(aeroport2);
        TabAeroport.add(aeroport3);
        TabAeroport.add(aeroport4);

        vol1 = new Vol("123", "15/04", "16/04", "20:04", "05:06", 12, 115, 45, 48, TabAeroport.get(0), TabAeroport.get(1));
        vol2 = new Vol("52", "14/04", "15/04", "18:04", "06:05", 12, 114, 45, 78, TabAeroport.get(2), TabAeroport.get(3));
        TabVol.add(vol1);
        TabVol.add(vol2);
        
        resa1 = new Reservation(1,"25-03-2015",1,2,1200,240,vol1, client1);
        TabResa.add(resa1);

        aeroport1.setVolsOrigine(vol1);
        aeroport2.setVolsDestination(vol1);
        aeroport3.setVolsOrigine(vol2);
        aeroport4.setVolsDestination(vol2);
    }

    public ArrayList<Vol> getTabVol() {
        return TabVol;
    }

    public ArrayList<Reservation> getTabResa() {
        return TabResa;
    }

    public Personne CreerPersonne(String n, String pm, String t, String nr, String nomr, String v, String c) {
        Personne p;
        p = new Personne(n, pm, t, nr, nomr, v, c);
        TabPers.add(p);
        return p;
    }

    public Aeroport CreerAeroport(String num_a, String nom_a, String ad, String tel) {
        Aeroport a;
        a = new Aeroport(num_a, nom_a, ad, tel);
        TabAeroport.add(a);
        return a;
    }

    public Client CreerClient(String n, String pm, String t, String nr, String nomr, String v, String c, String log, String mdp) {
        Client cli;
        int i = TabResa.size();
        i++;
        cli = new Client(i,n, pm, t, nr, nomr, v, c, log, mdp);
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

    public ArrayList<Aeroport> ListeAeroport() {
        //Dans le projet, retourner un seul vol spécifique
        ArrayList<Aeroport> list;
        list = new ArrayList();
        if (!TabAeroport.isEmpty()) {
            for (int i = 0; i < TabAeroport.size(); i++) {

                list.add(TabAeroport.get(i));
            }

        }
        return list;
    }

    public ArrayList<Vol> ListeVol() {
        //Dans le projet, retourner un seul vol spécifique
        ArrayList<Vol> list;
        list = new ArrayList();
        if (!TabVol.isEmpty()) {
            for (int i = 0; i < TabVol.size(); i++) {

                list.add(TabVol.get(i));
            }

        }
        return list;
    }

    public ArrayList<Client> listeClient() {
        ArrayList<Client> list;
        list = new ArrayList();
        if (!TabClient.isEmpty()) {
            for (int i = 0; i < TabClient.size(); i++) {

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

    public Client getClient(String l, String p) {
        Client a = null;

        if (!TabClient.isEmpty()) {
            for (int i = 0; i < TabClient.size(); i++) {
                if (TabClient.get(i).getLogin().equalsIgnoreCase(l) && TabClient.get(i).getMdp().equalsIgnoreCase(p)) {
                    a = TabClient.get(i);

                }

            }
        }
        return a;
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

    public Vol CreerVol(String nv, String dd, String da, String hd, String ha, int px1, int q1, int px2, int q2, Aeroport ori, Aeroport dest) {
        Vol a;
        a = new Vol(nv, dd, da, hd, ha, px1, q1, px2, q2, ori, dest);
        TabVol.add(a);
        return a;

    }

    public int testVol(String num) {
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

    public int testAeroport(String num, String nom, String adresse, String tel) {
        int t = 0;
        if (!num.isEmpty() && !nom.isEmpty() && !adresse.isEmpty() && !tel.isEmpty()) {
            t = 1;
        }

        if (!TabAeroport.isEmpty()) {
            for (int i = 0; i < TabAeroport.size(); i++) {
                if (TabAeroport.get(i).getNumero_aeroport().equalsIgnoreCase(num)) {
                    t = 1;

                }

            }
        }
        return t;

    }

    public Vol RechercherVol(String nomorigine, String nomdest) {
        Vol v, trouve = null;
        int i = 0;
        if (!TabVol.isEmpty()) {
            while (i < TabVol.size() && trouve == null) {

                v = TabVol.get(i);
                if (v.getAeroOri().getNom_aeroport().equalsIgnoreCase(nomorigine) && v.getAeroDest().getNom_aeroport().equalsIgnoreCase(nomdest)) {
                    trouve = v;
                }
                i++;
            }
        }
        return trouve;
    }

    public Reservation RechercherResa(int num) {
        Reservation v, trouve = null;
        int i = 0;
        if (!TabResa.isEmpty()) {
            while (i < TabResa.size() && trouve == null) {

                v = TabResa.get(i);
                if (v.getNumero_reservation() == num) {
                    trouve = v;
                }
                i++;
            }
        }
        return trouve;
    }

    public ArrayList<Aeroport> getTab_aeroport() {
        return TabAeroport;
    }

    public Reservation CreerResa(String date_resa, int cl, int nb_places, int prix, Vol vol, Client client) {
        Reservation a;
        //numero resa auto incrementant
        int i = TabResa.size();
        i++;

        int ac = prix /5;

        a = new Reservation(i, date_resa, cl, nb_places, prix, ac, vol, client);
        TabResa.add(a);
        return a;

    }
    
    public void SupprimerResa(Reservation r)
    {
        TabResa.remove(r);
    }

    public static void main(String[] args) {
    }

}
