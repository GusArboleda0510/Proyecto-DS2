/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.univalle.persistencia;

import co.edu.modelo.Programas;

/**
 *
 * @author Alejandra Becerra
 */
public interface IProgramasDAO {
    public Programas consultarID(Integer idPrograma)throws Exception;
}
