/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.univalle.persistencia;

import co.edu.modelo.Funcionario;
import java.util.List;

/**
 *
 * @author Alejandra Becerra
 */
public interface IFuncionarioDAO {
//    public void insertar(Funcionario f)throws Exception;
//    public void modificad(Funcionario f) throws Exception;
//    public void eliminar(Funcionario f) throws Exception;
    public Funcionario consultarID(String usuario)throws Exception;
    public List<Funcionario> consultarTodo()throws Exception;
}
