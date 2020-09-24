/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.univalle.persistencia;

import co.edu.modelo.Funcionario;
import java.util.List;
import javax.persistence.Query;


/**
 *
 * @author Alejandra Becerra
 */
public class FuncionarioDAO implements IFuncionarioDAO{

    @Override
    public Funcionario consultarID(String usuario) throws Exception {
        return EntityManagerHelper.getEntityManager().find(Funcionario.class, usuario);
    }

    @Override
    public List<Funcionario> consultarTodo() throws Exception {
        Query query = new EntityManagerHelper().createQuery("SELECT f FROM Funcionario f");
        return query.getResultList();
        
    }
    
}
