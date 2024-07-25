package esercizio2;

import enums.ValoriPossibiliDipartimento;

public class Dirigente extends Dipendente2 {
    public Dirigente(String m, ValoriPossibiliDipartimento d) {
        super(m, d);
    }

    public void calculateSalary(double oreLavorate) {
        double stipendioMensile = oreLavorate * 40;
        System.out.println("Lo stipendio del Dirigente è pari a: " + stipendioMensile);
    }
}
