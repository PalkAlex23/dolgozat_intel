package hu.szamalk.JatekProgram;

import java.util.Arrays;

public class LogikaiJatek {
    private Babu[][] tabla = new Babu[4][5];
    private int[] sorrend = new int[10];
    private int babuDb;

    public LogikaiJatek() {
        this(3);
    }

    public LogikaiJatek(int babuDb) {
        if(babuDb >= 2 && babuDb <= 15) {
            this.babuDb = babuDb;
        }
    }

    public boolean van8FelettEro() {
        return false;
    }

    public void kezd() {
        System.out.println("Kezdés");
    }

    public void ment() {
        System.out.println("Mentés");
    }

    public void vege() {
        System.out.println("Vége");
    }

    @Override
    public String toString() {
        return "LogikaiJatek{" +
                "tabla=" + Arrays.toString(tabla) +
                ", sorrend=" + Arrays.toString(sorrend) +
                ", babuDb=" + babuDb +
                '}';
    }
}
