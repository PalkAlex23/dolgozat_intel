package hu.szamalk.modell;

// 1. feladat
public class Tabla {
    // 2. feladat
    private char[][] T;
    private char UresCella;

    // 3. feladat
    public Tabla(char karakter) {
        T = new char[8][8];
        UresCella = karakter;
        for(int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; i++) {
                T[i][j] = karakter;
            }
        }
    }
}
