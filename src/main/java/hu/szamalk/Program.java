package hu.szamalk;

import hu.szamalk.JatekProgram.LogikaiJatek;
import hu.szamalk.modell.Tabla;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Program {
    public static void main(String[] args) {
        LogikaiJatek j1 = new LogikaiJatek(3);
        LogikaiJatek j2 = new LogikaiJatek(10);

        j1.kezd();
        j1.ment();
        j1.vege();

        j2.kezd();
        j2.ment();
        j2.vege();

        // f2 vége

        /*
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

        /*
        // 9. feladat
        System.out.println("9. feladat: Üres oszlopok és sorok száma:");
        System.out.println("Oszlopok: " + tabla.UresOszlopokSzama());
        System.out.println("Sorok: " + tabla.UresSorokSzama());

        // 10. feladat
        InputStream is = new InputStream() {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };
        InputStreamReader isr = new InputStreamReader(is);
        BufferedInputStream bf = new BufferedInputStream(is);
        Tabla tabla2 = new Tabla('*');
        for(int i = 0; i < 64; i++) {
            tabla2.Elhelyez(i);
            tabla2.Megjelenit();
        }
        */

        // feladat vége
    }
}