/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomusic;

import java.util.regex.Pattern;

/**
 *
 * @author ulise
 */
public class ProyectoMusic {
    
    public static boolean ValidaBusqueda(String valor){
        return Pattern.matches("[A-Za-z0-9]+", valor);
    }
    
}
