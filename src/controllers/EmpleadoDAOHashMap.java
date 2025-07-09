package controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import models.Empleado;
import controllers.EmpleadoDAO;

public class EmpleadoDAOHashMap implements EmpleadoDAO {

    private Map<Integer, Empleado> empleados;

    public EmpleadoDAOHashMap(boolean usarTreeMap) {
        if (usarTreeMap) {
            this.empleados = new TreeMap<>();  
        } else {
            this.empleados = new HashMap<>();  
        }
    }

    @Override
    public void add(Empleado emp) {
        empleados.put(emp.getId(), emp);
        System.out.println("Empleado agregado: " + emp);
    }

    @Override
    public void list() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            empleados.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())  // Ordena por ID
                .forEach(entry -> System.out.println(entry.getValue()));
        }
    }

    @Override
    public void remove(int id) {
        Empleado emp = empleados.remove(id);
        if (emp != null) {
            System.out.println("Empleado eliminado: " + emp);
        } else {
            System.out.println("No se encontró un empleado con ID: " + id);
        }
    }

    public Empleado getById(int id) {
        Empleado emp = empleados.get(id);
        if (emp != null) {
            System.out.println("Empleado encontrado: " + emp);
        } else {
            System.out.println("No se encontró un empleado con ID: " + id);
        }
        return emp;
    }
    public int getEmployeeCount() {
        return empleados.size();
    }

    public static void main(String[] args) {
        EmpleadoDAOHashMap empleadoDAOHashMap = new EmpleadoDAOHashMap(false); // false usa HashMap
        EmpleadoController empleadoControllerHashMap = new EmpleadoController(empleadoDAOHashMap);

        Empleado emp1 = new Empleado(1, "PEDRO", "DEV");
        Empleado emp2 = new Empleado(2, "Pedro", "DEV");
        Empleado emp3 = new Empleado(3, "Juan", "DEV");
        Empleado emp4 = new Empleado(4, "Maria", "DEV");
        Empleado emp5 = new Empleado(5, "jUAN", "DEV");

        empleadoControllerHashMap.agregarEmpleado(emp1);
        empleadoControllerHashMap.agregarEmpleado(emp2);
        empleadoControllerHashMap.agregarEmpleado(emp3);
        empleadoControllerHashMap.agregarEmpleado(emp4);
        empleadoControllerHashMap.agregarEmpleado(emp5);

        System.out.println("Listado de empleados (HashMap):");
        empleadoControllerHashMap.listarEmpleados();

        System.out.println("\nEliminando empleado con ID 2...");
        empleadoControllerHashMap.eliminarEmpleado(2);

        System.out.println("\nListado de empleados después de eliminación (HashMap):");
        empleadoControllerHashMap.listarEmpleados();

        EmpleadoDAOHashMap empleadoDAOTreeMap = new EmpleadoDAOHashMap(true); // true usa TreeMap
        EmpleadoController empleadoControllerTreeMap = new EmpleadoController(empleadoDAOTreeMap);

        empleadoControllerTreeMap.agregarEmpleado(emp1);
        empleadoControllerTreeMap.agregarEmpleado(emp2);
        empleadoControllerTreeMap.agregarEmpleado(emp3);
        empleadoControllerTreeMap.agregarEmpleado(emp4);
        empleadoControllerTreeMap.agregarEmpleado(emp5);

        System.out.println("\nListado de empleados (TreeMap):");
        empleadoControllerTreeMap.listarEmpleados();

        System.out.println("\nEliminando empleado con ID 2...");
        empleadoControllerTreeMap.eliminarEmpleado(2);

        System.out.println("\nListado de empleados después de eliminación (TreeMap):");
        empleadoControllerTreeMap.listarEmpleados();
    }
}
