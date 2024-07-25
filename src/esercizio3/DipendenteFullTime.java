package esercizio3;
/*ESTENDERE IL PUNTO 1 AGGIUNGENDO 3 ULTERIORI CLASSI:
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

import enums.ValoriPossibiliDipartimento;

public class DipendenteFullTime extends Dipendente2 {

    public DipendenteFullTime(String m, ValoriPossibiliDipartimento d) {
        super(m, d);
    }

    /*@Override*/
   /* public void chekIn() {
        System.out.println("Il volontario inizia il turno alle 18");
    }*/

    @Override
    public void calculateSalary(double oreLavorate) {
        double stipendioMensile = oreLavorate * 15;
        System.out.println("Lo stipendio del dipendente full time è pari a: " + stipendioMensile);
    }
}
