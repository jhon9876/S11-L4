package esercizio3;

import enums.ValoriPossibiliDipartimento;

public class Dirigente extends Dipendente2 {
    public Dirigente(String m, ValoriPossibiliDipartimento d) {
        super(m, d);
    }

    @Override
    public void chekIn() {
        System.out.println("Il volontario inizia il turno alle 18");
    }

    public void calculateSalary(double oreLavorate) {
        double stipendioMensile = oreLavorate * 40;
        System.out.println("Lo stipendio del Dirigente è pari a: " + stipendioMensile);
    }
}
