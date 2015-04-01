package gestiondereservation;

import java.util.ArrayList;

public class Client extends Personne {

    private int numClient;
    private String login;
    private String mdp;
    private ArrayList<Reservation> TabResa;

    public Client(int num, String n, String pm, String t, String nr, String nomr, String v, String c, String log, String mdp) {
        super(n, pm, t, nr, nomr, v, c);
        //numero client auto incrementant et unique
        numClient = num;
        login = log;
        this.mdp = mdp;
        TabResa = new ArrayList();

    }

    public int getNumClient() {
        return numClient;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public ArrayList<Reservation> getTabResa() {
        return TabResa;
    }

    public void setTabResa(ArrayList<Reservation> TabResa) {
        this.TabResa = TabResa;
    }
    
    public void addTabResa(Reservation r)
    {
        TabResa.add(r);
    }
}
