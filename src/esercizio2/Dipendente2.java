package esercizio2;
/*
ESERCIZIO 2
ESTENDERE IL PUNTO 1 AGGIUNGENDO 3 ULTERIORI CLASSI:
 * -DIPENDENTEFULLTIME
 * -DIPENDENTEPARTTIME
 * -DIRIGENTE
 * LA CLASSE DIPENDENTE DEVE DIVENTARE ASTRATTA E LE 3 CLASSI DI SOPRA DEVONO
 * EREDITARE DA ESSA. OGNI CLASSE CONCRETA DEVE IMPLEMENTARE IL METODO CALCULATESALARY()
 * IN MODO APPROPRIATO PER IL TIPO DI DIPENDENTE SPECIFICO. AD ESEMPIO, IL SALARIO DI UN DIPENDENTE
 * A TEMPO PIENO POTREBBE ESSERE CALCOLATO IN BASE ALLE ORE LAVORATE.
 * NEL MAIN CREA DIVERSE ISTANZE DI DIPENDENTI (AD ESEMPIO, DIPENDENTI A TEMPO PIENO, DIPENDENTI PART-TIME E DIRIGENTI)
 * METTENDOLI IN UN UNICO ARRAY E CALCOLA I LORO STIPENDI TOTALI. UTILIZZA IL POLIMORFISMO PER
 * TRATTARE TUTTI I DIPENDENTI IN MODO UNIFORME*/

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

public abstract class Dipendente2 {
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
