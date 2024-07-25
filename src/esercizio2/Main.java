package esercizio2;

import enums.ValoriPossibiliDipartimento;


public class Main {
    public static void main(String[] args) {

        Dipendente2 dipendente1 = new Dipendente2("1230", 1500, ValoriPossibiliDipartimento.PRODUZIONE);
        Dipendente2 dipendente2 = new Dipendente2("12345", 1700, ValoriPossibiliDipartimento.AMMINISTRAZIONE);
        Dipendente2 dipendente3 = new Dipendente2("12311", 2500, ValoriPossibiliDipartimento.VENDITE);

        Dipendente2[] arrayDiDipendenti = {dipendente1, dipendente2, dipendente3};

        for (int i = 0; i < arrayDiDipendenti.length; i++) {
            System.out.println("numero di matricola del dipendente: " + arrayDiDipendenti[i].getMatricola());
        }

    }
}
