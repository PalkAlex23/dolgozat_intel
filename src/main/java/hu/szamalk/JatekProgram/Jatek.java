package hu.szamalk.JatekProgram;

public abstract class Jatek extends LogikaiJatek {
    private static int jatekDb;
    public abstract void kezd();
    public abstract void ment();
    public abstract void vege();

    public Jatek() {
        this(3);
    }

    public Jatek(int babuDb) {
        super(babuDb);
        jatekDb += 1;
    }

    public static int getJatekDb() {
        return jatekDb;
    }
}
