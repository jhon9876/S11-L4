package esercizio1;
/*SCRIVERE LA CLASSE DIPENDENTE CON I SEGUENTI ATTRIBUTI:
 *
 * - MATRICOLA: IDENTIFICATIVO UNIVOCO DEL DIPENDENTE
 * - STIPENDIO: NUMERO DECIMALE CON STIPENDIO BASE MENSILE CALCOLATO PER DIPENDENTE
 * - DIPARTIMENTO: VALORI POSSIBILI [PRODUZIONE, AMMINISTRAZIONE, VENDITE]
 * LE PROPEITA DEVONO ESSERE ACCESSIBILI SOLO DALLA CLASSE DIPENDENTE E DEVE ESSERE POSSIBILE
 * LEGGERLE TRAMITE OPPORTUNI METODI GETTER MA NON MODIFICARLE, TRANNE LA PROPRIETA DIPARTIMENTO
 * CHE PUP ESSERE MODIFICATA DA ALTRE CLASSI TRAMITE SETTER.
 * ISTANZIARE 3 DIPENDENTI NEL MAIN, CREARE UN ARRAY CON ESSI ED ITERARE SU OGNUNO
 * DI ESSI STAMPANDO LA MATRICOLA DI OGNI DIPENDENTE.
 *  */


import enums.ValoriPossibiliDipartimento;

public class Main {
    public static void main(String[] args) {


        Dipendente dipendente1 = new Dipendente("1230", 1500, ValoriPossibiliDipartimento.PRODUZIONE);
        Dipendente dipendente2 = new Dipendente("12345", 1700, ValoriPossibiliDipartimento.AMMINISTRAZIONE);
        Dipendente dipendente3 = new Dipendente("12311", 2500, ValoriPossibiliDipartimento.VENDITE);

        Dipendente[] arrayDiDipendenti = {dipendente1, dipendente2, dipendente3};

        for (int i = 0; i < arrayDiDipendenti.length; i++) {
            System.out.println("numero di matricola del dipendente: " + arrayDiDipendenti[i].getMatricola());
        }

    }
}