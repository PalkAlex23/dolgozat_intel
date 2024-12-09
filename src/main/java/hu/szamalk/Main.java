package hu.szamalk;

import hu.szamalk.modell.Tabla;

public class Main {
    public static void main(String[] args) {
        Tabla tabla = new Tabla('#');
        System.out.println("4. Feladat: Az üres tábla:");
        tabla.Megjelenit();
        // 6. feladat
        System.out.println("6. Feladat: A feltöltött tábla:");
        tabla.Elhelyez(8);
        tabla.Megjelenit();
    }
}