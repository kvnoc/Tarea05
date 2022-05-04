package Ejercicio01;

import javax.swing.*;

public class Main {

    public static void main(String[] args){

        double notaA;

        double notaB;

        double notaC;

        notaA = Double.parseDouble(JOptionPane.showInputDialog("INGRESE NOTA DE PROMEDIO DE TAREAS"));
        notaB = Double.parseDouble(JOptionPane.showInputDialog("INGRESE NOTA DE EXAMEN DE MEDIO CURSO"));
        notaC = Double.parseDouble(JOptionPane.showInputDialog("INGRESE NOTA DE EXAMEN FINAL"));

        Notas notas = new Notas(notaA, notaB, notaC);

        System.out.println("LA NOTA FINAL DEL ALUMNO ES: "+notas.getPromedio());
    }

}
