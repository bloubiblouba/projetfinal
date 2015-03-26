package gestiondereservation;
import java.util.Date;
import java.util.ArrayList;
        
public class Reservation {
    
    private String numero_reservation;
    private Date date_reservation;
    private String classe;
    private int nombre_places;
    private int acompte;
    private int paiement;

    private ArrayList<Vol>tab_vol;
    private Client client;
    
 
   


public Reservation (String num_resa, Date date_resa, String cl, int nb_places, int ac, int p, Client client){
    numero_reservation= num_resa;
    date_reservation = date_resa;
    classe = cl;
    nombre_places = nb_places;
    acompte = ac;
    paiement = p;

    tab_vol = new ArrayList();
    this.client = client;

}

    public String getNumero_reservation() {
        return numero_reservation;
    }

    public void setNumero_reservation(String numero_reservation) {
        this.numero_reservation = numero_reservation;
    }

    public Date getDate_reservation() {
        return date_reservation;
    }

    public void setDate_reservation(Date date_reservation) {
        this.date_reservation = date_reservation;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getNombre_places() {
        return nombre_places;
    }

    public void setNombre_places(int nombre_places) {
        this.nombre_places = nombre_places;
    }

    public int getAcompte() {
        return acompte;
    }

    public void setAcompte(int acompte) {
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
