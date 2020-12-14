/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import java.util.regex.Pattern;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author Omar
 */
public class Validador {
    public static boolean validaUsuario(String valor){
     return Pattern.matches("[A-Za-z0-9]+", valor);
    }
    public static boolean validaContrasena(String valor){
    return Pattern.matches("[A-Za-z0-9]+", valor);
    }
    public static boolean campoVacio(String valor){
     return (valor.trim().isEmpty());
    }
    public static boolean validaTexto(String valor){
    return Pattern.matches("[A-Za-z0-9\s]+", valor);
    }
    public static boolean validaEntero(String valor){
    return Pattern.matches("[0-9]+", valor);
    }
     public static boolean validaDuracion(String valor){
    return Pattern.matches("[0-9]+[.][0-9]+", valor);
    }
   
}
