/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.psp1.modelo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Aleja Chica
 */
public class CalculadoraOperaciones {

    private LinkedList<ParesDTO> listaParesNumeros;

    private Mean promedio;

    public CalculadoraOperaciones(LinkedList<ParesDTO> listaParesNumeros) {

        this.listaParesNumeros = listaParesNumeros;
        promedio = new Mean();
    }

    public double calcularSumatoriaX() {

        double sumatoria = 0;

        for (ParesDTO pares : listaParesNumeros) {

            sumatoria += pares.getX();
        }

        return sumatoria;
    }

    public double calcularSumatoriaY() {

        double sumatoria = 0;

        for (ParesDTO pares : listaParesNumeros) {

            sumatoria += pares.getY();
        }

        return sumatoria;
    }

    public double calcularSumatoriaX2() {

        double sumatoria = 0;

        for (ParesDTO pares : listaParesNumeros) {

            sumatoria +=  Math.pow(pares.getX(), 2);
        }

        return sumatoria;
    }

    public double calcularSumatoriaY2() {

        double sumatoria = 0;

        for (ParesDTO pares : listaParesNumeros) {

            sumatoria += (Math.pow(pares.getY(), 2));
        }

        return sumatoria;
    }

    public double calcularSumMultiplicacionXY() {

        double sumatoria = 0;
        double multiplicacion = 0;

        for (ParesDTO pares : listaParesNumeros) {

            multiplicacion = pares.getX() * pares.getY();
            sumatoria +=  multiplicacion;
        }

        return sumatoria;
    }

    public double calcularPromedioX() {

        List<Double> numX = new LinkedList<Double>();

        for (ParesDTO pares : listaParesNumeros) {

            numX.add(pares.getX());
        }

        return promedio.calcularPromedio((LinkedList) numX);
    }
    
    public double calcularPromedioY() {

        List<Double> numY = new LinkedList<Double>();

        for (ParesDTO pares : listaParesNumeros) {

            numY.add(pares.getY());
        }

        return promedio.calcularPromedio((LinkedList) numY);
    }

}
