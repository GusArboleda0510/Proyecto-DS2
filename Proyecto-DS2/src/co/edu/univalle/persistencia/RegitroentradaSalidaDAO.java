/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.univalle.persistencia;

import co.edu.modelo.RegistroEntradaSalida;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author kevin
 */
public class RegitroentradaSalidaDAO implements IRegitroentradaSalidaDAO {

    @Override
    public void insertar(RegistroEntradaSalida registro) throws Exception {
        EntityManagerHelper.getEntityManager().persist(registro);
    }

    @Override
    public void modificar(RegistroEntradaSalida c) throws Exception {
        EntityManagerHelper.getEntityManager().merge(c);
    }

    
    @Override
    public List<RegistroEntradaSalida> consultarTodo() throws Exception {
        Query query = new EntityManagerHelper().createQuery("SELECT r FROM RegitroentradaSalida r");
            return  query.getResultList();
    }

    @Override
    public RegistroEntradaSalida consultarID(Integer documento) throws Exception {
        return EntityManagerHelper.getEntityManager().find(RegistroEntradaSalida.class, documento);
    }




}
