/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.uniandes.ecos.psp1.controlador;

import edu.uniandes.ecos.psp1.modelo.RLCalc;
import edu.uniandes.ecos.psp1.modelo.ParesDTO;
import java.io.File;
import java.util.LinkedList;

/**
 *Clase que sirve de controlador en el patron MVC 
 * @author Aleja Chica
 */
public class Controlador {
    
    public String realizarCalculos(LinkedList<ParesDTO> listaParesNumeros, double proxi){
        
    String resultado = "";
    
        RLCalc rlCalc = new RLCalc(listaParesNumeros);
        
        resultado = "Beta0 = " + rlCalc.calcularBetaCero() + "\n";
        resultado += "Beta1 = " + rlCalc.calcularBetaUno()+ "\n";
        resultado += "R x,y = " + rlCalc.calcularCoeficienteCorrelacion()+ "\n";
        resultado += "r^2 = " + rlCalc.calcularR2()+ "\n";
        resultado += "Yk = " + rlCalc.calcularYk(proxi)+ "\n";
        
        return resultado;
    }
    
     
}
