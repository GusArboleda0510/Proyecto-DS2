/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import co.edu.modelo.Personas;
import co.edu.modelo.RegistroEntradaSalida;
import co.edu.univalle.persistencia.DAOFactory;
import java.util.List;

/**
 *
 * @author ANDRES ARBOLEDA
 */
public class ControlRegistroEntrada {
    RegistroEntradaSalida es;
    RegistroEntradaSalida regSalida;
    
    
    public void validacionRegEntrada(Personas p, int documento)throws Exception{

        if("".equals(documento)){
            throw new Exception("Debes agregar un documento");
        }
        if (p.getActivo()== 0) {
          throw  new Exception("Esta persona ha sido borrada del sistema");
        }
        if(p==null){
            throw new Exception("El usuario ingresado no existe");
        }
        
        
    }
    public boolean opcionCrear(Personas p,List<RegistroEntradaSalida> reg) throws Exception {
        boolean crear = false;

        for (RegistroEntradaSalida reg1 : reg) {
            if (reg1.getCedula() == p) {
                if (reg1.getHoraSalida() == null) {
                    crear = true;
                }
            }
        }
        return crear;
    }
    
}
