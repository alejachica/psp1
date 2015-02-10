package edu.uniandes.ecos.psp1.vista;

import edu.uniandes.ecos.psp1.controlador.Controlador;
import edu.uniandes.ecos.psp1.modelo.ParesDTO;
import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class VistaConsola {

    private static final double PROXY = 386;

    public static void main(String[] args) {

        test1();
        test2();
        test3();
        test4();
    }

    /**
     * Metodo que permite ejecutar el caso de prueba 1 siendo X los valores de
     * la columna Estimated Proxy Size y Y los valores de la columna Actual
     * Added and Modified Size.
     */
    public static void test1() {

        LinkedList<ParesDTO> listaDeNumeros = new LinkedList<ParesDTO>();
        listaDeNumeros.add(new ParesDTO(130, 186));
        listaDeNumeros.add(new ParesDTO(650, 699));
        listaDeNumeros.add(new ParesDTO(99, 132));
        listaDeNumeros.add(new ParesDTO(150, 272));
        listaDeNumeros.add(new ParesDTO(128, 291));
        listaDeNumeros.add(new ParesDTO(302, 331));
        listaDeNumeros.add(new ParesDTO(95, 199));
        listaDeNumeros.add(new ParesDTO(945, 1890));
        listaDeNumeros.add(new ParesDTO(368, 788));
        listaDeNumeros.add(new ParesDTO(961, 1601));

        Controlador c = new Controlador();
        String resultado = c.realizarCalculos(listaDeNumeros, PROXY);
        System.out.println(resultado);
    }

    /**
     * Metodo que permite ejecutar el caso de prueba 2 siendo X los valores de
     * la columna Estimated Proxy Size y Y los valores de la columna Actual
     * Development Hours.
     */
    public static void test2() {

        LinkedList<ParesDTO> listaDeNumeros = new LinkedList<ParesDTO>();
        listaDeNumeros.add(new ParesDTO(130, 15.0));
        listaDeNumeros.add(new ParesDTO(650, 69.9));
        listaDeNumeros.add(new ParesDTO(99, 6.5));
        listaDeNumeros.add(new ParesDTO(150, 22.4));
        listaDeNumeros.add(new ParesDTO(128, 28.4));
        listaDeNumeros.add(new ParesDTO(302, 65.9));
        listaDeNumeros.add(new ParesDTO(95, 19.4));
        listaDeNumeros.add(new ParesDTO(945, 198.7));
        listaDeNumeros.add(new ParesDTO(368, 38.8));
        listaDeNumeros.add(new ParesDTO(961, 138.2));

        Controlador c = new Controlador();
        String resultado = c.realizarCalculos(listaDeNumeros, PROXY);
        System.out.println(resultado);
    }

    /**
     * Metodo que permite ejecutar el caso de prueba 3 siendo X los valores de
     * la columna Plan Added and Modified size y Y los valores de la columna
     * Actual Added and Modified Size.
     */
    public static void test3() {

        LinkedList<ParesDTO> listaDeNumeros = new LinkedList<ParesDTO>();
        listaDeNumeros.add(new ParesDTO(163, 186));
        listaDeNumeros.add(new ParesDTO(765, 699));
        listaDeNumeros.add(new ParesDTO(141, 132));
        listaDeNumeros.add(new ParesDTO(166, 272));
        listaDeNumeros.add(new ParesDTO(137, 291));
        listaDeNumeros.add(new ParesDTO(355, 331));
        listaDeNumeros.add(new ParesDTO(136, 199));
        listaDeNumeros.add(new ParesDTO(1206, 1890));
        listaDeNumeros.add(new ParesDTO(433, 788));
        listaDeNumeros.add(new ParesDTO(1130, 1601));

        Controlador c = new Controlador();
        String resultado = c.realizarCalculos(listaDeNumeros, PROXY);
        System.out.println(resultado);
    }
    
    /**
     * Metodo que permite ejecutar el caso de prueba 3 siendo X los valores de
     * la columna Plan Added and Modified size  y Y los valores de la columna
     * Actual Development Hours.
     */
    public static void test4() {

        LinkedList<ParesDTO> listaDeNumeros = new LinkedList<ParesDTO>();
        listaDeNumeros.add(new ParesDTO(163, 15.0));
        listaDeNumeros.add(new ParesDTO(765, 69.9));
        listaDeNumeros.add(new ParesDTO(141, 6.5));
        listaDeNumeros.add(new ParesDTO(166, 22.4));
        listaDeNumeros.add(new ParesDTO(137, 28.4));
        listaDeNumeros.add(new ParesDTO(355, 65.9));
        listaDeNumeros.add(new ParesDTO(136, 19.4));
        listaDeNumeros.add(new ParesDTO(1206, 198.7));
        listaDeNumeros.add(new ParesDTO(433, 38.8));
        listaDeNumeros.add(new ParesDTO(1130, 138.2));

        Controlador c = new Controlador();
        String resultado = c.realizarCalculos(listaDeNumeros, PROXY);
        System.out.println(resultado);
    }
}
