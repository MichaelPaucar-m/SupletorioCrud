/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.dao;

import java.util.List;
import sys.modelo.Empleado;

/**
 *
 * @author pc
 */
public interface EmpleadoDAO {

    public List<Empleado> select();

    public void insert(Empleado empleado);

    public void update(Empleado empleado);

    public void delete(Empleado empleado);

}
