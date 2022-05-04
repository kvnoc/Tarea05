package Ejercicio02;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args){

        double varA;

        double varB;

        double varC;

        varA = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL TOTAL DE CAPITAL"));
        varB = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL INTERES"));
        varC = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL TOTAL DE MESES"));

        Compuesto compuesto = new Compuesto(varA, varB, varC);

        System.out.println("EL IMPORTE ACUMULADO ES: S/"+compuesto.getTotal());
    }
}
