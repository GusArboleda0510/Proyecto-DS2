/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.univalle.persistencia;


import co.edu.modelo.Personas;

/**
 *
 * @author kevin
 */
public interface IPersonaDAO {
    
    public void insertar(Personas persona) throws Exception;  
    public Personas consultarID(Integer documento)throws Exception;
}
