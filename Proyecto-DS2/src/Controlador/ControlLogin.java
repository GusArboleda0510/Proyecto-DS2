/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
// funcionario@gmail.com
// comentario de git 
import Vista.Login_Usuario;
import co.edu.modelo.Funcionario;
import co.edu.univalle.persistencia.DAOFactory;
import co.edu.univalle.persistencia.FuncionarioDAO;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Alejandra
 * 
 */
public class ControlLogin {
     Login_Usuario lu;
     String usuario="", contrasena="";
     FuncionarioDAO f;
     
     public ControlLogin(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
   
    public void iniciar(Funcionario f) throws Exception{
        if("".equals(usuario)){
            throw  new Exception("Debe agregar usuario");
        }
        if("".equals(contrasena)){
            throw  new Exception("Debe agregar contraseña");
        }
        if(!validar_email(usuario)){
            throw  new Exception("El usuario ingresado no tiene formato de correo");
        }       
        
        if(f==null){
            throw new Exception("El usuario es incorrecto");
        }
        if (f.getUsuario().equals(usuario)) {
            if(!f.getContraseña().equals(contrasena)){
                throw new Exception("La contraseña es incorrecto");
            }
        }
    }
     public boolean validar_email(String a) {
        boolean validar = true;
        Pattern validar_email = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher m = validar_email.matcher(a);

        if (!m.find() == true) {
            validar = false;
        } 
        return validar;
    }
}
