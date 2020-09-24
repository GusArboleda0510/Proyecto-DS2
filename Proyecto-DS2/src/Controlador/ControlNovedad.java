/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import co.edu.modelo.Funcionario;
import co.edu.modelo.Novedades;
import co.edu.modelo.Personas;
import co.edu.univalle.persistencia.DAOFactory;
import co.edu.univalle.persistencia.EntityManagerHelper;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.mail.MessagingException;

/**
 *
 * @author ANDRES ARBOLEDA
 */
public class ControlNovedad {
    String nombreCompleto = "";
    String cargo = "";
    Calendar calendario;
    String usuario="";
    public ControlNovedad(){
    }

    public void buscar(Personas persona) throws Exception {
        if(persona == null){
            throw new Exception("Documento no existe");
        }
        if (persona.getActivo()== 0) {
          throw  new Exception("Esta persona ha sido borrada del sistema");
        }
        nombreCompleto = persona.getNombre() +" "+ persona.getApellido();
        cargo = persona.getCargo();
    }

    public void validarDato(String dato,String nombreDato) throws Exception {
        if("".equals(dato)){
            throw  new Exception(nombreDato+" esta vacio");
        }    
        if(!dato.matches("\\d*")){
            throw  new Exception(nombreDato+" debe ser numerico");
        }
    }
    
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getCargo() {
        return cargo;
    } 

     public Novedades guardarBD(String[] datos,Personas person) throws Exception {
        Novedades novedad = new Novedades();
        try {
            novedad.setDocumento(person);
            novedad.setTemperatura(datos[1]);
            novedad.setEnfermedadesPreexistente(datos[2]);
            novedad.setConviveMenores(datos[3]);
            novedad.setConviveMayores(datos[4]);
            novedad.setObservaciones(datos[5]);
            usuario= datos[7];

            novedad.setUsuario(funcionario(usuario));
            
            SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
            Date hora = formatoHora.parse(UtilidadHora.getinstance().getHora());
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            Date fecha = formatoFecha.parse(obtenerFecha());

            novedad.setFecha(fecha);
            novedad.setHora(hora);


        } catch (Exception e) {
            System.out.println("e = " + e);
         }
        
        String destinos[] = obtenerDestinos(person.getCargo());
        for (String destino : destinos) {
            if(!destino.equals("-")){
                enviarEmails(datos, destino, person);
            }
        }

        return novedad;
    }
      private Funcionario funcionario(String f) throws Exception{
        Funcionario func = DAOFactory.getFuncionario().consultarID(f);
        return func;
    }
    /*
    datos[0] = documento
    datos[1] = temperatura
    datos[2] = enfermedades
    datos[3] = convive ninios
    datos[4] = convive mayores
    datos[5] = observaciones
    datos[6] = cargo
    */

    private void enviarEmails(String[] datos, String destino, Personas person) throws MessagingException {
        
        String origen = "porteriaunivalle01@gmail.com";
        String claveOrigen = "01porteriaunivalle";
        String asunto = "REGISTRO NOVEDAD "+datos[6]+": "+person.getNombre()+" "+
                        person.getApellido()+" ID: "+datos[0];
        String mensaje = "El dia "+obtenerFecha()+" a las "+UtilidadHora.getinstance().getHora()+","
                + " se realiza el reporte "
                + "de novedad sobre el estado de salud del "+datos[6]+" "+person.getNombre()
                +" "+person.getApellido()+" identificad@ con la "+person.getTipoDocumento()
                +" numero "+datos[0]+". Haciendo registro de su temperatura: "+datos[1]
                +" y otros datos como: \n"
                +"Enfermedades preexistentes: "+datos[2] +" \n"
                +"Convive con niños o menores: "+datos[3] +" \n"
                +"Convive con adultos mayores: "+datos[4] +" \n"
                +"Observaciones: "+datos[5] +" \n "
                +"Att: Porteria Univalle -> " + usuario;
        
        SendMail enviar = new SendMail();
        enviar.send(origen, claveOrigen, destino, asunto, mensaje);
    }
 
        private String obtenerFecha() {
        calendario = Calendar.getInstance();
        String dia = Integer.toString(calendario.get(Calendar.DATE));
        String mes = Integer.toString(calendario.get(Calendar.MONTH) + 1);
        String anio = Integer.toString(calendario.get(Calendar.YEAR));
        if(mes.length()==1){
           mes = 0+mes; 
        }   
        String fechaActual = dia + "/" + mes + "/" + anio;  
        return fechaActual;
    }

    

    private String[] obtenerDestinos(String cargo) {
        String correos[] = new String [3];
        correos[0] = "becerra.alejandra@correounivalle.edu.co";
        correos[1] = "gustavo.arboleda@correounivalle.edu.co";
        correos[2] = "kevin.cuadros@correounivalle.edu.co";           
        if(cargo.equalsIgnoreCase("docente")){
            correos[2] = "-";
        }        
        if(cargo.equalsIgnoreCase("Administrativo")){
            correos[1] = "-";
            correos[2] = "-";

        }
        return correos;
    }
}
