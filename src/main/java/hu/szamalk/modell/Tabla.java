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
    }
}
