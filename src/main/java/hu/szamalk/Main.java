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

        /*
        System.out.println(tabla.UresOszlop(3));
        System.out.println(tabla.UresSor(7));
        */

        // 9. feladat
        System.out.println("9. feladat: Üres oszlopok és sorok száma:");
        System.out.println("Oszlopok: " + tabla.UresOszlopokSzama());
        System.out.println("Sorok: " + tabla.UresSorokSzama());
    }
}