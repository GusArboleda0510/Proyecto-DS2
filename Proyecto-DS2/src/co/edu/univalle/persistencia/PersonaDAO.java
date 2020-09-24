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
public class PersonaDAO implements IPersonaDAO {

    @Override
    public void insertar(Personas persona) throws Exception {
        try {
            EntityManagerHelper.getEntityManager().persist(persona);
        } catch (Exception e) {
            throw  e;
        }
    }

    @Override
    public Personas consultarID(Integer documento) throws Exception {
        return EntityManagerHelper.getEntityManager().find(Personas.class, documento);
    }



}
