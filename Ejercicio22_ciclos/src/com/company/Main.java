package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // Pedir 5 calificaciones de alumnos y decir al final si hay algun suspendido

        float nota;
        boolean hayReprobado = false;
        for (int i = 1; i <= 5; i++) {
            do {
                nota = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota del " + i + " alumno: "));
            } while ((nota < 0) || (nota > 10));
            if (nota < 5) {
                hayReprobado = true;
            }
        }
        if (hayReprobado == true) {
            JOptionPane.showMessageDialog(null, "Al menos hubo un suspendido");
        } else {
            JOptionPane.showMessageDialog(null, "No hubo ningun suspendido");
        }
    }
}

