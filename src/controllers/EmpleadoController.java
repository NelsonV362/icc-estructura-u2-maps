package controllers;

import models.Empleado;
import controllers.EmpleadoDAO;

public class EmpleadoController {

    private EmpleadoDAO empleadoDAO;

    public EmpleadoController(EmpleadoDAO empleadoDAO) {
        this.empleadoDAO = empleadoDAO;
    }

    public void agregarEmpleado(Empleado emp) {
        empleadoDAO.add(emp);
    }

    public void listarEmpleados() {
        empleadoDAO.list();
    }

    public void eliminarEmpleado(int id) {
        empleadoDAO.remove(id);
    }
}
