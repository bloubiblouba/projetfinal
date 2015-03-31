package gestiondereservation;

import java.util.Date;
import java.util.ArrayList;

public class Reservation {

    private int numero_reservation;
    private String date_reservation;
    private int classe;
    private int nombre_places;
    private double acompte;
    private int paiement;

    private ArrayList<Vol> tab_vol;
    private Client client;

    public Reservation(int num_resa, String date_resa, int cl, int nb_places, int prix, double acompte, Vol vol, Client client) {
        numero_reservation = num_resa;
        date_reservation = date_resa;
        classe = cl;
        nombre_places = nb_places;
        tab_vol = new ArrayList();
        tab_vol.add(vol);
        paiement = prix;
        this.acompte = acompte;
        this.client = client;

    }

    public int getNumero_reservation() {
        return numero_reservation;
    }

    public void setNumero_reservation(int numero_reservation) {
        this.numero_reservation = numero_reservation;
    }

    public String getDate_reservation() {
        return date_reservation;
    }

    public void setDate_reservation(String date_reservation) {
        this.date_reservation = date_reservation;
    }

    public int getClasse() {
        return classe;
    }

    public void setClasse(int classe) {
        this.classe = classe;
    }

    public int getNombre_places() {
        return nombre_places;
    }

    public void setNombre_places(int nombre_places) {
        this.nombre_places = nombre_places;
    }

    public double getAcompte() {
        return acompte;
    }

    public void setAcompte(double acompte) {
        this.acompte = acompte;
    }

    public int getPaiement() {
        return paiement;
    }

    public void setPaiement(int paiement) {
        this.paiement = paiement;
    }

    public ArrayList<Vol> getTab_vol() {
        return tab_vol;
    }

    public void setTab_vol(ArrayList<Vol> tab_vol) {
        this.tab_vol = tab_vol;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

}
