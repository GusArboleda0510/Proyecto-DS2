/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.univalle.persistencia;
import co.edu.modelo.Novedades;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author ANDRES ARBOLEDA
 */
public class NovedadesDAO implements INovedadesDAO {
    @Override
    public void insertar(Novedades novedad) throws Exception {
        try {
            EntityManagerHelper.getEntityManager().persist(novedad);
        } catch (Exception e) {
            throw  e;
        }
    }
    
    public List<Novedades> consultarFechas(String a, String b) throws Exception {
        try {
            Query query
                    = EntityManagerHelper.createQuery("SELECT n FROM Novedades n WHERE n.fecha BETWEEN '" + a + "' AND '" + b + "'");
            return query.getResultList();
        } catch (Exception e) {
            throw e;
        }
    }
}
