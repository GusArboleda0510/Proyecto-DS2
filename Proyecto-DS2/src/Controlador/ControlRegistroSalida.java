/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import co.edu.modelo.Personas;
import co.edu.modelo.Programas;
import co.edu.modelo.RegistroEntradaSalida;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ANDRES ARBOLEDA
 */
public class ControlRegistroSalida {
    
    DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
    DateFormat formatoFecha = new SimpleDateFormat("YYYY/MM/dd");
    int codigo=0;
    boolean existe=false;
    
    
  public void registro(Personas p, int documento)throws Exception{
        if("".equals(documento)){
            throw new Exception("Debes agregar un documento");
        }
        if(p==null){
            throw new Exception("El usuario ingresado no tiene registro de entrada");
        }
    }
  
    public ArrayList consultarTodo(Personas p, Programas pr, List<RegistroEntradaSalida> entradaSalida) throws Exception {
        ArrayList inf = new ArrayList();
        inf.clear();

        for (RegistroEntradaSalida r : entradaSalida) {
            
            if (p.equals(r.getCedula())) {
                if (r.getHoraSalida() == null) {
                    
                    codigo = r.getControl();
                    inf.add(p.getNombre());//Nombre
                    inf.add(p.getCargo());//cargo
                    if (!p.getCargo().equals("Administrativo")) {
                        inf.add(pr.getNombrePrograma());//NombrePrograma
                    } else {
                        inf.add("");
                    }

                    String horaEnt = formatoHora.format(r.getHoraEntrada());//Paso la horaEntrada a String
                    inf.add(horaEnt);//HoraEntrada   
                    
                    String fechaEnt = formatoFecha.format(r.getFecha());//Paso la FechaEntrada a String
                    inf.add(fechaEnt);//FechaEntrada

                    if (r.getHoraSalida() == null) {
                        inf.add("");
                    } else {
                        String fechaSal = formatoHora.format(r.getHoraSalida());//Paso la horaSalida a String
                        inf.add(fechaSal);
                    }
                        return inf;
                }else{
                    existe=true;
                }

            }
        }
        if (existe==true) {
            throw new Exception("No existe registro de entrada");
        }
        return inf;
    }
    public int getCodigo() throws Exception{
        return codigo;
           
    }
}
