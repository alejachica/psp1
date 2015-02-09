/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.psp1.modelo;

import java.util.LinkedList;

/**
 *
 * @author Aleja Chica
 */
public class RLCalc {

    private LinkedList<ParesDTO> listaParesNumeros;

    private CalculadoraOperaciones calculadora;

    public RLCalc(LinkedList<ParesDTO> listaParesNumeros) {

        this.listaParesNumeros = listaParesNumeros;
        calculadora = new CalculadoraOperaciones(listaParesNumeros);
    }

    public double calcularBetaUno() {

        double xy = calculadora.calcularSumMultiplicacionXY();
        int n = listaParesNumeros.size();
        double promX = calculadora.calcularPromedioX();
        double promY = calculadora.calcularPromedioY();
        double x2 = calculadora.calcularSumatoriaX2();

        double dividendo = (xy) - (n * promX * promY);

        double divisor = (x2) - (n * Math.pow(promX, 2));

        return dividendo / divisor;
    }

    public double calcularBetaCero() {

        double promX = calculadora.calcularPromedioX();
        double promY = calculadora.calcularPromedioY();
        double beta1 = calcularBetaUno();

        return promY - (beta1 * promX);
    }

    public double calcularCoeficienteCorrelacion() {

        double xy = calculadora.calcularSumMultiplicacionXY();
        int n = listaParesNumeros.size();

        double x = calculadora.calcularSumatoriaX();
        double y = calculadora.calcularSumatoriaY();

        double x2 = calculadora.calcularSumatoriaX2();
        double y2 = calculadora.calcularSumatoriaY2();

        double dividendo = (n * xy) - (x * y);

        double divisor = Math.sqrt(((n * x2) - Math.pow(x, 2)) * ((n * y2) - Math.pow(y, 2)));

        return dividendo / divisor;
    }

    public double calcularR2() {

        double r = calcularCoeficienteCorrelacion();

        return Math.pow(r, 2);
    }

    public double calcularYk(double proxi) {

        double b0 = calcularBetaCero();
        double b1 = calcularBetaUno();

        return b0 + (b1 * proxi);
    }

}
