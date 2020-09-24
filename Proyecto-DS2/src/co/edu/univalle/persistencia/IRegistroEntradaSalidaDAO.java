/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.univalle.persistencia;

import co.edu.modelo.RegistroEntradaSalida;
import java.util.List;

/**
 *
 * @author kevin
 */
public interface IRegistroEntradaSalidaDAO {
    
    public void insertar(RegistroEntradaSalida registro) throws Exception;
    public List<RegistroEntradaSalida> consultarFechas(String a , String b)throws Exception;
    public void modificar(RegistroEntradaSalida c)throws Exception;
    public RegistroEntradaSalida consultarID(Integer documento)throws Exception;
    public List<RegistroEntradaSalida> consultarTodos()throws Exception;
}
 