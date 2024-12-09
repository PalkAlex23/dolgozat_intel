package hu.szamalk.JatekProgram;

public class Babu {
    private int ero;
    private String szin;

    public Babu(String szin) {
        this(1, szin);
    }

    public Babu(int ero, String szin) {
        if(ero >= 1 && ero <= 9) {
            this.ero = ero;
        }
        this.szin = szin;
    }
}
