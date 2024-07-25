package esercizio2;

import enums.ValoriPossibiliDipartimento;

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
public class Main {
    public static void main(String[] args) {
        DipendenteFullTime dipendenteF1 = new DipendenteFullTime("123", ValoriPossibiliDipartimento.VENDITE);
        DipendentePartTime dipendenteP1 = new DipendentePartTime("456", ValoriPossibiliDipartimento.PRODUZIONE);
        Dirigente dirigente1 = new Dirigente("111", ValoriPossibiliDipartimento.AMMINISTRAZIONE);

        Dipendente2[] Dipendents = {dipendenteF1, dipendenteP1, dirigente1};

        for (int i = 0; i < Dipendents.length; i++) {
            if (Dipendents[i] instanceof DipendenteFullTime) {
                DipendenteFullTime f1 = (DipendenteFullTime) Dipendents[i];
                f1.calculateSalary(5);

            } else if (Dipendents[i] instanceof DipendentePartTime) {
                DipendentePartTime p1 = (DipendentePartTime) Dipendents[i];
                p1.calculateSalary(10);
            } else {
                Dirigente d1 = (Dirigente) Dipendents[i];
                d1.calculateSalary(20);
            }
        }

    }
}
