/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import co.edu.modelo.Personas;
import co.edu.univalle.persistencia.DAOFactory;
import co.edu.univalle.persistencia.EntityManagerHelper;

/**
 * @author KEVIN CUADROS
 */
public class ControlRegistro {

    public ControlRegistro() {
    }

    public void validarObjeto(Personas personas) throws Exception {
        if (personas == null) {
            throw new Exception("persona nula");
        }
        if (personas.getDocumento() == 0) {
            throw new Exception("Documento Invalido");
        }
        if ("".equals(personas.getNombre())) {
            throw new Exception("Ingrese el Nombre");
        }
        if ("".equals(personas.getApellido())) {
            throw new Exception("Ingrese el Apellido");
        }
        if (personas.getTelefono() == 0) {
            throw new Exception("Telefono Invalido");
        }
        if ("".equals(personas.getDireccion())) {
            throw new Exception("Ingrese la Direccion");
        }
        if ("".equals(personas.getCiudad())) {
            throw new Exception("Ingrese la Ciudad");
        }
        if (validarDocumento(personas) == true) {
            EntityManagerHelper.beginTransaction();
            DAOFactory.getPersona().insertar(personas);
            EntityManagerHelper.commit();
            EntityManagerHelper.closeEntityManager();
        }else{
            throw new Exception("La persona esta registrada");
        }

    }

    public boolean validarDocumento(Personas personas) throws Exception {
        boolean validar = false;
        Personas p = DAOFactory.getPersona().consultarID(personas.getDocumento());
        if (p == null) {
            validar = true;
        } else {
            if (p.getActivo() == 0) {
                throw new Exception("Esta persona ha sido borrada del sistema");
            }
        }
        return validar;
    }

}
