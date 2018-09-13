/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

/**
 *
 * @author Estudiantes
 */
public class Modificacion {
    
    public String cadena;

public String getCadena(int segundos,int minutos,int horas){
        cadena=horas+" : "+minutos+" : "+segundos;
        if(segundos<10){
            cadena=horas+" : "+minutos+" : "+"0"+segundos;
            if(minutos<10){
                cadena=horas+" : "+"0"+minutos+" : "+"0"+segundos;
                if (horas<10){
                    cadena="0"+horas+" : "+"0"+minutos+" : "+"0"+segundos;
                }
            }
        }
        
        return cadena;
    }
}