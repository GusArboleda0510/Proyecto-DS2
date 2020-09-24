/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.univalle.persistencia;

import co.edu.modelo.Novedades;
import java.util.List;

/**
 *
 * @author Alejandra Becerra
 */
public interface INovedadesDAO {
    public void insertar(Novedades novedad) throws Exception;
    public List<Novedades> consultarFechas(String a, String b) throws Exception;
}
