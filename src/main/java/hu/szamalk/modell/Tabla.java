package hu.szamalk.modell;

import java.util.Arrays;

// 1. feladat
public class Tabla {
    // 2. feladat
    private char[][] T;
    private char UresCella;

    // 3. feladat
    public Tabla(char karakter) {
        T = new char[8][8];
        UresCella = karakter;
        for(int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                Arrays.fill(T[j], UresCella);
            }
        }
    }

    // 4. feladat
    public void Megjelenit() {
        for(int i = 0; i < T.length; i++) {
            for (int j = 0; j < T[i].length; j++) {
                System.out.print(T[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }


    // 5. feladat
    public void Elhelyez(int N) {
        for(int i = 0; i < N; i++) {
            int p1 = (int) (Math.random() * 8 - 1) + 1;
            int p2 = (int) (Math.random() * 8 - 1) + 1;

            while (T[p1][p2] != UresCella) {
                p1 = (int) (Math.random() * 8 - 1) + 1;
                p2 = (int) (Math.random() * 8 - 1) + 1;
            }

            T[p1][p2] = 'K';
        }
    }

    // 7. feladat
    public boolean UresOszlop(int oszlop) {
        int i = 0;
        boolean vanKno = false;
        while (i < 8 && !vanKno) {
            if (T[i][oszlop] == 'K') {
                vanKno = true;
            }
            i++;
        }
        return vanKno;
    }

    public boolean UresSor(int sor) {
        int i = 0;
        boolean vanKno = false;
        while (i < 8 && !vanKno) {
            if (T[sor][i] == 'K') {
                vanKno = true;
            }
            i++;
        }
        return vanKno;
    }

    // 8. feladat
    public int UresOszlopokSzama() {
        int db = 0;
        for(int i = 0; i < 8; i++) {
            if(!UresOszlop(i)) {
                db = db + 1;
            }
        }
        return db;
    }

    public int UresSorokSzama() {
        int db = 0;
        for(int i = 0; i < 8; i++) {
            if(!UresSor(i)) {
                db = db + 1;
            }
        }
        return db;
    }
}
