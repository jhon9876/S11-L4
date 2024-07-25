package esercizio3;

import enums.ValoriPossibiliDipartimento;

public class DipendentePartTime extends Dipendente2 {

    public DipendentePartTime(String m, ValoriPossibiliDipartimento d) {
        super(m, d);
    }

    @Override
    public void chekIn() {
        System.out.println("Il volontario inizia il turno alle 18");
    }

    public void calculateSalary(double oreLavorate) {
        double stipendioMensile = oreLavorate * 15;
        System.out.println("Lo stipendio del dipendente part Time è pari a: " + stipendioMensile);
    }
}
