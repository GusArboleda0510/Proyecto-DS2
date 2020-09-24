/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.univalle.persistencia;

import co.edu.modelo.RegistroEntradaSalida;
import java.util.List;
import javax.persistence.Query;

public class RegistroEntradaSalidaDAO implements IRegistroEntradaSalidaDAO {

    @Override
    public void insertar(RegistroEntradaSalida registro) throws Exception {
        EntityManagerHelper.getEntityManager().persist(registro);
    }

    public List<RegistroEntradaSalida> consultarFechas(String a, String b) throws Exception {

        try {
            Query query
                    = EntityManagerHelper.createQuery("SELECT r FROM RegistroEntradaSalida r WHERE r.fecha BETWEEN '" + a + "' AND '" + b + "'");
            return query.getResultList();
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public void modificar(RegistroEntradaSalida c) throws Exception {
        EntityManagerHelper.getEntityManager().merge(c);
    }

    @Override
    public RegistroEntradaSalida consultarID(Integer documento) throws Exception {
        return EntityManagerHelper.getEntityManager().find(RegistroEntradaSalida.class, documento);
    }

    @Override
    public List<RegistroEntradaSalida> consultarTodos() throws Exception {
        Query query = new EntityManagerHelper().createQuery("SELECT r FROM RegistroEntradaSalida r");
        return query.getResultList();
    }

}
