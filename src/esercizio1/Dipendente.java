package esercizio1;
/*SCRIVERE LA CLASSE DIPENDENTE CON I SEGUENTI ATTRIBUTI:
 *
 * - MATRICOLA: IDENTIFICATIVO UNIVOCO DEL DIPENDENTE
 * - STIPENDIO: NUMERO DECIMALE CON STIPENDIO BASE MENSILE CALCOLATO PER DIPENDENTE
 * - DIPARTIMENTO: VALORI POSSIBILI [PRODUZIONE, AMMINISTRAZIONE, VENDITE]
 * LE PROPIETA DEVONO ESSERE ACCESSIBILI SOLO DALLA CLASSE DIPENDENTE E DEVE ESSERE POSSIBILE
 * LEGGERLE TRAMITE OPPORTUNI METODI GETTER MA NON MODIFICARLE, TRANNE LA PROPRIETA DIPARTIMENTO
 * CHE PUP ESSERE MODIFICATA DA ALTRE CLASSI TRAMITE SETTER.
 * ISTANZIARE 3 DIPENDENTI NEL MAIN, CREARE UN ARRAY CON ESSI ED ITERARE SU OGNUNO
 * DI ESSI STAMPANDO LA MATRICOLA DI OGNI DIPENDENTE.
 *  */


import enums.ValoriPossibiliDipartimento;

public class Dipendente {
    private String matricola;
    private double stipendio;
    private ValoriPossibiliDipartimento dipartimento;

    public Dipendente(String m, double s, ValoriPossibiliDipartimento d) {
        this.matricola = m;
        this.stipendio = s;
        this.dipartimento = d;
    }

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
