package it.bianco;

public class Spettacolo {
    private static final int CAPIENZA = 30;  
    private int disponibilita = CAPIENZA;

   
    public int postiDisponibili(){
        
        
        return getDisponibilita(); 
    }


    public void prenotazione(int prenotazioni){
        if(prenotazioni < disponibilita && prenotazioni > 0){
            disponibilita -= prenotazioni;
            System.out.println("Prenotazione accettata. I posti disponibili sono: " + disponibilita);
        }
    }

    //get and set

    public int getCapienza() {
        return CAPIENZA;
    }


    public int getDisponibilita() {
        return disponibilita;
    }

    public void setDisponibilita(int disponibilita) {
        this.disponibilita = disponibilita;
    }

    @Override
    public String toString() {
        return "Spettacolo [capienza=" + CAPIENZA + ", disponibilita=" + disponibilita + "]";
    }

    

}
