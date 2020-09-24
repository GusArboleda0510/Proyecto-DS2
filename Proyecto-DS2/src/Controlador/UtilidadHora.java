/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ANDRES ARBOLEDA
 */
public class UtilidadHora {
    private static UtilidadHora instance = null;

    public static UtilidadHora getinstance(){
        if(instance == null)
            instance = new UtilidadHora();
        return instance;
    }
    
    public String getHora(){
        Date fecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("HH:mm:ss");
        return formato.format(fecha);
    }
}
