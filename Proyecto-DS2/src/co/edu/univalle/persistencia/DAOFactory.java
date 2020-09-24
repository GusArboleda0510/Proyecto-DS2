/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.univalle.persistencia;


/**
 *
 * @author Alejandra Becerra
 */
public class DAOFactory {
   
    private static IFuncionarioDAO funcionario = new FuncionarioDAO();
    private static IPersonaDAO personaDAO = new PersonaDAO();
    private static IProgramasDAO programasDAO = new ProgramasDAO();
    private static IRegistroEntradaSalidaDAO registroEntradaSalidaDAO = new RegistroEntradaSalidaDAO();
    private static INovedadesDAO novedadesDAO = new NovedadesDAO();

    
    public static IFuncionarioDAO getFuncionario() {
        return funcionario;
    }
    
    public static IPersonaDAO getPersona() {
        return personaDAO;
    }

    public static IProgramasDAO getProgramasDAO() {
        return programasDAO;
    }

    public static IRegistroEntradaSalidaDAO getRegistroEntradaSalidaDAO() {
        return registroEntradaSalidaDAO;
    }
    
    public static INovedadesDAO getNovedadesDAO() {
        return novedadesDAO;
    }
    
    

    
    
    
}
