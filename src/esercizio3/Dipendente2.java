package esercizio3;


/*ESERCIZIO 3
 * ESTENDERE IL PUNTO 2 AGGIUNGENDO LA CLASSE VOLONTARIO CON LE SEGUENTI CARATTERISTICHE:
 * -ETA
 * -NOME
 * -CV
 * DEFINIRE UN INTERFACCIA CON UN METODO CHECKIN() COMUNE A DIPENDENTE E VOLONTARIO CHE INDICA QUANDO
 * UN DIPENDENTE INIZIA IL SUO TURNO DI LAVORO O QUANDO UN VOLONTARIO INIZIA IL SUO
 * SERVIZIO (BASTA UN PRINT IN CONSOLE)
 * NEL MAIN CREARE UN ARRAY CON DIPENDENTI E VOLONTARI E CHIAMARE IL METODO CHECKIN PER OGNUNO DI ESSI*/

import enums.ValoriPossibiliDipartimento;
import interfaces.InizioTurno;

public abstract class Dipendente2 implements InizioTurno {
    private String matricola;
    private double stipendio;
    private ValoriPossibiliDipartimento dipartimento;

    public Dipendente2(String m, ValoriPossibiliDipartimento d) {
        this.matricola = m;
        this.stipendio = 1500;
        this.dipartimento = d;
    }

    public abstract void calculateSalary(double value);

    /*Getters e setters*/

    public String getMatricola() {
        return matricola;
    }


    public double getStipendio() {
        return stipendio;
    }


    public ValoriPossibiliDipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(ValoriPossibiliDipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }
}
