/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author manuel
 */
public class MainFraccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Fraccion numerador =  new Fraccion();
        numerador.setNumerador(0);
        numerador.setDenominador(0);
        Fraccion invierte = new Fraccion();
        Fraccion multiplica = new Fraccion();
        Fraccion divide = new Fraccion();
        
        
        System.out.println("Divide: "+ Fraccion.divide( 8, 2));
        System.out.println("Invierte: "+ Fraccion.invierte(4, 2));
        System.out.println("Multiplica: "+ Fraccion.multiplica(10, 2));
    }
    }
    

