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

public class Main {
    public static void main(String[] args) {
        DipendenteFullTime df1 = new DipendenteFullTime("123", ValoriPossibiliDipartimento.VENDITE);
        DipendentePartTime dp1 = new DipendentePartTime("432", ValoriPossibiliDipartimento.PRODUZIONE);
        Dirigente dg1 = new Dirigente("467", ValoriPossibiliDipartimento.AMMINISTRAZIONE);
        Volontario vl1 = new Volontario(20, "Alessio", "Informatico");
        Volontario vl2 = new Volontario(30, "Aldo", "Musicista");

        /* InizioTurno[] I = {df1, dp1, dg1, vl1, vl2};*/
        InizioTurno[] lavoratori = {df1, dp1, dg1, vl1, vl2};
        for (int i = 0; i < lavoratori.length; i++) {
            if (lavoratori[i] instanceof Volontario) {
                Volontario v1 = (Volontario) lavoratori[i];
                v1.chekIn();
            }
        }
    }
}
