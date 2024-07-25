package esercizio3;

import interfaces.InizioTurno;

/*ESERCIZIO 3
 * ESTENDERE IL PUNTO 2 AGGIUNGENDO LA CLASSE VOLONTARIO CON LE SEGUENTI CARATTERISTICHE:
 * -ETA
 * -NOME
 * -CV
 * DEFINIRE UN INTERFACCIA CON UN METODO CHECKIN() COMUNE A DIPENDENTE E VOLONTARIO CHE INDICA QUANDO
 * UN DIPENDENTE INIZIA IL SUO TURNO DI LAVORO O QUANDO UN VOLONTARIO INIZIA IL SUO
 * SERVIZIO (BASTA UN PRINT IN CONSOLE)
 * NEL MAIN CREARE UN ARRAY CON DIPENDENTI E VOLONTARI E CHIAMARE IL METODO CHECKIN PER OGNUNO DI ESSI*/
public class Volontario implements InizioTurno {
    private int eta;
    private String nome;
    private String cv;

    public Volontario(int e, String n, String cv) {
        this.eta = e;
        this.nome = n;
        this.cv = cv;
    }

    @Override
    public void chekIn() {
        System.out.println("Il volontario inizia il turno alle 18");
    }
}
