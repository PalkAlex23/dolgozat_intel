package hu.szamalk;

import hu.szamalk.modell.Tabla;

public class Main {
    public static void main(String[] args) {
        Tabla tabla = new Tabla('#');
        tabla.Megjelenit();
        tabla.Elhelyez(5);
        tabla.Megjelenit();
    }
}